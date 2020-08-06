package edu.herzen.ParsecRemoverService.core.handler.sender

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.data.service.StudentService
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceStudentDto
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentDto
import edu.herzen.ParsecRemoverService.web.messaging.producer.MessageProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentSender: Sender<Student> {

    @Autowired
    private lateinit var service: StudentService

    @Autowired
    private lateinit var converter: DtoConverter<StudentDto, Student>

    @Autowired
    private lateinit var messageProducer: MessageProducer<ExistenceStudentDto>

    override fun sendAll() {
        service
                .getAllStudents()
                .map(converter::backConvert)
                .map(::ExistenceStudentDto)
                .forEach{
                    Thread.sleep(10L)
                    messageProducer.send(it)
                }
        ExistenceStudentDto(id = -1)
                .let(messageProducer::send)
    }
}