package edu.herzen.ParsecRemoverService.web.messaging.listener.model

import com.google.gson.annotations.SerializedName

data class StudentActionMessage(
        @SerializedName("action")
        val action: Action,

        @SerializedName("student")
        val student: StudentDto)