package com.mmj.easylocalization.presentation.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mmj.easylocalization.presentation.util.resource.language.getLocal
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    var stateApp by mutableStateOf(MainState())

    fun onEvent(event: MainEvent) {
        when(event) {
            is MainEvent.LanguageChange -> {
                stateApp = stateApp.copy(language = event.language)
            }
        }
    }

}

sealed class MainEvent {
    data class LanguageChange(val language: String): MainEvent()
}

data class MainState(
    val language: String = getLocal(),
)