package edu.herzen.ParsecRemoverService.data.repository.session

import edu.herzen.ParsecRemoverService.parsec3intergationservice.IntegrationService
import edu.herzen.ParsecRemoverService.parsec3intergationservice.IntegrationServiceSoap
import edu.herzen.ParsecRemoverService.parsec3intergationservice.Session
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ParsecSessionManagerImpl(
        @Value("\${parsec.username}")
        private val userName: String,
        @Value("\${parsec.password}")
        private val password: String
): ParsecSessionManager {

    @Autowired
    private lateinit var domain: String

    private val parsecSoap: IntegrationServiceSoap by lazy {
        IntegrationService().integrationServiceSoap
    }

    override fun getParsec(): IntegrationServiceSoap {
        return parsecSoap
    }

    private var session: Session? = null

    private var activeRequestsCount = 0

    override fun getSession(): ParsecSession {
        if(session == null){
            session = openSession()
        }
        activeRequestsCount += 1
        return createParsecSession(session as Session)
    }

    override fun closeSession() {
        activeRequestsCount -= 1
    }

    @Scheduled(fixedDelay = 120_000L)
    private fun checkSessionTime(){
        if(activeRequestsCount == 0){
            session = null
        }
    }

    private fun openSession(): Session = parsecSoap.openSession(domain, userName, password).value

    private fun createParsecSession(session: Session) = ParsecSession(session.sessionID, this)
}

