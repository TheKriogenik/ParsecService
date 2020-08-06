package edu.herzen.ParsecRemoverService.web.messaging.listener.model

import com.google.gson.annotations.SerializedName

data class EmployeeDto(
        @SerializedName("id")
        val employeeNumber: Int = 0,

        @SerializedName("first_name")
        val firstName: String = "",

        @SerializedName("second_name")
        val secondName: String = "",

        @SerializedName("patronymic")
        val patronymic: String = "",

        @SerializedName("position")
        val occupation: String = "",

        @SerializedName("date")
        val date: String = "",

        @SerializedName("department")
        val department: String = "",

        @SerializedName("insurance_num")
        val insuranceNum: String = ""
)