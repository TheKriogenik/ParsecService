package edu.herzen.ParsecRemoverService.data.repository.session

import java.io.Closeable

open class ParsecSession(val sessionID: String, private val sessionManager: ParsecSessionManager): Closeable{

    override fun close() {
        sessionManager.closeSession()
    }

}
