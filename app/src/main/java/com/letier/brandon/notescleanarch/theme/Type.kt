package com.letier.brandon.notescleanarch.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

private val DefaultNoteTextStyle = TextStyle.Default.copy(
    platformStyle = PlatformTextStyle(includeFontPadding = false),
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None
    ),
)

val typography = Typography(
    bodySmall = DefaultNoteTextStyle.copy(fontSize = 12.sp),
    bodyMedium = DefaultNoteTextStyle.copy(fontSize = 16.sp),
    bodyLarge = DefaultNoteTextStyle.copy(fontSize = 18.sp),
)