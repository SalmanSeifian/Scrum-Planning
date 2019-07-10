package com.scrumplanning.ui.participants

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ParticipantsViewModelFactory: ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ParticipantsViewModel::class.java)){
            return ParticipantsViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}