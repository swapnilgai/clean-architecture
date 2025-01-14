package com.kotlin.common_ui

import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

abstract class BaseFragment<T> : Fragment() {
    abstract val viewMode: BaseViewModel<T>
    private var currentScope : CoroutineScope ?= null
    abstract fun render(data: T)

    private fun observe(){
        viewLifecycleOwner.lifecycleScope.launch {
           viewMode.uiFlow.viewState.collect { state ->
               when (state) {
                   is UiEvent.Content -> {
                       handleContent(state.data )
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
        }
    }

    private fun handleContent(data: T){
        setLoading(false)
        render(data)
    }

    private fun setLoading(boolean: Boolean){

    }
}