package com.scrumplanning.joinorcreate

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class JoinOrCreateViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(JoinOrCreateViewModel::class.java)) {
            return JoinOrCreateViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}