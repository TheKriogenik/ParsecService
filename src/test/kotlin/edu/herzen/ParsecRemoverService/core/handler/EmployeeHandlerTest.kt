/*
package edu.herzen.ParsecRemoverService.core.handler

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.data.service.EmployeeService
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.Action
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeActionMessage
import edu.herzen.ParsecRemoverService.web.model.dto.EmployeeDto
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class EmployeeHandlerTest {

    @Autowired
    private lateinit var handler: Handler<EmployeeActionMessage>

    @MockBean
    private lateinit var service: EmployeeService

    @Autowired
    private lateinit var dtoConverter: DtoConverter<EmployeeDto, Employee>

    @Test
    fun `Handle "CREATE" message`(){
        val employee = Employee("123456", "TestFirstName", "TestLastName", "TestPatronymic",
                "TestInstituteName", mapOf())
        handler.handle(EmployeeActionMessage(Action.CREATE, employee.let(dtoConverter::backConvert)))
        Mockito.verify(service).addEmployee(employee)
        Mockito.verifyNoMoreInteractions(service)
    }

    @Test
    fun `Handle "UPDATE" message`(){
        val employee = Employee("123456", "TestFirstName", "TestLastName", "TestPatronymic",
                "TestInstituteName", mapOf())
        handler.handle(EmployeeActionMessage(Action.UPDATE, employee.let(dtoConverter::backConvert)))
        Mockito.verify(service).updateEmployee(employee)
        Mockito.verifyNoMoreInteractions(service)
    }

    @Test
    fun `Handle "DELETE" message`(){
        val employee = Employee("123456", "TestFirstName", "TestLastName", "TestPatronymic",
                "TestInstituteName", mapOf())
        handler.handle(EmployeeActionMessage(Action.DELETE, employee.let(dtoConverter::backConvert)))
        Mockito.verify(service).remove(employee)
        Mockito.verifyNoMoreInteractions(service)
    }

}
*/
