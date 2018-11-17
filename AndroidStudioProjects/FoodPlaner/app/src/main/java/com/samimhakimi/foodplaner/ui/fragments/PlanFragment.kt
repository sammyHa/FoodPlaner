package com.samimhakimi.foodplaner.ui.fragments


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.samimhakimi.foodplaner.R
import com.samimhakimi.foodplaner.ui.activities.NutritionFoodFactsDetailActivity
import com.samimhakimi.foodplaner.ui.models.FoodNutiritionFacts
import kotlinx.android.synthetic.main.fragment_plan.*


class PlanFragment : Fragment(){



    companion object {
        val TAG: String = PlanFragment::class.java.simpleName
        fun newInstance() = PlanFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_plans)
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_plan, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        open_food_fact.setOnClickListener(){
            val intent = Intent(context, NutritionFoodFactsDetailActivity::class.java)
            startActivity(intent)
        }

    }


}

