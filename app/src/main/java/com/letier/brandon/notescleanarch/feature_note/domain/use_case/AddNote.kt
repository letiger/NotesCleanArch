package com.letier.brandon.notescleanarch.feature_note.domain.use_case

import com.letier.brandon.notescleanarch.feature_note.domain.model.InvalidNoteException
import com.letier.brandon.notescleanarch.feature_note.domain.model.Note
import com.letier.brandon.notescleanarch.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        @Throws(InvalidNoteException::class)
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title of the Note cannot be empty!")
        }
        @Throws(InvalidNoteException::class)
        if (note.content.isBlank()) {
            throw InvalidNoteException("Content of note cannot be empty!")
        }
        repository.insertNote(note)
    }
}