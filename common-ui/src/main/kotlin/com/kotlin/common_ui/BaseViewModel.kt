package com.kotlin.common_ui

import androidx.annotation.MainThread
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<T>(initContent: T): ViewModel() {
    internal val uiFlow = UiFlowImpl<T>(initContent)

    @MainThread
    protected fun setContent(data: T){
        uiFlow.setContent(data)
    }

    @MainThread
    protected fun setLoading(){
        uiFlow.setLoading()
    }

    @MainThread
    protected fun setError(){
      uiFlow.setError()
    }

}