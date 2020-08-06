package edu.herzen.ParsecRemoverService.web.messaging.listener.model

import com.google.gson.annotations.SerializedName

data class EmployeeActionMessage(
        @SerializedName("action")
        val action: Action,

        @SerializedName("employee")
        val employee: EmployeeDto)
