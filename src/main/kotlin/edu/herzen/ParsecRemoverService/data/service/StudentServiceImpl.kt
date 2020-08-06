package edu.herzen.ParsecRemoverService.data.service

import edu.herzen.ParsecRemoverService.data.model.Student
import edu.herzen.ParsecRemoverService.data.repository.StudentRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*
import javax.annotation.Resource

@Service
class StudentServiceImpl: StudentService {

    private final val log = LoggerFactory.getLogger(StudentServiceImpl::class.java)

    @Resource
    private lateinit var repository: StudentRepository

    override fun getStudent(student: Student): Optional<Student> {
        log.info("Finding Student#${student.tabNum}.")
        return with(student){ repository.findStudent(tabNum, firstName, lastName, patronymic) }
    }

    override fun addStudent(student: Student): Optional<Student> {
        log.info("Adding Student#${student.tabNum}.")
        return getStudent(student).map {
            repository.updateStudent(student)
        }.orElseGet{
            repository.addStudent(student)
        }.also{
            log.info("Student#${student.tabNum} added.")
        }
    }

    override fun remove(student: Student) {
        log.info("Removing Student#${student.tabNum}.")
        with(student){ repository.findStudent(tabNum, firstName, lastName, patronymic) }
                .map{ repository.remove(it) }
                .orElse(Unit)
        log.info("Student#${student.tabNum} is removed.")
    }

    override fun updateStudent(student: Student): Optional<Student> {
        log.info("Updating Student#${student.tabNum}.")
        return repository.updateStudent(student)
                .also{
                    log.info("Student#${student.tabNum} is updated.")
                }
    }

    override fun getAllStudents(): List<Student> {
        log.info("Finding of all students.")
        return repository.getAll()
    }

}
