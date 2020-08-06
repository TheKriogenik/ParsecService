package edu.herzen.ParsecRemoverService.web.converter

import org.springframework.stereotype.Service

@Service
interface DtoConverter<FROM, TO> {

    fun convert(from: FROM): TO

    fun backConvert(to: TO): FROM

}