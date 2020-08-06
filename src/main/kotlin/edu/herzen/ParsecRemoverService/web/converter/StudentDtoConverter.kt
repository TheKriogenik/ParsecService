package edu.herzen.ParsecRemoverService.web.converter

import edu.herzen.ParsecRemoverService.data.model.EducationForm
import edu.herzen.ParsecRemoverService.data.model.EducationLevel
import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
@Qualifier("studentDtoConverter0")
class StudentDtoConverter: DtoConverter<StudentDto, Student> {

    private final val log = LoggerFactory.getLogger(StudentDtoConverter::class.java)

    override fun convert(from: StudentDto): Student {
        log.debug("Convert StudentDto#${from.id} to Student.")
        val studentString = "Cтудент" // Чтобы не забыть ошибку
        val result = Student("",
                from.id.toString(),
                from.firstName,
                from.secondName,
                from.patronymic,
                from.instituteName,
                mapOf("Должность" to "$studentString (${from.educationForm.first()}${from.educationLevel.first()})",
                        "Состояние" to "Учится"),
                from.bookNum)
        log.debug("Student#${result.tabNum} successfully converted.")
        return result
    }

    override fun backConvert(to: Student): StudentDto {
        log.info("Convert Student#${to.tabNum} to StudentDto. Student: $to")
        val tabNum = when(to.tabNum){
            "" -> 0
            else -> to.tabNum.toInt()
        }
        log.info("Parse extraFields: ${to.extraFields}")
        val (rawForm, rawLevel) = to.extraFields["Должность"]?.
                dropWhile{ it != '('}
                ?.filter { it != '(' || it != ')' }
                ?.drop(1)
                ?.take(2)
                ?.toList() ?: listOf('-', '-')
        val result = StudentDto(tabNum,
                "",
                to.firstName,
                to.lastName,
                to.patronymic,
                rawForm.toString(),
                rawLevel.toString(),
                to.instituteName,
                to.bookNum)
        log.info("StudentDto#${result.id} successfully converted. Result: $result")
        return result
    }

    fun EducationLevel.toChar(): Char =
            when(this){
                EducationLevel.BACCALAUREATE -> 'Б'
                EducationLevel.MAGISTRACY    -> 'М'
                EducationLevel.SPECIALIST    -> 'С'
                EducationLevel.POSTGRADUATE  -> 'А'
                EducationLevel.DOCTORAL      -> 'Д'
                EducationLevel.LISTENERS     -> 'Ш'
                EducationLevel.NOTHING       -> ' '
            }

    fun Char.toEducationLevel(): EducationLevel =
            when(this){
                'Б' ->  EducationLevel.BACCALAUREATE
                'М' ->  EducationLevel.MAGISTRACY
                'С' ->  EducationLevel.SPECIALIST
                'А' ->  EducationLevel.POSTGRADUATE
                'Д' ->  EducationLevel.DOCTORAL
                'Ш' ->  EducationLevel.LISTENERS
                else -> EducationLevel.NOTHING
            }

    fun EducationForm.toChar(): Char =
            when(this){
                EducationForm.FULL_TIME  -> 'О'
                EducationForm.EXTRAMURAL -> 'З'
                EducationForm.PART_TIME  -> 'В'
                EducationForm.NOTHING    -> ' '
            }

    fun Char.toEducationForm(): EducationForm =
            when(this){
                'О'  -> EducationForm.FULL_TIME
                'З'  -> EducationForm.EXTRAMURAL
                'В'  -> EducationForm.PART_TIME
                else -> EducationForm.NOTHING
            }
}