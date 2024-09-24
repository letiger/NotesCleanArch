package com.letier.brandon.notescleanarch.feature_note.presentation.new_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)