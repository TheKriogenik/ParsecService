package edu.herzen.ParsecRemoverService.core.handler

import org.springframework.stereotype.Service

@Service
interface Handler<T> {

    fun handle(target: T)

}
