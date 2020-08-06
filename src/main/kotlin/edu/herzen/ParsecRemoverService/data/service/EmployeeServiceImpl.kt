package edu.herzen.ParsecRemoverService.data.service

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.data.repository.EmployeeRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeServiceImpl: EmployeeService {

    private final val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var repository: EmployeeRepository

    override fun getEmployee(employee: Employee): Optional<Employee> {
        log.info("Finding Employee#${employee.tabNum}.")
        return with(employee){repository.findEmployee(tabNum, firstName, lastName, patronymic)}
    }

    override fun addEmployee(employee: Employee): Optional<Employee> {
        log.info("Adding Employee#${employee.tabNum}.")
        return getEmployee(employee).map{
            repository.updateEmployee(employee)
        }.orElseGet{
            repository.addEmployee(employee)
        }.also{
            log.info("Employee#${employee.tabNum} is added.")
        }
    }

    override fun remove(employee: Employee) {
        log.info("Removing Employee#${employee.tabNum}.")
        getEmployee(employee).map(repository::remove)
        log.info("Employee#${employee.tabNum} is removed.")
    }

    override fun updateEmployee(employee: Employee): Optional<Employee> {
        log.info("Updating Employee#${employee.tabNum}.")
        return with(employee){
            repository.findEmployee(tabNum, firstName, lastName, patronymic)
        }.flatMap{
            repository.updateEmployee(employee)
        }.also{
            log.info("Employee#${employee.tabNum} is added.")
        }
    }

    override fun getAllEmployees(): List<Employee> {
        log.info("Finding of all employees.")
        return repository.getAll()
    }
}