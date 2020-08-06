package edu.herzen.ParsecRemoverService.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Student(

        val id: String = "",

        val tabNum: String = "",

        val firstName: String = "",

        val lastName: String = "",

        val patronymic: String = "",

        val instituteName: String = "",

        val extraFields: Map<String, String?> = mapOf(),

        val bookNum: String = ""){
    constructor(tabNum: String,
                firstName: String, lastName: String, patronymic: String,
                instituteName: String, extraFields: Map<String, String?>,
                bookNum: String)
            : this("", tabNum, firstName, lastName, patronymic, instituteName, extraFields, bookNum)
}