package com.scrumplanning.ui.create

import androidx.lifecycle.ViewModel
import timber.log.Timber

class CreateRoomViewModel() : ViewModel() {


    fun onRoomCreate(roomTitle: String) {
        Timber.d("room $roomTitle")
    }


    override fun onCleared() {
        super.onCleared()
    }
}