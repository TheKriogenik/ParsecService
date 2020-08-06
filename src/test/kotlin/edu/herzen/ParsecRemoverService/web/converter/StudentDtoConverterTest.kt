package edu.herzen.ParsecRemoverService.web.converter

import edu.herzen.ParsecRemoverService.data.model.EducationForm
import edu.herzen.ParsecRemoverService.data.model.EducationLevel
import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentDto
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class StudentDtoConverterTest {

    private final val log = LoggerFactory.getLogger(StudentDtoConverterTest::class.java)

    @Autowired
    private lateinit var converter: DtoConverter<StudentDto, Student>

    @Test
    fun `Convert to fields`(){
        val dto = StudentDto(
                123456,
                "",
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                EducationForm.FULL_TIME.asChar.toString(),
                EducationLevel.BACCALAUREATE.asChar.toString(),
                "TestInstituteName",
                "123"
        )
        val inner = Student("123456",
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                "TestInstituteName",
                mapOf("Должность" to "Cтудент (ОБ)",
                        "Состояние" to "Учится"),
                "123")
        Assert.assertEquals(inner ,converter.convert(dto))
    }

    @Test
    fun `Convert from fields`(){
        val dto = StudentDto(
                123456,
                "",
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                EducationForm.FULL_TIME.asChar.toString(),
                EducationLevel.BACCALAUREATE.asChar.toString(),
                "TestInstituteName",
                "123"
        )
        val inner = Student("123456",
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                "TestInstituteName",
                mapOf("Должность" to "Cтудент (ОБ)",
                        "Состояние" to "Учится"),
                "123")
        Assert.assertEquals(dto, converter.backConvert(inner))
    }


}