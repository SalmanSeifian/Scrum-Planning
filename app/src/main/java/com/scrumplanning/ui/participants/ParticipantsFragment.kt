package com.scrumplanning.ui.participants


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.scrumplanning.R
import com.scrumplanning.databinding.FragmentParticipantsBinding


class ParticipantsFragment : Fragment() {

    private lateinit var binding: FragmentParticipantsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_participants, container, false)

        val viewModelFactory = ParticipantsViewModelFactory()

        val participantsViewModel = ViewModelProviders.of(this, viewModelFactory).get(ParticipantsViewModel::class.java)

        val adapter = ParticipantsAdapter()
        binding.rvParticipants.adapter = adapter

        participantsViewModel.participants.observe(this, Observer {
            adapter.participants = it
        })

        return binding.root
    }


}
