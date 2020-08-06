package edu.herzen.ParsecRemoverService.data.service

import edu.herzen.ParsecRemoverService.data.model.Employee
import org.springframework.stereotype.Service
import java.util.*

@Service
interface   EmployeeService {

    fun getEmployee(employee: Employee): Optional<Employee>

    fun addEmployee(employee: Employee): Optional<Employee>

    fun remove(employee: Employee): Unit

    fun updateEmployee(employee: Employee): Optional<Employee>

    fun getAllEmployees(): List<Employee>
}
