package edu.herzen.ParsecRemoverService.web.messaging.producer.existence.model

import com.google.gson.annotations.SerializedName
import edu.herzen.ParsecRemoverService.web.messaging.listener.model.EmployeeDto

data class ExistenceEmployeeDto(
        @SerializedName("id")
        val employeeNumber: Int = 0,

        @SerializedName("firstName")
        val firstName: String = "",

        @SerializedName("lastName")
        val secondName: String = "",

        @SerializedName("patronymic")
        val patronymic: String = "",

        @SerializedName("position")
        val occupation: String = "",

        @SerializedName("department")
        val department: String = ""
){
    constructor(dto: EmployeeDto): this(
            employeeNumber = dto.employeeNumber,
            firstName      = dto.firstName,
            secondName     = dto.secondName,
            patronymic     = dto.patronymic,
            occupation     = dto.occupation,
            department     = dto.department
    )
}