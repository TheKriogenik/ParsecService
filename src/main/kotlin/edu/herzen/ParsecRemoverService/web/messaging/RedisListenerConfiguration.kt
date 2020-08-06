package edu.herzen.ParsecRemoverService.web.messaging

import edu.herzen.ParsecRemoverService.web.messaging.listener.EmployeeActionMessageListener
import edu.herzen.ParsecRemoverService.web.messaging.listener.Listener
import edu.herzen.ParsecRemoverService.web.messaging.listener.ProcessActionMessageListener
import edu.herzen.ParsecRemoverService.web.messaging.listener.StudentActionMessageListener
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeActionMessage
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.ProcessAction
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentActionMessage
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceEmployeeDto
import edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model.ExistenceStudentDto
import edu.herzen.ParsecRemoverService.web.messaging.producer.photo.PersonPhotoDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.listener.ChannelTopic
import org.springframework.data.redis.listener.RedisMessageListenerContainer
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter
import org.springframework.data.redis.serializer.RedisSerializer

typealias TopicAdapter = Pair<ChannelTopic, MessageListenerAdapter>

@Configuration
@PropertySource(value = ["classpath:listener.properties"])
class RedisListenerConfiguration {

    private final val log = LoggerFactory.getLogger(RedisListenerConfiguration::class.java)

    @Bean
    fun jedisConnectionFactory(
            @Value("\${redis.host}") host: String,
            @Value("\${redis.port}") port: Int): JedisConnectionFactory {
        val cfg = RedisStandaloneConfiguration().apply {
            hostName = host
            this.port = port
        }
        return JedisConnectionFactory(cfg)
    }

    @Bean
    fun personPhotoRedisTemplate(connectionFactory: JedisConnectionFactory,
                                 serializer: RedisSerializer<PersonPhotoDto>): RedisTemplate<String, PersonPhotoDto>{
        val redisTemplate = RedisTemplate<String, PersonPhotoDto>()
        redisTemplate.setConnectionFactory(connectionFactory)
        redisTemplate.valueSerializer = serializer
        return redisTemplate
    }

    @Bean
    fun existenceStudentRedisTemplate(connectionFactory: JedisConnectionFactory,
                                      serializer: RedisSerializer<ExistenceStudentDto>): RedisTemplate<String, ExistenceStudentDto>{
        return RedisTemplate<String, ExistenceStudentDto>().apply{
            setConnectionFactory(connectionFactory)
            valueSerializer = serializer
        }
    }

    @Bean
    fun existenceEmployeeRedisTemplate(connectionFactory: JedisConnectionFactory,
                                       serializer: RedisSerializer<ExistenceEmployeeDto>): RedisTemplate<String, ExistenceEmployeeDto>{
        return RedisTemplate<String, ExistenceEmployeeDto>().apply{
            setConnectionFactory(connectionFactory)
            valueSerializer = serializer
        }
    }

    @Bean
    fun employerTopicAdapter(
            @Value("\${employer.topic}")
            topicName: String,
            subscriber: Listener<EmployeeActionMessage>
    ): TopicAdapter{
        log.info("Creating EmployerTopicAdapter to $topicName")
        return TopicAdapter(ChannelTopic(topicName), MessageListenerAdapter(subscriber))
    }

    @Bean
    fun studentTopicAdapter(
            @Value("\${student.topic}")
            topicName: String,
            subscriber: Listener<StudentActionMessage>
    ): TopicAdapter{
        log.info("Creating StudentTopicAdapter to $topicName")
        return TopicAdapter(ChannelTopic(topicName), MessageListenerAdapter(subscriber))
    }

    @Bean
    fun actionTopicAdapter(
            @Value("\${action.topic}")
            topicName: String,
            subscriber: Listener<ProcessAction>
    ): TopicAdapter{
        log.info("Creating StudentTopicAdapter to $topicName")
        return TopicAdapter(ChannelTopic(topicName), MessageListenerAdapter(subscriber))
    }

    @Bean
    fun redisContainer(topicAdapters: List<TopicAdapter>, connectionFactory: JedisConnectionFactory): RedisMessageListenerContainer {
        val container = RedisMessageListenerContainer()
        container.setConnectionFactory(connectionFactory)
        topicAdapters.forEach{
            container.addMessageListener(it.second, it.first)
        }
        return container
    }

}
