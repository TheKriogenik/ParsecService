package edu.herzen.ParsecRemoverService.web.converter

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeDto
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class EmployeeDtoConverter: DtoConverter<EmployeeDto, Employee> {

    private final val log = LoggerFactory.getLogger(this::class.java)

    override fun convert(from: EmployeeDto): Employee {
        return with(from){
            Employee(employeeNumber.toString(), firstName, secondName, patronymic, department, mapOf("Должность" to occupation,
                    "Состояние" to "Работает"))
        }
    }

    override fun backConvert(to: Employee): EmployeeDto {
        log.debug("Convert Employee#${to.tabNum} to DTO")
        log.debug("Employee: $to")
        log.debug(to.extraFields.toString())
        log.debug(to.extraFields["Должность"].toString())
        return with(to){
            EmployeeDto(tabNum.toInt(), firstName, lastName, patronymic, to.extraFields["Должность"].toString(), "", to.department)
        }
    }
}