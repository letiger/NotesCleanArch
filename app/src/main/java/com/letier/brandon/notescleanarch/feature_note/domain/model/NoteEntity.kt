package com.letier.brandon.notescleanarch.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.letier.brandon.notescleanarch.theme.ash
import com.letier.brandon.notescleanarch.theme.blue
import com.letier.brandon.notescleanarch.theme.pale_green
import com.letier.brandon.notescleanarch.theme.pink
import com.letier.brandon.notescleanarch.theme.red
import com.letier.brandon.notescleanarch.theme.violet
import com.letier.brandon.notescleanarch.theme.yellow

@Entity
data class NoteEntity(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
) {
    companion object {
        val noteColors = listOf(yellow, ash, pale_green, blue, pink, violet, red)
    }
}

class InvalidNoteException(message: String): Exception(message)