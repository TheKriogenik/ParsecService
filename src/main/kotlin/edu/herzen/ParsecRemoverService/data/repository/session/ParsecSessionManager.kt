package edu.herzen.ParsecRemoverService.data.repository.session

import edu.herzen.ParsecRemoverService.parsec3intergationservice.IntegrationServiceSoap
import edu.herzen.ParsecRemoverService.parsec3intergationservice.Session

interface ParsecSessionManager {

    fun getSession(): ParsecSession

    fun closeSession()

    fun getParsec(): IntegrationServiceSoap

}