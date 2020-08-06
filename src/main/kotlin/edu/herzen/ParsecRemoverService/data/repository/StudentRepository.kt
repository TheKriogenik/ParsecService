package edu.herzen.ParsecRemoverService.data.repository

import edu.herzen.ParsecRemoverService.data.model.Student
import java.util.*

interface StudentRepository {

    fun findStudent(tabNum: String, firstName: String? = null, lastName: String? = null, patronymic: String? = null): Optional<Student>

    fun addStudent(student: Student): Optional<Student>

    fun remove(student: Student): Unit

    fun getAll(): List<Student>

    fun updateStudent(student: Student): Optional<Student>

}
