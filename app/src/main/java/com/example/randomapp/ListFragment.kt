package com.example.randomapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.randomapp.databinding.FragmentListBinding
// import androidx.lifecycle.Observer

class ListFragment : Fragment(R.layout.fragment_list) {
    lateinit var binding: FragmentListBinding
    private val fragmentViewModel: FragmentViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(layoutInflater)

        fragmentViewModel.data.observe(viewLifecycleOwner) { user ->
            binding.users.text = user.toString()
        }

        return binding.root
    }
}