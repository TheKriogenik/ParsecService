/*
package edu.herzen.ParsecRemoverService.core.handler

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.data.service.StudentService
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.Action
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentActionMessage
import edu.herzen.ParsecRemoverService.web.model.dto.StudentDto
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class StudentHandlerTest {

    private final val log = LoggerFactory.getLogger(StudentHandlerTest::class.java)

    @Autowired
    private lateinit var handler: Handler<StudentActionMessage>

    @MockBean
    private lateinit var service: StudentService

    @Autowired
    private lateinit var dtoConverter: DtoConverter<StudentDto, Student>

    @Test
    fun `Handle "CREATE" message`(){
        val student = Student("123456", "TestFirstName", "TestLastName", "TestPatronymic",
                "TestInstituteName", mapOf(), "123")
        handler.handle(StudentActionMessage(Action.CREATE, student.let(dtoConverter::backConvert)))
        Mockito.verify(service).addStudent(student)
        Mockito.verifyNoMoreInteractions(service)
    }

    @Test
    fun `Handle "UPDATE" message`(){
        val student = Student("123456", "TestFirstName", "TestLastName", "TestPatronymic",
                "TestInstituteName", mapOf(), "123")
        handler.handle(StudentActionMessage(Action.UPDATE, student.let(dtoConverter::backConvert)))
        Mockito.verify(service).updateStudent(student)
        Mockito.verifyNoMoreInteractions(service)
    }

    @Test
    fun `Handle "DELETE" message`(){
        val student = Student("123456", "TestFirstName", "TestLastName", "TestPatronymic",
                "TestInstituteName", mapOf(), "123")
        handler.handle(StudentActionMessage(Action.DELETE, student.let(dtoConverter::backConvert)))
        Mockito.verify(service).remove(student)
        Mockito.verifyNoMoreInteractions(service)
    }

}*/
