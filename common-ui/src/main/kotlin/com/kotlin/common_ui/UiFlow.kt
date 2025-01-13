package com.kotlin.common_ui

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface UiFlow<T>{
    fun setContent(data: T)
    fun setLoading()
    fun setError()
}

class UiFlowImpl<T>(intiVal: T) : UiFlow<T> {
    private val _viewState = MutableStateFlow<UiEvent<T>>(UiEvent.Loading)
    val viewState : StateFlow<UiEvent<T>> get() = _viewState

    override fun setContent(data: T) {
        _viewState.tryEmit(UiEvent.Content(data))
    }

    override fun setLoading() {
        _viewState.tryEmit(UiEvent.Loading)
    }

    override fun setError() {
        _viewState.tryEmit(UiEvent.Loading)
    }
}