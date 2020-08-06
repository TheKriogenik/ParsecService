package edu.herzen.ParsecRemoverService.web.messaging.serializer

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceEmployeeDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.serializer.RedisSerializer
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class ExistenceEmployeeDtoRedisSerializer: RedisSerializer<ExistenceEmployeeDto> {


    @Autowired
    private lateinit var gson: Gson

    override fun serialize(dto: ExistenceEmployeeDto?): ByteArray? {
        return gson.toJson(dto).toByteArray()
    }

    override fun deserialize(bytes: ByteArray?): ExistenceEmployeeDto? {
        return gson.fromJson(bytes?.toString(), ExistenceEmployeeDto::class.java)
    }

}
