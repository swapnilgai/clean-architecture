package com.kotlin.common_ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun <T>BaseView(viewModel: BaseViewModel<T>,
                currentContent: @Composable () -> Unit,
                setContent: (T) -> Unit){

    val viewState = viewModel.uiFlow.viewState.collectAsStateWithLifecycle()

    when (val state = viewState.value) {
        is UiEvent.Content -> {
           state.data
        }
        is UiEvent.Error -> {
            state.msg
        }
        is UiEvent.Loading -> {
        }
        else -> {
        }
    }
}