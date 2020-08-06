package edu.herzen.ParsecRemoverService.data.repository

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.data.repository.session.ParsecSessionManager
import edu.herzen.ParsecRemoverService.parsec3intergationservice.*
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*


@Service
class ParsecStudentRepository: StudentRepository {

    @Autowired
    private lateinit var parsecSessionManager: ParsecSessionManager

    private final val log = LoggerFactory.getLogger(ParsecStudentRepository::class.java)

    val parsec: IntegrationServiceSoap by lazy{
        parsecSessionManager.getParsec()
    }

    private fun <T> T?.toOptional(): Optional<T> = Optional.ofNullable(this)

    override fun findStudent(tabNum: String, firstName: String?, lastName: String?, patronymic: String?): Optional<Student> {
        return parsecSessionManager.getSession().use{ session ->
            log.debug("Finding student firstName=$firstName, lastName=$lastName, patronymic=$patronymic.")
            parsec.findPeople(session.sessionID, lastName, firstName, patronymic).person
                    .find{ it.tabnum == tabNum }
                    .toOptional()
                    .flatMap{person ->
                        person.toStudent(session.sessionID)
                    }
        }
    }

    private fun setExtraFields(student: Student, sessionID: String, studentID: String){
        log.debug("Setting extra fields for Student#${student.tabNum}.")
        parsecSessionManager.getSession().let{ session ->
            parsec.openPersonEditingSession(sessionID, studentID).value.toOptional()
                    .map{pesID ->
                        val templates = parsec.getPersonExtraFieldTemplates(sessionID)
                                .personExtraFieldTemplate
                        student.extraFields.forEach{(name, value) ->
                            templates.find{
                                it.name == name
                            }.toOptional().map{template ->
                                log.debug("Setting ${template.name} to $value.")
                                parsec.setPersonExtraFieldValue(pesID, template.id, value)
                            }
                        }.also {
                            parsecSessionManager.closeSession()
                        }
                    }
        }
        log.debug("Setting extra fields for Student#${student.tabNum} is done.")
    }

    override fun addStudent(student: Student): Optional<Student> {
        log.debug("Adding Student#${student.tabNum}.")
        return parsecSessionManager.getSession().use{ session ->
            student.toPerson(session.sessionID).flatMap {person ->
                val result = parsec.createPerson(session.sessionID, person)
                when(result.result){
                    0 -> {
                        with(student){findStudent(tabNum, firstName, lastName, patronymic)}
                                .flatMap {
                                    log.debug("Student find: $it")
                                    setExtraFields(student, session.sessionID, it.id)
                                    with(it){
                                        findStudent(tabNum, firstName, lastName, patronymic)}.map{student ->
                                        student.copy(bookNum = student.bookNum)
                                    }
                                }
                    }
                    else -> Optional.empty<Student>().also{
                        log.error("Error with adding Student#${student.tabNum}!\n" +
                                "Message: ${result.errorMessage}.")
                    }
                }
            }
        }
    }

    override fun remove(student: Student) {
        log.debug("Removing Student#${student.tabNum}.")
        parsecSessionManager.getSession().use{ session ->
            Optional.ofNullable(parsec.findPeople(session.sessionID, student.lastName, student.firstName, student.patronymic).person
                    .filter{
                        it.tabnum == student.tabNum
                    }[0].id).map{
                parsec.deletePerson(session.sessionID, it)
            }
            log.debug("Removing of Student#${student.tabNum} is finished.")
        }
    }


    override fun getAll(): List<Student> {
        log.debug("Finding of all students.")
        return parsecSessionManager.getSession().use{ session ->
            val orgs = parsec.getOrgUnitsHierarhy(session.sessionID)
                    .orgUnit
                    .filter {
                        it.desc.first() != '!'
                    }
            val personsWithOrgName = orgs.map{ org ->
                (parsec.getOrgUnitSubItems(session.sessionID, org.id).baseObject
                        .filterIsInstance<BasePerson>().toList() to org.desc)
            } as List<Pair<List<BasePerson>, String>>
            personsWithOrgName.flatMap{ (persons, orgName) ->
                persons
                        .filter { it.tabnum.toString().length <= 6 }
                        .map{person ->
                            with(person){
                                Student(id,
                                        tabnum,
                                        firstname,
                                        lastname,
                                        middlename,
                                        orgName)
                            }
                        }
            }
        }
    }

