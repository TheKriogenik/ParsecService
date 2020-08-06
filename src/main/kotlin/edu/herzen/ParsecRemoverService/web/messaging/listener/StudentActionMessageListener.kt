package edu.herzen.ParsecRemoverService.web.messaging.listener

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.core.handler.Handler
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentActionMessage
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.connection.Message
import org.springframework.data.redis.connection.MessageListener
import org.springframework.stereotype.Service

@Service
class StudentActionMessageListener: Listener<StudentActionMessage> {

    private final val log = LoggerFactory.getLogger(StudentActionMessageListener::class.java)

    @Autowired
    private lateinit var gson: Gson

    @Autowired
    private lateinit var handler: Handler<StudentActionMessage>


    override fun onMessage(message: Message, p1: ByteArray?) {
        log.debug("Received message: $message.")
        val actionMessage = gson.fromJson(message.toString(), StudentActionMessage::class.java)
        log.info("Received model: $actionMessage")
        handler.handle(actionMessage)
    }

}
