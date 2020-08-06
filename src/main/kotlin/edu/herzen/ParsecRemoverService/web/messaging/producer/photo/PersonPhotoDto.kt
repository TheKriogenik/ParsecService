package edu.herzen.ParsecRemoverService.web.messaging.producer.photo

import com.google.gson.annotations.SerializedName

data class PersonPhotoDto(
        @SerializedName("id")
        val id: String,
        @SerializedName("book_num")
        val bookNum: String)
