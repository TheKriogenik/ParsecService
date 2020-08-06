package edu.herzen.ParsecRemoverService.web.messaging.producer.existence

import edu.herzen.ParsecRemoverService.web.messaging.producer.MessageProducer
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceEmployeeDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

@Service
class ExistenceEmployeeMessageProducer: MessageProducer<ExistenceEmployeeDto> {

    private final val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var redisTemplate: RedisTemplate<String, ExistenceEmployeeDto>

    @Value("\${topic.existence.employee}")
    private lateinit var topicName: String

    override fun send(x: ExistenceEmployeeDto) {
        log.info("Publish message $x.")
        redisTemplate.convertAndSend(topicName, x)
    }

}
