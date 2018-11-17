package com.samimhakimi.foodplaner.ui.helper

import android.support.v4.app.Fragment
import com.samimhakimi.foodplaner.R
import com.samimhakimi.foodplaner.ui.fragments.HomeFragment
import com.samimhakimi.foodplaner.ui.fragments.PlanFragment
import com.samimhakimi.foodplaner.ui.fragments.ProfileFragment
import com.samimhakimi.foodplaner.ui.fragments.RecipeFragment

enum class BottomNavigationPosition(val position: Int, val id: Int) {
    HOME(0, R.id.home),
    PLAN(1, R.id.plans),
    RECIPES(2, R.id.recipes),
    PROFILE(3, R.id.profile);
}

fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
    BottomNavigationPosition.HOME.id -> BottomNavigationPosition.HOME
    BottomNavigationPosition.PLAN.id -> BottomNavigationPosition.PLAN
    BottomNavigationPosition.PROFILE.id -> BottomNavigationPosition.PROFILE
    BottomNavigationPosition.RECIPES.id -> BottomNavigationPosition.RECIPES
    else -> BottomNavigationPosition.HOME
}

fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.newInstance()
    BottomNavigationPosition.PLAN -> PlanFragment.newInstance()
    BottomNavigationPosition.RECIPES -> RecipeFragment.newInstance()
    BottomNavigationPosition.PROFILE -> ProfileFragment.newInstance()
}

fun BottomNavigationPosition.getTag(): String = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.TAG
    BottomNavigationPosition.PLAN -> PlanFragment.TAG
    BottomNavigationPosition.RECIPES -> RecipeFragment.TAG
    BottomNavigationPosition.PROFILE -> ProfileFragment.TAG
}