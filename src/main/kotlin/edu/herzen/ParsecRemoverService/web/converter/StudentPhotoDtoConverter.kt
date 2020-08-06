package edu.herzen.ParsecRemoverService.web.converter

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.web.messaging.producer.photo.PersonPhotoDto
import org.springframework.stereotype.Service

@Service
class StudentPhotoDtoConverter: DtoConverter<PersonPhotoDto, Student> {

    override fun convert(from: PersonPhotoDto): Student {
        return Student(id = from.id, bookNum = from.bookNum)
    }

    override fun backConvert(to: Student): PersonPhotoDto {
        return PersonPhotoDto(id = to.id, bookNum = to.bookNum)
    }
}