package com.example.noteapp.presentetion.main_screen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.noteapp.R
import com.example.noteapp.databinding.FragmentMainScreenBinding
import com.example.noteapp.presentetion.FoodAdapter

class main_screen_Fragment : Fragment() {

    private val binding: FragmentMainScreenBinding by lazy {
        FragmentMainScreenBinding.inflate(layoutInflater)
    }
    private lateinit var viewModel: mainScreenViewModel

    private val adapter: FoodAdapter by lazy {
        FoodAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[mainScreenViewModel::class.java]
        viewModel.foodLifeData.observe(viewLifecycleOwner) { foodList ->
            Log.d("222","ddd")
            FoodAdapter()
            adapter.updateList(foodList)
            binding.recyclerView.adapter = adapter

        }
    }
}