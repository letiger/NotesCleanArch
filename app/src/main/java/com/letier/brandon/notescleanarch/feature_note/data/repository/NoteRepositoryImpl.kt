package com.letier.brandon.notescleanarch.feature_note.data.repository

import com.letier.brandon.notescleanarch.feature_note.data.local.NoteDao
import com.letier.brandon.notescleanarch.feature_note.domain.model.NoteEntity
import com.letier.brandon.notescleanarch.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<NoteEntity>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): NoteEntity? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(noteEntity: NoteEntity) {
        dao.insertNote(noteEntity)
    }

    override suspend fun deleteNote(noteEntity: NoteEntity) {
        dao.deleteNote(noteEntity)
    }
}