package edu.herzen.ParsecRemoverService.data.service

import edu.herzen.ParsecRemoverService.data.model.Student
import org.springframework.stereotype.Service
import java.util.*

@Service
interface StudentService {

    fun getStudent(student: Student): Optional<Student>

    fun addStudent(student: Student): Optional<Student>

    fun remove(student: Student)

    fun updateStudent(student: Student): Optional<Student>

    fun getAllStudents(): List<Student>

}
