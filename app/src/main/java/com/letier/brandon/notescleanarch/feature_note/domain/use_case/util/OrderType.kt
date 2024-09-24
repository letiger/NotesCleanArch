package com.letier.brandon.notescleanarch.feature_note.domain.use_case.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}