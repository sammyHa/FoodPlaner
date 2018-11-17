package com.samimhakimi.foodplaner.ui.interfaces

interface Operations {

    fun percentageCalculator(consumed:Int, totalNeeded: Int):Int
    fun consumedInGrams(consumed:Int): Int
    fun toGoInGrams(consumed:Int, totalNeeded: Int): Int
    fun totalInGrams(totalNeeded: Int): Int
}