package com.letier.brandon.notescleanarch.feature_note.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.letier.brandon.notescleanarch.feature_note.domain.model.NoteEntity

@Database(
    entities = [NoteEntity::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = " notes_db"
    }
}