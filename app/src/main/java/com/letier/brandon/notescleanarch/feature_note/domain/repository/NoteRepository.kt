package com.letier.brandon.notescleanarch.feature_note.domain.repository

import com.letier.brandon.notescleanarch.feature_note.domain.model.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getNotes(): Flow<List<NoteEntity>>
    suspend fun getNoteById(id: Int): NoteEntity?
    suspend fun insertNote(noteEntity: NoteEntity)
    suspend fun deleteNote(noteEntity: NoteEntity)
}