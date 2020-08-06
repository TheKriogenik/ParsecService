package edu.herzen.ParsecRemoverService.core.handler

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.data.service.EmployeeService
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.Action
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeActionMessage
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeHandler : Handler<EmployeeActionMessage> {

    private final val log = LoggerFactory.getLogger(EmployeeHandler::class.java)

    @Autowired
    private lateinit var service: EmployeeService

    @Autowired
    private lateinit var dtoConverter: DtoConverter<EmployeeDto, Employee>

    override fun handle(target: EmployeeActionMessage) {
        val employee = target.employee.let(dtoConverter::convert)
        log.info("Handling Employee#${employee.tabNum}. Action: ${target.action}.")
        when(target.action){
            Action.CREATE -> {
                //service.addEmployee(employee)
            }
            Action.UPDATE -> {
                //service.updateEmployee(employee)
            }
            Action.DELETE -> {
                service.remove(employee)
            }
        }
        log.info("Employee#${employee.tabNum} handling is finished.")
    }

}
