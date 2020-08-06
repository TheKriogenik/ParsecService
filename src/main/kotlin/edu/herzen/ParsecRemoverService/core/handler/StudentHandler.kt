package edu.herzen.ParsecRemoverService.core.handler

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.data.service.StudentService
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.Action
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentActionMessage
import edu.herzen.ParsecRemoverService.web.messaging.producer.MessageProducer
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentHandler: Handler<StudentActionMessage> {

    private final val log = LoggerFactory.getLogger(StudentHandler::class.java)

    @Autowired
    private lateinit var studentService: StudentService

    @Autowired
    private lateinit var photoProducer: MessageProducer<Student>

    @Autowired
    private lateinit var dtoConverter: DtoConverter<StudentDto, Student>

    override fun handle(target: StudentActionMessage) {
        val student = target.student.let(dtoConverter::convert)
        log.info("Handling Student#${student.tabNum}. Action: ${target.action}.")
        when(target.action){
            Action.CREATE -> {
                /*studentService
                        .addStudent(student)
                        .map(photoProducer::send)*/
            }
            Action.UPDATE -> {
                studentService.updateStudent(student)
            }
            Action.DELETE -> {
                //studentService.remove(student)
            }
        }
        log.info("Student#${student.tabNum} handling is finished.")
    }

}
