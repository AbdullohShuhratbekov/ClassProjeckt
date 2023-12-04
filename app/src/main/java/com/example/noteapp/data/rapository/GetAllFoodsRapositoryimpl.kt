package com.example.noteapp.data.rapository

import com.example.noteapp.data.fake_data.praferences.hvuylv.food_fakeDatas
import com.example.noteapp.data.models.FoodModel

class GetAllFoodsRapositoryimpl:GetAllFoodRapository {

    override fun getAllFoods(): List<FoodModel> = food_fakeDatas()

}

