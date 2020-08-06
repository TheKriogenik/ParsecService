package edu.herzen.ParsecRemoverService.web.messaging.producer.photo

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.web.converter.DtoConverter
import edu.herzen.ParsecRemoverService.web.messaging.producer.MessageProducer
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

@Service
class EmployeePhotoMessageProducer(
        private val redisTemplate: RedisTemplate<String, PersonPhotoDto>,
        private val converter: DtoConverter<PersonPhotoDto, Employee>,
        @Value("photo.topic")
        private val topicName: String
): MessageProducer<Employee> {

    private final val log = LoggerFactory.getLogger(this::class.java)

    private fun send(x: PersonPhotoDto) = redisTemplate.convertAndSend(topicName, x)

    override fun send(x: Employee) {
        log.info("Publish PhotoMessage for Employee#${x.tabNum} in topic $topicName.")
        x
                .let(converter::backConvert).also{log.debug("CONVERTED: $it")}
                .let(::send)
        log.info("Message for Student#${x.tabNum} is published.")
    }

}
