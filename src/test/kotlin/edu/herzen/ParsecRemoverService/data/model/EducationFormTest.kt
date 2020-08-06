package edu.herzen.ParsecRemoverService.data.model

import org.junit.Assert.assertEquals
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class EducationFormTest {

    @Test
    fun `Check "toString()"`(){
        assertEquals("очная",        EducationForm.FULL_TIME.toString())
        assertEquals("заочная",      EducationForm.EXTRAMURAL.toString())
        assertEquals("очно-заочная", EducationForm.PART_TIME.toString())
        assertEquals("",             EducationForm.NOTHING.toString())
    }

    @Test
    fun `Check "fromString(name)"`(){
        with(EducationForm){
            assertEquals(EducationForm.FULL_TIME,  fromString("очная"))
            assertEquals(EducationForm.EXTRAMURAL, fromString("заочная"))
            assertEquals(EducationForm.PART_TIME,  fromString("очно-заочная"))
            assertEquals(EducationForm.NOTHING,    fromString("-"))
        }
    }

    @Test
    fun `Check "fromChar(char)"`(){
        val chars = ('А'..'Я').minus(listOf('О', 'З', 'В'))
        val index = Random().nextInt(chars.size)
        val randomChar = chars[index]

        with(EducationForm){
            assertEquals(EducationForm.FULL_TIME,  fromChar('О'))
            assertEquals(EducationForm.EXTRAMURAL, fromChar('З'))
            assertEquals(EducationForm.PART_TIME,  fromChar('В'))
            assertEquals(EducationForm.NOTHING,    fromChar(' '))
            assertEquals(EducationForm.NOTHING,    fromChar(randomChar))
        }
    }

    @Test
    fun `Check "toChar(EducationForm)"`(){
        assertEquals('О', EducationForm.FULL_TIME.asChar)
        assertEquals('З', EducationForm.EXTRAMURAL.asChar)
        assertEquals('В', EducationForm.PART_TIME.asChar)
        assertEquals(' ', EducationForm.NOTHING.asChar)
    }

}
