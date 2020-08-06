package edu.herzen.ParsecRemoverService.web.messaging.producer.existence

import edu.herzen.ParsecRemoverService.web.messaging.producer.MessageProducer
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceStudentDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

@Service
class ExistenceStudentMessageProducer: MessageProducer<ExistenceStudentDto> {

    private final val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var redisTemplate: RedisTemplate<String, ExistenceStudentDto>

    @Value("\${topic.existence.student}")
    private lateinit var topicName: String

    override fun send(x: ExistenceStudentDto) {
        log.info("Sending Existence student ${x.id}.")
        redisTemplate.convertAndSend(topicName, x)
        log.info("Student#${x.id} sending is over.")
    }

}
