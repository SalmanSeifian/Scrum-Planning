package com.scrumplanning.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {

    private lateinit var compositeDisposable: CompositeDisposable


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }


}