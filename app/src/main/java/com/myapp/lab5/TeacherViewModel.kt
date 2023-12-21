package com.myapp.lab5

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class TeacherViewModel(): ViewModel() {
    val state = MutableStateFlow(TeacherState())

    fun onEvent(event: TeacherEvent) {
        when(event) {
            is TeacherEvent.ShowTeacherInfo -> {
                state.update { it.copy(
                    isShowingInfo = true
                ) }
            }
            TeacherEvent.CloseDialog -> {
                state.update { it.copy(
                    isShowingInfo = false
                ) }
            }
        }
    }
}