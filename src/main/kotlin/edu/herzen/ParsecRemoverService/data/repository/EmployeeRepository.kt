package edu.herzen.ParsecRemoverService.data.repository

import edu.herzen.ParsecRemoverService.data.model.Employee
import java.util.*

interface EmployeeRepository {

    fun findEmployee(tabNum: String, firstName: String, lastName: String, patronymic: String): Optional<Employee>

    fun addEmployee(employee: Employee): Optional<Employee>

    fun remove(employee: Employee)

    fun getAll(): List<Employee>

    fun updateEmployee(employee: Employee): Optional<Employee>

}