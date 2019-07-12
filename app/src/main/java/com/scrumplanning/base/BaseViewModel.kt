package com.scrumplanning.base

import androidx.lifecycle.ViewModel
import com.scrumplanning.data.remote.ApiInterface
import com.scrumplanning.di.component.DaggerViewModelComponent
import com.scrumplanning.di.component.ViewModelComponent
import com.scrumplanning.di.module.NetworkModule
import com.scrumplanning.ui.create.CreateRoomViewModel
import com.scrumplanning.utils.BASE_URL
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {

    var compositeDisposable: CompositeDisposable = CompositeDisposable()
    private val viewModelComponent: ViewModelComponent = DaggerViewModelComponent
        .builder()
        .networkModule(NetworkModule(BASE_URL))
        .build()

    init {
        inject()
    }

    private fun inject() {

        when (this) {
            is CreateRoomViewModel -> viewModelComponent.inject(this)
        }
    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }


}