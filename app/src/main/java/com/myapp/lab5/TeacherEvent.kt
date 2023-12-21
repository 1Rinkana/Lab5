package com.myapp.lab5

sealed interface TeacherEvent {
    data object ShowTeacherInfo: TeacherEvent
    data object CloseDialog: TeacherEvent
}
