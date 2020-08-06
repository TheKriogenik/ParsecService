package edu.herzen.ParsecRemoverService.web.messaging.listener.model

import com.google.gson.annotations.SerializedName

enum class ProcessAction{
    @SerializedName("START")
    START,
    @SerializedName("STOP")
    STOP
}
