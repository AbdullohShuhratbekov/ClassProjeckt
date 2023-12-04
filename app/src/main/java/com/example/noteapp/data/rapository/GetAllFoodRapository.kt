package com.example.noteapp.data.rapository

import com.example.noteapp.data.models.FoodModel

interface GetAllFoodRapository {
    fun getAllFoods(): List<FoodModel>
}