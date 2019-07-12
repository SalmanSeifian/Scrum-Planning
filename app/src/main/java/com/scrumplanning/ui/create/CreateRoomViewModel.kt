package com.scrumplanning.ui.create

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.scrumplanning.base.BaseViewModel
import com.scrumplanning.data.remote.ApiInterface
import com.scrumplanning.data.remote.model.CreateRoomRequest
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class CreateRoomViewModel : BaseViewModel() {

    @Inject
    lateinit var apiInterface: ApiInterface

    val loadingVisibility: LiveData<Int>
        get() = _loadingVisibility

    val isCreated: LiveData<Boolean>
        get() = _isCreated


    private var _isCreated = MutableLiveData<Boolean>()

    private var _loadingVisibility = MutableLiveData<Int>()


    fun onRoomCreate(roomTitle: String, roomDescription: String, creatorName: String) {
        compositeDisposable.add(
            apiInterface.createRoom(CreateRoomRequest(roomTitle, roomDescription, creatorName))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { onRequestStart() }
                .doOnTerminate { onRequestFinish() }
                .subscribe({ onRoomCreatedSuccessfully() }, { onFailure() })
        )
    }

    private fun onRequestStart() {
        _loadingVisibility.value = View.VISIBLE
    }

    private fun onRequestFinish() {
        _loadingVisibility.value = View.GONE
    }

    private fun onRoomCreatedSuccessfully() {
        _isCreated.value = true
        _loadingVisibility.value = View.VISIBLE
    }

    private fun onFailure() {
        _isCreated.value = false
        _loadingVisibility.value = View.VISIBLE
    }
}