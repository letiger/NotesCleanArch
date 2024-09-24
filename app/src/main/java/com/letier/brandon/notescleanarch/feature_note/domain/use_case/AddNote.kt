package com.letier.brandon.notescleanarch.feature_note.domain.use_case

import com.letier.brandon.notescleanarch.feature_note.domain.model.InvalidNoteException
import com.letier.brandon.notescleanarch.feature_note.domain.model.NoteEntity
import com.letier.brandon.notescleanarch.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {
    suspend operator fun invoke(noteEntity: NoteEntity) {
        @Throws(InvalidNoteException::class)
        if (noteEntity.title.isBlank()) {
            throw InvalidNoteException("Title of the Note cannot be empty!")
        }
        @Throws(InvalidNoteException::class)
        if (noteEntity.content.isBlank()) {
            throw InvalidNoteException("Content of note cannot be empty!")
        }
        repository.insertNote(noteEntity)
    }
}