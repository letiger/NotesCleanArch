package com.letier.brandon.notescleanarch.feature_note.domain.use_case

import com.letier.brandon.notescleanarch.feature_note.domain.model.NoteEntity
import com.letier.brandon.notescleanarch.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(private val repository: NoteRepository) {
    operator fun invoke(): Flow<List<NoteEntity>> {
        return repository.getNotes()
    }
}