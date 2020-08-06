package edu.herzen.ParsecRemoverService.web.converter

import edu.herzen.ParsecRemoverService.data.model.Employee
import edu.herzen.ParsecRemoverService.web.messaging.producer.photo.PersonPhotoDto
import org.springframework.stereotype.Service

@Service
class EmployeePhotoDtoConverter: DtoConverter<PersonPhotoDto, Employee> {

    override fun convert(from: PersonPhotoDto): Employee {
        return Employee(id = from.id)
    }

    override fun backConvert(to: Employee): PersonPhotoDto {
        return PersonPhotoDto(to.id, "")
    }
}