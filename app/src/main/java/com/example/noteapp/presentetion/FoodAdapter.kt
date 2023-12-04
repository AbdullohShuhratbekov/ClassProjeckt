package com.example.noteapp.presentetion

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.noteapp.R
import com.example.noteapp.data.models.FoodModel
import com.example.noteapp.databinding.ItameBinding

class FoodAdapter (
): RecyclerView.Adapter<FoodAdapter.FoodViewHoldor>() {

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(movioList: List<FoodModel>){
        foodList.clear()
        foodList.addAll(movioList)
        notifyDataSetChanged()
    }

    val foodList = mutableListOf<FoodModel>()

    inner class FoodViewHoldor(
        private val binding: ItameBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(foodModel: FoodModel) {
            binding.firstFoodTv.text = foodModel.foodName
            binding.secondFoodTv.text = foodModel.foodDescripetion
            binding.thirdFoodTv.text = foodModel.foodPrice

            Glide.
            with(binding.root)
                .load(foodModel.foodImage)
                .into(binding.foodCake)

        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FoodViewHoldor {
        val binding = ItameBinding.bind(
            LayoutInflater.from(parent.context).inflate(
                R.layout.itame,
                parent,
                false
            )
        )
        return FoodViewHoldor(binding)
    }

    override fun getItemCount(): Int = foodList.size

    override fun onBindViewHolder(
        holder: FoodViewHoldor,
        position: Int,
    ) {holder.bind(foodList[position])
    }
}
