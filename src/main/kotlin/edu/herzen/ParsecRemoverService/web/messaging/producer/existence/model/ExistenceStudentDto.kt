package edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model

import com.google.gson.annotations.SerializedName
import edu.herzen.ParsecRemoverService.data.model.EducationForm
import edu.herzen.ParsecRemoverService.data.model.EducationLevel
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.StudentDto

data class ExistenceStudentDto(
    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("first_name")
    val firstName: String = "",

    @SerializedName("second_name")
    val secondName: String = "",

    @SerializedName("patronymic")
    val patronymic: String = "",

    @SerializedName("education_form")
    val educationForm: String = "-",

    @SerializedName("education_level")
    val educationLevel: String = "-",

    @SerializedName("institute_name")
    val instituteName: String = ""
){
    constructor(dto: StudentDto): this(dto.id,
            dto.firstName,
            dto.secondName,
            dto.patronymic,
            dto.educationForm,
            dto.educationLevel,
            dto.instituteName)
}
