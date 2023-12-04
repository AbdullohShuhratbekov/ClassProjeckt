package com.example.noteapp.presentetion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.noteapp.R
import com.example.noteapp.data.praferences.UserEnteredSharedPref
import com.example.noteapp.databinding.FragmentOnBordingScreenBinding

class onBordingScreenFragment : Fragment() {

    private val binding: FragmentOnBordingScreenBinding by lazy {
        FragmentOnBordingScreenBinding.inflate(layoutInflater)
    }
    private val sheredPreferences: UserEnteredSharedPref by  lazy {
        UserEnteredSharedPref(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (sheredPreferences.getIsUserFirstSigh(true)){
            findNavController().navigate(
                R.id.action_onBordingScreenFragment_to_main_screen_Fragment
            )
        }else{
            binding.getStertedBtn.setOnClickListener {
                sheredPreferences.getIsUserFirstSigh(true)
                findNavController().navigate(
                    R.id.action_onBordingScreenFragment_to_main_screen_Fragment
                )
            }
        }

        }
    }
