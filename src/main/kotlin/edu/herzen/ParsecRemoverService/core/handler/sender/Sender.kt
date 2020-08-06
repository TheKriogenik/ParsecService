package edu.herzen.ParsecRemoverService.core.handler.sender

interface Sender<T>: Runnable{

    override fun run() {
        sendAll()
    }

    fun sendAll()

}
