package edu.herzen.ParsecRemoverService.web.messaging.producer

interface MessageProducer<T> {

    fun send(x: T)

}
