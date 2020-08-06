package edu.herzen.ParsecRemoverService.web.messaging.listener.model

import com.google.gson.annotations.SerializedName
import edu.herzen.ParsecRemoverService.data.model.EducationForm
import edu.herzen.ParsecRemoverService.data.model.EducationLevel

data class StudentDto(

        @SerializedName("id")
        val id: Int = 0,

        @SerializedName("date")
        val date: String = "",

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
        val instituteName: String = "",

        @SerializedName("book_num")
        val bookNum: String = "",

        @SerializedName("insurance_num")
        val insuranceNum: String = "",

        @SerializedName("email")
        val email: String = ""
)