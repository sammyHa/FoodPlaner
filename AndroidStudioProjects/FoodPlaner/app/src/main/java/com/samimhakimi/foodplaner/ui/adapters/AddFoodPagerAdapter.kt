package com.samimhakimi.foodplaner.ui.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.samimhakimi.foodplaner.ui.fragments.CreateFoodFragment
import com.samimhakimi.foodplaner.ui.fragments.CreateMealFragment
import com.samimhakimi.foodplaner.ui.fragments.CreateRecipeFragment
import com.samimhakimi.foodplaner.ui.fragments.SearchFoodFragment

class AddFoodPagerAdapter(fm: FragmentManager):FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> {
                SearchFoodFragment()
            }
            1 ->{
                CreateFoodFragment()
            }

            2-> {
                CreateMealFragment()
            }

            else->{ return CreateRecipeFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Search"
            1-> "Food"
            2-> "Meal"
            else ->{
                return "Recipe"
            }

        }
    }

}