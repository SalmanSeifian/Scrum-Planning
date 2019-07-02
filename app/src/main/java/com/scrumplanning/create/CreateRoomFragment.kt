package com.scrumplanning.create


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.scrumplanning.R
import com.scrumplanning.databinding.FragmentCreateRoomBinding


class CreateRoomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentCreateRoomBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_create_room, container, false)

        val viewModelFactory = CreateRoomViewModelFactory()

        val createRoomViewModel = ViewModelProviders.of(this, viewModelFactory).get(CreateRoomViewModel::class.java)

        binding.createRoomViewModel = createRoomViewModel
        binding.lifecycleOwner = this

        return binding.root
    }


}
