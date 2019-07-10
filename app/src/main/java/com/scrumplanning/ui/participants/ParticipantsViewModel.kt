package com.scrumplanning.ui.participants

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParticipantsViewModel : ViewModel() {


    private val _participants = MutableLiveData<List<Participant>>()

    val participants: LiveData<List<Participant>>
        get() = _participants
}