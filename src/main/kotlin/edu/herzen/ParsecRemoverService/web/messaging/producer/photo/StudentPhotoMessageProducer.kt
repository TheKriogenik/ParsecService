package edu.herzen.ParsecRemoverService.web.messaging.producer.photo

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.producer.MessageProducer
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

@Service
class StudentPhotoMessageProducer: MessageProducer<Student> {

    private final val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var redisTemplate: RedisTemplate<String, PersonPhotoDto>

    @Autowired
    private lateinit var converter: DtoConverter<PersonPhotoDto, Student>

    @Value("\${photo.topic}")
    private lateinit var topicName: String

    fun send(x: PersonPhotoDto) = redisTemplate.convertAndSend(topicName, x)

    override fun send(x: Student) {
        log.info("Publishing PhotoMessage for Student#${x.tabNum} in topic $topicName")
        x
                .let(converter::backConvert).also{log.info("CONVERTED: $it")}
                .let(::send)
        log.info("Message for Student#${x.tabNum} published.")
    }

}
