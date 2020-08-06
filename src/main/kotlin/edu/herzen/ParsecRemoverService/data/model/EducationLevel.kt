package edu.herzen.ParsecRemoverService.data.model

import com.google.gson.annotations.SerializedName

enum class EducationLevel: Charable<EducationLevel> {
    @SerializedName("бакалавриат")
    BACCALAUREATE{
        override val asChar = 'Б'
        override fun toString() = "бакалавриат"
    },
    @SerializedName("магистратура")
    MAGISTRACY{
        override val asChar: Char = 'М'
        override fun toString() = "магистратура"
    },
    @SerializedName("специалитет")
    SPECIALIST{
        override val asChar = 'С'
        override fun toString() = "специалитет"
    },
    @SerializedName("аспирантура")
    POSTGRADUATE{
        override val asChar = 'А'
        override fun toString() = "аспирантура"
    },
    @SerializedName("докторантура")
    DOCTORAL{
        override val asChar = 'Д'
        override fun toString() = "докторантура"
    },
    @SerializedName("слушатели")
    LISTENERS{
        override val asChar = 'Ш'
        override fun toString() = "слушатели"
    },
    @SerializedName("-")
    NOTHING{
        override val asChar = ' '
        override fun toString() = ""
    };

    companion object{

        fun fromChar(char: Char)
                = when(char){
            'Б'  -> BACCALAUREATE
            'М'  -> MAGISTRACY
            'С'  -> SPECIALIST
            'А'  -> POSTGRADUATE
            'Д'  -> DOCTORAL
            'Ш'  -> LISTENERS
            else -> NOTHING
        }

        fun fromString(name: String)
                = when(name){
            "бакалавриат"     -> BACCALAUREATE
            "магистратура" -> MAGISTRACY
            "специалитет"  -> SPECIALIST
            "аспирантура"  -> POSTGRADUATE
            "докторантура" -> DOCTORAL
            "слушатели"    -> LISTENERS
            else           -> NOTHING
        }

    }

}
