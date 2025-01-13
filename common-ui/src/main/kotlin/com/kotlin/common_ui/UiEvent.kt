package com.kotlin.common_ui

sealed class UiEvent<out T>{
    data class Content<T>(val data: T): UiEvent<T>()
    object Loading: UiEvent<Nothing>()
    data class Error(val msg: String): UiEvent<String>()
}