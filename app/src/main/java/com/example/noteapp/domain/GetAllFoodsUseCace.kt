package com.example.noteapp.domain

import com.example.noteapp.data.models.FoodModel

interface GetAllFoodsUseCace {
 fun getAllFoods ():List<FoodModel>
}