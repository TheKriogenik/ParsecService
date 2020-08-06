package edu.herzen.ParsecRemoverService.web.messaging.serializer

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentActionMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.serializer.RedisSerializer
import org.springframework.stereotype.Component

@Component
class StudentActionMessageRedisSerializer: RedisSerializer<StudentActionMessage> {

    @Autowired
    private lateinit var gson: Gson

    override fun serialize(obj: StudentActionMessage?): ByteArray? {
        return gson.toJson(obj).toByteArray()
    }

    override fun deserialize(bytes: ByteArray?): StudentActionMessage? {
        return gson.fromJson(bytes?.let { String(it) }, StudentActionMessage::class.java)
    }

}
