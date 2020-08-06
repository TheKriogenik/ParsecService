package edu.herzen.ParsecRemoverService.web.messaging.serializer

import com.google.gson.Gson
import edu.herzen.ParsecRemoverService.web.messaging.producer.photo.PersonPhotoDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.serializer.RedisSerializer
import org.springframework.stereotype.Component

@Component
class PersonPhotoRedisSerializer : RedisSerializer<PersonPhotoDto> {

    @Autowired
    private lateinit var gson: Gson

    override fun serialize(obj: PersonPhotoDto?): ByteArray? {
        return gson.toJson(obj).toByteArray()
    }

    override fun deserialize(bytes: ByteArray?): PersonPhotoDto? {
        return gson.fromJson(bytes?.let { String(it) }, PersonPhotoDto::class.java)
    }

}
