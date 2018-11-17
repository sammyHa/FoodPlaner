package com.samimhakimi.foodplaner.ui.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.samimhakimi.foodplaner.R


class RecipeFragment : Fragment() {

    companion object {
        val TAG: String = RecipeFragment::class.java.simpleName
        fun newInstance() = RecipeFragment()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_recipes)
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recipe, container, false)
        return view
    }

}
