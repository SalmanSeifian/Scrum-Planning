package com.scrumplanning.joinorcreate

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
import com.scrumplanning.databinding.FragmentJoinOrCreateBinding

class JoinOrCreateFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentJoinOrCreateBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_join_or_create,
            container, false
        )

        val viewModelFactory = JoinOrCreateViewModelFactory()

        val joinOrCreateViewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(JoinOrCreateViewModel::class.java)

        binding.joinOrCreateViewModel = joinOrCreateViewModel
        binding.lifecycleOwner = this

        joinOrCreateViewModel.navigateToJoinRoomFragment.observe(this, Observer { t ->
            if (t) {
                this.findNavController()
                    .navigate(JoinOrCreateFragmentDirections.actionJoinOrCreateFragmentToJoinRoomFragment())
            }
        })

        joinOrCreateViewModel.navigateToCreateRoomFragment.observe(this, Observer { t ->
            if (t) {
                this.findNavController()
                    .navigate(JoinOrCreateFragmentDirections.actionJoinOrCreateFragmentToCreateRoomFragment())
            }
        })
        return binding.root
    }

}
