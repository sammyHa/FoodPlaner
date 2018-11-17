package com.samimhakimi.foodplaner.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.samimhakimi.foodplaner.R
import com.samimhakimi.foodplaner.ui.models.FoodNutiritionFacts



class FoodAdapter(options: FirestoreRecyclerOptions<FoodNutiritionFacts>) :
        FirestoreRecyclerAdapter<FoodNutiritionFacts, FoodAdapter.FoodHolder>(options) {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): FoodHolder {

        val view :View = LayoutInflater.from(parent.context).inflate(R.layout.layout_search_result_item,parent,false)
        return FoodHolder(view)
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int, model: FoodNutiritionFacts) {

        holder.foodName.text = model.foodName
        //holder.servingSize.text = model.servingSize.toString()
        holder.calories.text = model.calories.toString()

    }



    inner class FoodHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //lateinit var servingSize: TextView
        var foodName: TextView
        var calories: TextView
        init {
            foodName = itemView.findViewById(R.id.search_result_food_name)
            calories = itemView.findViewById(R.id.search_item_cal_count)
        }



    }


}