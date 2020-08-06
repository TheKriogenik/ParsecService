package edu.herzen.ParsecRemoverService.web.messaging.listener

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.core.handler.Handler
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.ProcessAction
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.connection.Message
import org.springframework.data.redis.connection.MessageListener
import org.springframework.stereotype.Service

@Service
class ProcessActionMessageListener: Listener<ProcessAction> {

    private final val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var gson: Gson

    @Autowired
    private lateinit var handler: Handler<ProcessAction>

    override fun onMessage(message: Message, p1: ByteArray?) {
        val actionMessage = gson.fromJson(message.toString(), ProcessAction::class.java)
        log.info("Received model: $actionMessage")
        handler.handle(actionMessage)
    }
}