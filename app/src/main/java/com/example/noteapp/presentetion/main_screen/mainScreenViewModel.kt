package com.example.noteapp.presentetion.main_screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.noteapp.data.models.FoodModel
import com.example.noteapp.data.rapository.GetAllFoodsRapositoryimpl
import kotlinx.coroutines.launch

class mainScreenViewModel:ViewModel() {

    private val getAllFoodsUseCace = GetAllFoodsRapositoryimpl()

    val foodLifeData:MutableLiveData<List<FoodModel>> = MutableLiveData()

    init {
        getAllFoods()
    }

    fun getAllFoods() {
        viewModelScope.launch {
           val response = getAllFoodsUseCace.getAllFoods()
            foodLifeData.postValue(response)
        }
    }

}