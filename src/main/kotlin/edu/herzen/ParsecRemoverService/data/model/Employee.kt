package edu.herzen.ParsecRemoverService.data.model

data class Employee(

        val id: String = "",

        val tabNum: String = "",

        val firstName: String = "",

        val lastName: String = "",

        val patronymic: String = "",

        val department: String = "",

        val extraFields: Map<String, String?> = mapOf()){
    constructor(tabNum: String, firstName: String, lastName: String,
                patronymic: String, department: String,
                extraFields: Map<String, String?>)
            : this("", tabNum, firstName, lastName, patronymic, department, extraFields)
}
