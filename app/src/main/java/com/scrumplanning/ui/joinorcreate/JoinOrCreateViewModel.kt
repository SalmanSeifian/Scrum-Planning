package com.scrumplanning.ui.joinorcreate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JoinOrCreateViewModel : ViewModel() {


    private val _navigateToJoinRoomFragment = MutableLiveData<Boolean>()
    private val _navigateToCreateRoomFragment = MutableLiveData<Boolean>()

    val navigateToJoinRoomFragment: LiveData<Boolean>
        get() = _navigateToJoinRoomFragment

    val navigateToCreateRoomFragment: LiveData<Boolean>
        get() = _navigateToCreateRoomFragment


    fun onJoin() {
        _navigateToJoinRoomFragment.value = true
    }

    fun onCreate() {
        _navigateToCreateRoomFragment.value = true
    }


    fun doneNavigation() {
        _navigateToCreateRoomFragment.value = false
        _navigateToJoinRoomFragment.value = false
    }

}