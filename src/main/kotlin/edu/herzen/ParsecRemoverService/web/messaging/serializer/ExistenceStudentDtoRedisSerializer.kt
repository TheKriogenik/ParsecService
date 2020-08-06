package edu.herzen.ParsecRemoverService.web.messaging.serializer

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceStudentDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.serializer.RedisSerializer
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class ExistenceStudentDtoRedisSerializer: RedisSerializer<ExistenceStudentDto> {


    @Autowired
    private lateinit var gson: Gson

    override fun serialize(dto: ExistenceStudentDto?): ByteArray? {
        return gson.toJson(dto).toByteArray()
    }

    override fun deserialize(bytes: ByteArray?): ExistenceStudentDto? {
        return gson.fromJson(bytes?.toString(), ExistenceStudentDto::class.java)
    }

}
