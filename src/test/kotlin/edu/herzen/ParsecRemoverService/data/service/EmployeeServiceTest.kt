package edu.herzen.ParsecRemoverService.data.service

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.data.repository.EmployeeRepository
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@SpringBootTest
@RunWith(SpringRunner::class)
class EmployeeServiceTest {

    @Autowired
    private lateinit var service: EmployeeService

    @MockBean
    private lateinit var repository: EmployeeRepository

    val employee = Employee(
            "12345678",
            "TestFirstName",
            "TestLastName",
            "TestPatronymic",
            "TestDepartment",
            mapOf("Должность" to "TestOccupation",
                    "Состояние" to "Работает")
    )

    @Test
    fun `Add student without errors`(){
        Mockito.`when`(repository.addEmployee(employee)).thenReturn(Optional.of(employee))
        val result = service.addEmployee(employee)
        Assert.assertEquals(Optional.of(employee), result)
        Mockito.verify(repository).addEmployee(employee)
    }

    @Test
    fun `Add student with error`(){
        Mockito.`when`(repository.addEmployee(employee)).thenReturn(Optional.empty())
        val result = service.addEmployee(employee)
        Assert.assertEquals(Optional.empty<Student>(), result)
        Mockito.verify(repository).addEmployee(employee)
    }

    @Test
    fun `Get existent student`(){
        Mockito.`when`(with(employee){repository.findEmployee(tabNum, firstName, lastName, patronymic)})
                .thenReturn(Optional.of(employee))
        val result = service.getEmployee(employee)
        Assert.assertEquals(Optional.of(employee), result)
        with(employee){Mockito.verify(repository).findEmployee(tabNum, firstName, lastName, patronymic)}
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Get nonexistent student`(){
        Mockito.`when`(with(employee){repository.findEmployee(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.empty())
        val result = service.getEmployee(employee)
        Assert.assertEquals(Optional.empty<Student>(), result)
        with(employee){Mockito.verify(repository).findEmployee(tabNum, firstName, lastName, patronymic)}
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Remove existent student`(){
        Mockito.`when`(with(employee){repository.findEmployee(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.of(employee))
        Mockito.doNothing().`when`(repository).remove(employee)
        service.remove(employee)
        with(employee){Mockito.verify(repository).findEmployee(tabNum, firstName, lastName, patronymic)}
        Mockito.verify(repository).remove(employee)
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Remove nonexistent student`(){
        Mockito.`when`(with(employee){repository.findEmployee(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.empty())
        service.remove(employee)
        with(employee){Mockito.verify(repository).findEmployee(tabNum, firstName, lastName, patronymic)}
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Update existent student`(){
        Mockito.`when`(with(employee){repository.findEmployee(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.of(employee))
        Mockito.`when`(repository.updateEmployee(employee)).thenReturn(Optional.of(employee))
        val result = service.updateEmployee(employee)
        Assert.assertEquals(Optional.of(employee), result)
        with(employee){Mockito.verify(repository).findEmployee(tabNum, firstName, lastName, patronymic)}
        Mockito.verify(repository).updateEmployee(employee)
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Update nonexistent student`(){
        Mockito.`when`(with(employee){repository.findEmployee(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.empty())
        Mockito.`when`(repository.updateEmployee(employee)).thenReturn(Optional.of(employee))
        val result = service.updateEmployee(employee)
        Assert.assertEquals(Optional.empty<Student>(), result)
        with(employee){Mockito.verify(repository).findEmployee(tabNum, firstName, lastName, patronymic)}
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Get all students`(){
        val employees = (0..10).map{Employee(it.toString())}
        Mockito.`when`(repository.getAll()).thenReturn(employees)
        val result = service.getAllEmployees()
        Assert.assertEquals(employees, result)
        Mockito.verify(repository).getAll()
        Mockito.verifyNoMoreInteractions(repository)
    }

}
