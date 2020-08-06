package edu.herzen.ParsecRemoverService.data.service

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.data.repository.StudentRepository
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@SpringBootTest
@RunWith(SpringRunner::class)
class StudentServiceTest {

    @Autowired
    private lateinit var service: StudentService

    @MockBean
    private lateinit var repository: StudentRepository

    val student = Student("123456",
            "TestFirstName",
            "TestLastName",
            "TestPatronymic",
            "TestInstituteName",
            mapOf("Должность" to "Cтудент (ОБ)",
                    "Состояние" to "Учится"),
            "123")

    @Test
    fun `Add student without errors`(){
        Mockito.`when`(repository.addStudent(student)).thenReturn(Optional.of(student))
        val result = service.addStudent(student)
        Assert.assertEquals(Optional.of(student), result)
        Mockito.verify(repository).addStudent(student)
    }

    @Test
    fun `Add student with error`(){
        Mockito.`when`(repository.addStudent(student)).thenReturn(Optional.empty())
        val result = service.addStudent(student)
        Assert.assertEquals(Optional.empty<Student>(), result)
        Mockito.verify(repository).addStudent(student)
    }

    @Test
    fun `Get existent student`(){
        Mockito.`when`(with(student){repository.findStudent(tabNum, firstName, lastName, patronymic)})
                .thenReturn(Optional.of(student))
        val result = service.getStudent(student)
        Assert.assertEquals(Optional.of(student), result)
        with(student){Mockito.verify(repository).findStudent(tabNum, firstName, lastName, patronymic)}
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Get nonexistent student`(){
        Mockito.`when`(with(student){repository.findStudent(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.empty())
        val result = service.getStudent(student)
        Assert.assertEquals(Optional.empty<Student>(), result)
        with(student){Mockito.verify(repository).findStudent(tabNum, firstName, lastName, patronymic)}
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Remove existent student`(){
        Mockito.`when`(with(student){repository.findStudent(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.of(student))
        Mockito.doNothing().`when`(repository).remove(student)
        service.remove(student)
        with(student){Mockito.verify(repository).findStudent(tabNum, firstName, lastName, patronymic)}
        Mockito.verify(repository).remove(student)
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Remove nonexistent student`(){
        Mockito.`when`(with(student){repository.findStudent(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.empty())
        service.remove(student)
        with(student){Mockito.verify(repository).findStudent(tabNum, firstName, lastName, patronymic)}
        Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Update existent student`(){
        Mockito.`when`(with(student){repository.findStudent(tabNum, firstName, lastName, patronymic)}).thenReturn(Optional.of(student))
        Mockito.`when`(repository.updateStudent(student)).thenReturn(Optional.of(student))
        val result = service.updateStudent(student)
        Assert.assertEquals(Optional.of(student), result)
        //with(student){Mockito.verify(repository).findStudent(tabNum, firstName, lastName, patronymic)}
        Mockito.verify(repository).updateStudent(student)
        //Mockito.verifyNoMoreInteractions(repository)
    }

    @Test
    fun `Get all students`(){
        val students = (0..10).map{Student(it.toString())}
        Mockito.`when`(repository.getAll()).thenReturn(students)
        val result = service.getAllStudents()
        Assert.assertEquals(students, result)
        Mockito.verify(repository).getAll()
        Mockito.verifyNoMoreInteractions(repository)
    }

}
