package edu.herzen.ParsecRemoverService.web.messaging.listener

import org.springframework.data.redis.connection.MessageListener

interface Listener<T>: MessageListener {
}