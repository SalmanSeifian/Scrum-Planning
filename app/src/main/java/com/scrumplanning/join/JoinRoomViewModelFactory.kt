package com.scrumplanning.join

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class JoinRoomViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(JoinRoomViewModel::class.java)) {
            return JoinRoomViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}