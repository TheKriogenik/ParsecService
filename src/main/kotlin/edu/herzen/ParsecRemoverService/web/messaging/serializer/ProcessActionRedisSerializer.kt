package edu.herzen.ParsecRemoverService.web.messaging.serializer

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.ProcessAction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.serializer.RedisSerializer
import org.springframework.stereotype.Component

@Component
class ProcessActionRedisSerializer: RedisSerializer<ProcessAction> {

    @Autowired
    private lateinit var gson: Gson

    override fun serialize(obj: ProcessAction?): ByteArray? {
        return gson.toJson(obj).toByteArray()
    }

    override fun deserialize(bytes: ByteArray?): ProcessAction? {
        return gson.fromJson(bytes?.let { String(it) }, ProcessAction::class.java)
    }

}
