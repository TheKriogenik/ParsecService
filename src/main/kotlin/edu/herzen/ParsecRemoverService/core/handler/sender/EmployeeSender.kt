package edu.herzen.ParsecRemoverService.core.handler.sender

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.data.service.EmployeeService
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeDto
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceEmployeeDto
import edu.herzen.ParsecRemoverService.web.messaging.producer.MessageProducer
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeSender: Sender<Employee> {

    private final val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var messageProducer: MessageProducer<ExistenceEmployeeDto>

    @Autowired
    private lateinit var service: EmployeeService

    @Autowired
    private lateinit var converter: DtoConverter<EmployeeDto, Employee>

    override fun sendAll() {
        service
                .getAllEmployees().also{log.debug("All employees: ${it.size}")}
                .map(converter::backConvert)
                .map(::ExistenceEmployeeDto)
                .forEach{
                    Thread.sleep(10L)
                    messageProducer.send(it)
                }
        ExistenceEmployeeDto(employeeNumber = -1)
                .let(messageProducer::send)
    }
}