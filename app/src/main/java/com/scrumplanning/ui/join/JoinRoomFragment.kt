package com.scrumplanning.ui.join


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.scrumplanning.R
import com.scrumplanning.databinding.FragmentJoinRoomBinding


class JoinRoomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentJoinRoomBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_join_room, container, false)

        val viewModelFactory = JoinRoomViewModelFactory()

        val joinRoomViewModel = ViewModelProviders.of(this, viewModelFactory).get(JoinRoomViewModel::class.java)

        binding.joinRoomViewModel = joinRoomViewModel

        binding.lifecycleOwner = this
        return binding.root
    }


}
