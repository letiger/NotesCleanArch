package com.letier.brandon.notescleanarch.feature_note.domain.use_case

import com.letier.brandon.notescleanarch.feature_note.domain.model.NoteEntity
import com.letier.brandon.notescleanarch.feature_note.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(noteEntity: NoteEntity) {
        repository.deleteNote(noteEntity)
    }
}