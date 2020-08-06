package edu.herzen.ParsecRemoverService.data.repository

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.data.repository.session.ParsecSessionManager
import edu.herzen.ParsecRemoverService.parsec3intergationservice.*
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class ParsecEmployeeRepository : EmployeeRepository{

    @Autowired
    private lateinit var parsecSessionManager: ParsecSessionManager

    private final val log = LoggerFactory.getLogger(ParsecEmployeeRepository::class.java)

    val parsec: IntegrationServiceSoap by lazy{
        parsecSessionManager.getParsec()
    }

    override fun findEmployee(tabNum: String, firstName: String, lastName: String, patronymic: String): Optional<Employee> {
        return parsecSessionManager.getSession().use{ session ->
            log.debug("Finding employee firstName=$firstName, lastName=$lastName, patronymic=$patronymic.")
            parsec.findPeople(session.sessionID, lastName, firstName, patronymic).person
                    .find{ it.tabnum == tabNum }
                    .toOptional()
                    .flatMap{person ->
                        person.toEmployee(session.sessionID)
                    }
        }
    }

    override fun updateEmployee(employee: Employee): Optional<Employee> {
        log.debug("Update Employee#${employee.tabNum} info.")
        return parsecSessionManager.getSession().use{ session ->
            with(employee){
                log.debug("Finding employee")
                listOf(firstName, lastName, patronymic)
                        .map{
                            if (it.isBlank()) null else it
                        }
                        .map{
                            when(it){
                                null -> listOf()
                                else -> parsec.findPeople(session.sessionID, lastName, firstName, patronymic).person
                            }
                        }.reduce{acc, x -> acc + x}
                        .find{it.tabnum == tabNum}
                        .toOptional()
            }.flatMap{
                log.debug("Employee find: $it")
                parsec.openPersonEditingSession(session.sessionID, it.id)
                        .toOptional()
                        .map(GuidResult::getValue)
                        .flatMap{pesId ->
                            employee.toPerson(session.sessionID).flatMap{ person ->
                                log.debug("Saving...")
                                val result = parsec.savePerson(pesId, person)
                                when(result.result){
                                    0 -> {
                                        setExtraFields(employee, session.sessionID, employee.id)
                                        with(employee){findEmployee(tabNum, firstName, lastName, patronymic)}
                                    }
                                    else -> Optional.empty<Employee>().also{
                                        log.error("Error with adding Employee#${employee.tabNum}!\n" +
                                                "Message: ${result.errorMessage}.")
                                    }
                                }
                            }
                        }
            }
        }
    }

    override fun addEmployee(employee: Employee): Optional<Employee> {
        log.debug("Adding Employee#${employee.tabNum}.")
        return parsecSessionManager.getSession().use{ session ->
            employee.toPerson(session.sessionID).flatMap { person ->
                val result = parsec.createPerson(session.sessionID, person)
                when(result.result){
                    0 -> {
                        with(employee){findEmployee(tabNum, firstName, lastName, patronymic)}
                                .flatMap {
                                    log.debug("After adding: $it")
                                    setExtraFields(employee, session.sessionID, it.id)
                                    with(it){findEmployee(tabNum, firstName, lastName, patronymic)}
                                }
                    }
                    else -> Optional.empty<Employee>().also{
                        log.error("Error with adding Employee#${employee.tabNum}!\n" +
                                "Message: ${result.errorMessage}.")
                    }
                }
            }
        }
    }

    override fun remove(employee: Employee) {
        log.debug("Removing Employee#${employee.tabNum}.")
        log.info("EMPLOYEE: $employee")
        parsecSessionManager.getSession().use {session ->
            parsec.findPeople(session.sessionID, employee.lastName, employee.firstName, employee.patronymic).person.also{
                log.info("PERSONS: $it")
            }.firstOrNull {
                it.tabnum == employee.tabNum
            }.let{ Optional.ofNullable(it) }.map { person ->
                parsec.deletePerson(session.sessionID, person.id)
            }
            log.debug("Removing of Employee#${employee.tabNum} is finished.")
        }
    }

    override fun getAll(): List<Employee> {
        return parsecSessionManager.getSession().use{ session ->
            val orgs = parsec.getOrgUnitsHierarhy(session.sessionID)
                    .orgUnit
                    .filter {
                        it.desc.first() != '!'
                    }
            val personsWithOrgName = orgs.map{ org ->
                parsec.getOrgUnitSubItems(session.sessionID, org.id).baseObject
                        .filterIsInstance<BasePerson>().toList() to org.name

            } as List<Pair<List<BasePerson>, String>>
            personsWithOrgName.flatMap{ (persons, orgName) ->
                persons
                        .filter{it.tabnum.toString().length == 8 }
                        .map{person ->
                            with(person){
                                Employee(id,
                                        tabnum,
                                        firstname, lastname, middlename, orgName)
                            }
                        }

            }
        }
    }

    private fun <T> T?.toOptional(): Optional<T> = Optional.ofNullable(this)

    private fun setExtraFields(employee: Employee, sessionID: String, employeeID: String){
        log.debug("Setting extra fields for Employee#${employee.id}.")
        parsec.openPersonEditingSession(sessionID, employeeID).value.toOptional()
                .map{pesID ->
                    val templates = parsec.getPersonExtraFieldTemplates(sessionID)
                            .personExtraFieldTemplate
                    employee.extraFields.forEach{ (name, value) ->
                        templates.find{
                            it.name == name
                        }.toOptional().map{template ->
                            log.debug("Setting ${template.name} to $value.")
                            parsec.setPersonExtraFieldValue(pesID, template.id, value)
                        }
                    }.also {
                        parsec.closePersonEditingSession(pesID)
                    }
                }
        log.debug("Setting extra fields for Employee#${employee.id} is done.")
    }

    fun Employee.toPerson(sessionID: String): Optional<Person> = parsec.getOrgUnitsHierarhy(sessionID)
            .orgUnit
            .firstOrNull {
                it.name == this.department
                        && it.desc.first() != '!' }
            .toOptional().map{ orgUnit ->
                Person().apply {
                    id         = when(this@toPerson.id.isBlank()){
                        true  -> null
                        false -> this@toPerson.id
                    }
                    orgid      = orgUnit.id
                    tabnum     = tabNum
                    firstname  = firstName
                    middlename = patronymic
                    lastname   = lastName
                }
            }

    fun Person.toEmployee(sessionID: String): Optional<Employee> = with(this){
            val organisationName = parsec.getOrgUnit(sessionID, orgid).desc
            val extraFieldsTemplates = parsec
                    .getPersonExtraFieldTemplates(sessionID)
                    .personExtraFieldTemplate
            val extraFields = parsec
                    .getPersonExtraFieldValues(sessionID, id)
                    .extraFieldValue
                    .toList()
            Employee(id,
                    tabnum,
                    firstname, lastname, middlename,
                    organisationName,
                    extraFields.map{efv ->
                        val res = extraFieldsTemplates.find { it.id == efv.templateid }
                        res?.name.toString() to efv.value?.toString()
                    }.toMap()
            ).toOptional()
        }

}