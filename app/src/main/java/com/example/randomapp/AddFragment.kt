package com.example.randomapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.randomapp.databinding.FragmentAddBinding

class AddFragment : Fragment() {

    lateinit var binding: FragmentAddBinding
    private val fragmentViewModel: FragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onStart() {
        super.onStart()

        binding.addButton.setOnClickListener {
            val user = User(
                binding.textViewFirstname.text.toString(), binding.textViewLastname.text.toString(),
                binding.textViewSex.text.toString(), binding.textViewAge.text.toString(),
                binding.textViewNationality.text.toString(), binding.textViewId.text.toString(),
                binding.textViewPlaceofbirth.text.toString(), binding.textViewPlaceofresidence.text.toString(),
                binding.textViewZip.text.toString(), binding.textViewZodiac.text.toString(),
                binding.textViewHeight.text.toString(), binding.textViewWeight.text.toString()
            )

            fragmentViewModel.setData(user)
            (activity as MainActivity).binding.viewPager.currentItem = 1
        }
    }
}
