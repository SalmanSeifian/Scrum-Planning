package com.scrumplanning.ui.create


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
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

        createRoomViewModel.isCreated.observe(this, Observer { value ->
            if (value) {
                findNavController().navigate(CreateRoomFragmentDirections.actionCreateRoomFragmentToMainFragment())
            }
        })


        createRoomViewModel.loadingVisibility.observe(this, Observer {
            binding.btnCreate.visibility = it
        })

        binding.createRoomViewModel = createRoomViewModel

        binding.btnCreate.setOnClickListener {
            createRoomViewModel.onRoomCreate(
                binding.edtRoomTitle.text.toString(),
                binding.edtRoomDescription.text.toString(), binding.edtCreatorName.text.toString()
            )
        }
        binding.lifecycleOwner = this

        return binding.root
    }


}
