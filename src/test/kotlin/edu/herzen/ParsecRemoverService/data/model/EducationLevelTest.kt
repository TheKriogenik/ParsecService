package edu.herzen.ParsecRemoverService.data.model

import org.junit.Assert.assertEquals
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class EducationLevelTest {

    @Test
    fun `Check "toString()"`(){
        assertEquals("бакалавриат",  EducationLevel.BACCALAUREATE.toString())
        assertEquals("магистратура", EducationLevel.MAGISTRACY.toString())
        assertEquals("специалитет",  EducationLevel.SPECIALIST.toString())
        assertEquals("аспирантура",  EducationLevel.POSTGRADUATE.toString())
        assertEquals("докторантура", EducationLevel.DOCTORAL.toString())
        assertEquals("слушатели",    EducationLevel.LISTENERS.toString())
        assertEquals("",             EducationLevel.NOTHING.toString())
    }

    @Test
    fun `Check "fromString(name)"`(){
        with(EducationLevel){
            assertEquals(EducationLevel.BACCALAUREATE, fromString("бакалавриат"))
            assertEquals(EducationLevel.MAGISTRACY,    fromString("магистратура"))
            assertEquals(EducationLevel.SPECIALIST,    fromString("специалитет"))
            assertEquals(EducationLevel.POSTGRADUATE,  fromString("аспирантура"))
            assertEquals(EducationLevel.DOCTORAL,      fromString("докторантура"))
            assertEquals(EducationLevel.LISTENERS,     fromString("слушатели"))
            assertEquals(EducationLevel.NOTHING,       fromString(""))
        }
    }

    @Test
    fun `Check "fromChar(char)"`(){
        val chars = ('А'..'Я').minus(listOf('Б', 'М', 'С', 'А', 'Д', 'Ш', '-'))
        val index = Random().nextInt(chars.size)
        val randomChar = chars[index]

        with(EducationLevel){
            assertEquals(EducationLevel.BACCALAUREATE, fromChar('Б'))
            assertEquals(EducationLevel.MAGISTRACY,    fromChar('М'))
            assertEquals(EducationLevel.SPECIALIST,    fromChar('С'))
            assertEquals(EducationLevel.POSTGRADUATE,  fromChar('А'))
            assertEquals(EducationLevel.DOCTORAL,      fromChar('Д'))
            assertEquals(EducationLevel.LISTENERS,     fromChar('Ш'))
            assertEquals(EducationLevel.NOTHING,       fromChar('-'))
            assertEquals(EducationLevel.NOTHING,       fromChar(randomChar))
        }
    }

    @Test
    fun `Check "EducationLevel#asChar"`(){
        assertEquals('Б', EducationLevel.BACCALAUREATE.asChar)
        assertEquals('М', EducationLevel.MAGISTRACY.asChar)
        assertEquals('С', EducationLevel.SPECIALIST.asChar)
        assertEquals('А', EducationLevel.POSTGRADUATE.asChar)
        assertEquals('Д', EducationLevel.DOCTORAL.asChar)
        assertEquals('Ш', EducationLevel.LISTENERS.asChar)
        assertEquals(' ', EducationLevel.NOTHING.asChar)
    }

}
