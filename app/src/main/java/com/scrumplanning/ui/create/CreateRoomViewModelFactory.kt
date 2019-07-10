package com.scrumplanning.ui.create

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CreateRoomViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CreateRoomViewModel::class.java)) {
            return CreateRoomViewModel() as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }

}