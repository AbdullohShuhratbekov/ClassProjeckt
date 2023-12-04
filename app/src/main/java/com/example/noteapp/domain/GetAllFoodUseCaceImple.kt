package com.example.noteapp.domain

import com.example.noteapp.data.models.FoodModel
import com.example.noteapp.data.rapository.GetAllFoodsRapositoryimpl

class GetAllFoodUseCaceImple : GetAllFoodsUseCace {
    private val foodsRapository = GetAllFoodsRapositoryimpl()
    override  fun getAllFoods(): List<FoodModel> {
        return foodsRapository.getAllFoods()
    }
}