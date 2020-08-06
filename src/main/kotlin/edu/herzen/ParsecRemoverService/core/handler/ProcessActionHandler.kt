package edu.herzen.ParsecRemoverService.core.handler

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.core.handler.sender.Sender
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.ProcessAction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProcessActionHandler: Handler<ProcessAction> {

    @Autowired
    private lateinit var employeeSender: Sender<Employee>

    @Autowired
    private lateinit var studentSender: Sender<Student>

    override fun handle(target: ProcessAction) {
        when(target){
            ProcessAction.START -> employeeSender.sendAll().let{
                studentSender.sendAll()
            }
            /*ProcessAction.START -> {
                Thread(employeeSender).start()
                Thread(studentSender).start()
            }*/
            ProcessAction.STOP -> {}
        }
    }

}
