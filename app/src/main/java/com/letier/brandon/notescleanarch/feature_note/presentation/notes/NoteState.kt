package com.letier.brandon.notescleanarch.feature_note.presentation.notes

import com.letier.brandon.notescleanarch.feature_note.domain.model.NoteEntity
import com.letier.brandon.notescleanarch.feature_note.domain.use_case.util.NoteOrder
import com.letier.brandon.notescleanarch.feature_note.domain.use_case.util.OrderType

data class NoteState(
    val notes: List<NoteEntity> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)