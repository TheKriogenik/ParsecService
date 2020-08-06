package edu.herzen.ParsecRemoverService.data.model

import com.google.gson.annotations.SerializedName

enum class EducationForm : Charable<EducationForm> {
    @SerializedName("очная")
    FULL_TIME{
        override val asChar     = 'О'
        override fun toString() = "очная"
    },
    @SerializedName("заочная")
    EXTRAMURAL{
        override val asChar     = 'З'
        override fun toString() = "заочная"
    },
    @SerializedName("очно-заочная")
    PART_TIME{
        override val asChar     = 'В'
        override fun toString() = "очно-заочная"
    },
    @SerializedName("-")
    NOTHING{
        override val asChar     = ' '
        override fun toString() = ""
    };

    companion object {

        fun fromChar(char: Char)
                = when(char){
            'О'  -> FULL_TIME
            'З'  -> EXTRAMURAL
            'В'  -> PART_TIME
            else -> NOTHING
        }

        fun fromString(name: String)
                = when(name){
            "очная"        -> FULL_TIME
            "заочная"      -> EXTRAMURAL
            "очно-заочная" -> PART_TIME
            else           -> NOTHING
        }

    }

}