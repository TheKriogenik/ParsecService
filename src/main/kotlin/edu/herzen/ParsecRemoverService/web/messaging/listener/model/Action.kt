package edu.herzen.ParsecRemoverService.web.messaging.listener.model

import com.google.gson.annotations.SerializedName

enum class Action {
    @SerializedName("CREATE")
    CREATE,
    @SerializedName("UPDATE")
    UPDATE,
    @SerializedName("DELETE")
    DELETE
}
