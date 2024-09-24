package com.letier.brandon.notescleanarch.feature_note.presentation.notes.components

sealed class Screen(val route: String) {
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}