    private fun Student.toPerson(sessionId: String): Optional<Person> = parsec.getOrgUnitsHierarhy(sessionId)
                .orgUnit
                .firstOrNull {
                    it.name == this.instituteName
                            && it.desc.first() != '!' }
                .toOptional().map { orgUnit ->
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

    private fun BasePerson.toStudent(sessionID: String, organisationName: String, extraFieldsTemplates: List<PersonExtraFieldTemplate>): Optional<Student> = with(this){
        try{
            val extraFields = parsec
                    .getPersonExtraFieldValues(sessionID, this.id)
                    .extraFieldValue
                    .toList()
            Student(id,
                    tabnum,
                    firstname, lastname, middlename,
                    organisationName,
                    extraFields.map{efv ->
                        val res = extraFieldsTemplates.find { it.id == efv.templateid }
                        res?.name.toString() to efv.value?.toString()
                    }.toMap()
            ).toOptional()
        } catch (e: Exception){
            log.error(e.message)
            log.error(e.stackTrace.toString())
            Optional.empty()
        }

    }

    private fun Person.toStudent(sessionID: String): Optional<Student> = with(this){
        val organisationName = parsec.getOrgUnit(sessionID, this.orgid).name
        val extraFieldsTemplates = parsec
                .getPersonExtraFieldTemplates(sessionID)
                .personExtraFieldTemplate
        val extraFields = parsec
                .getPersonExtraFieldValues(sessionID, this.id)
                .extraFieldValue
                .toList()
        Student( id         = id,
                      tabNum     = tabnum,
                      firstName  = firstname,
                      lastName   = lastname,
                      patronymic = middlename,
                      instituteName = organisationName,
                      extraFields = extraFields.map{efv ->
                    val res = extraFieldsTemplates.find { it.id == efv.templateid }
                    res?.name.toString() to efv.value?.toString()
                }.toMap()
        ).toOptional()
    }

    private fun getCurrentName(raw: String): String =
            raw.split("|").let{ lst ->
                when(lst.size){
                    1    -> lst[0]
                    else -> lst[1]
                }
            }

    private fun getOldNames(student: Student): Triple<String?, String?, String?>{

        return listOf(student.firstName, student.lastName, student.patronymic).map{
            when(it.isBlank()){
                true -> null
                else -> it.split("|").first()
            }
        }.let{
            Triple(it[0], it[1], it[2])
        }.also{
            log.info("RESULT: FROM STUDENT $student = $it")
        }
    }

    private fun Student.getUpdatedNamesStudent(): Student {
        return this.copy(
                firstName  = this.firstName.split("|").last(),
                lastName   = this.lastName.split("|").last(),
                patronymic = this.patronymic.split("|").last())
    }

    override fun updateStudent(student: Student): Optional<Student> {
        log.debug("Update Student#${student.tabNum} info.")
        return parsecSessionManager.getSession().let{ session ->
            with(student){
                log.debug("Finding student")
                getOldNames(student).let{(firstName, lastName, patronymic) ->
                    parsec.findPeople(session.sessionID, lastName, firstName, patronymic).person
                }.find{
                    it.tabnum == tabNum
                }.toOptional()
            }.flatMap{
                log.debug("Student find: $it")
                Person()
                parsec.openPersonEditingSession(session.sessionID, it.id)
                        .toOptional()
                        .map(GuidResult::getValue)
                        .flatMap{pesId ->
                            student.getUpdatedNamesStudent().toPerson(session.sessionID).flatMap{person ->
                                log.debug("Saving...")
                                val result = parsec.savePerson(pesId, person)
                                when(result.result){
                                    0 -> {
                                        setExtraFields(student, session.sessionID, student.id)
                                        findStudent(person.tabnum, person.firstname, person.lastname, person.middlename)
                                    }
                                    else -> Optional.empty<Student>().also{
                                        log.error("Error with adding Student#${student.tabNum}!\n" +
                                                "Message: ${result.errorMessage}.")
                                    }
                                }
                            }
                        }
            }.also{
                parsecSessionManager.closeSession()
            }
        }
    }


    fun ByteArray.toEncodedString(): Optional<String>{
        return try{
            Base64.getEncoder().encodeToString(this)
        } catch (e: Exception){
            log.error("Encoding error!")
            null
        }.toOptional()
    }

}
