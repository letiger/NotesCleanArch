package com.letier.brandon.notescleanarch.feature_note.domain.model

data class NoteEntity(
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
)

class InvalidNoteException(message: String): Exception(message)