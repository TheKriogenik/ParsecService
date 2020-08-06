package edu.herzen.ParsecRemoverService.web.messaging.serializer

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeActionMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.serializer.RedisSerializer
import org.springframework.stereotype.Component

@Component
class EmployeeActionMessageRedisSerializer : RedisSerializer<EmployeeActionMessage> {

    @Autowired
    private lateinit var gson: Gson

    override fun serialize(obj: EmployeeActionMessage?): ByteArray? {
        return gson.toJson(obj).toByteArray()
    }

    override fun deserialize(bytes: ByteArray?): EmployeeActionMessage? {
        return gson.fromJson(bytes?.let { String(it) }, EmployeeActionMessage::class.java)
    }

}
