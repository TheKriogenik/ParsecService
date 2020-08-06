package edu.herzen.ParsecRemoverService.web.converter

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeDto
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class EmployeeConverterTest {

    private final val log = LoggerFactory.getLogger(EmployeeConverterTest::class.java)

    @Autowired
    private lateinit var converter: DtoConverter<EmployeeDto, Employee>

    @Test
    fun `Convert from dto`(){
        val inner = Employee(
                "12345678",
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                "TestDepartment",
                mapOf("Должность" to "TestOccupation",
                        "Состояние" to "Работает")
        )
        val dto = EmployeeDto(
                12345678,
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                "TestOccupation",
                "",
                "TestDepartment"
        )
        Assert.assertEquals(inner, converter.convert(dto))
    }

    @Test
    fun `Convert to dto`(){
        val inner = Employee(
                "12345678",
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                "TestDepartment",
                mapOf("Должность" to "TestOccupation",
                        "Состояние" to "Работает")
        )
        val dto = EmployeeDto(
                12345678,
                "TestFirstName",
                "TestLastName",
                "TestPatronymic",
                "TestOccupation",
                "",
                "TestDepartment"
        )
        Assert.assertEquals(dto, converter.backConvert(inner))
    }


}