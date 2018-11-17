package com.samimhakimi.foodplaner.ui.models

import com.google.firebase.firestore.PropertyName

class FoodNutiritionFacts {
    public var foodId:String = ""

    public var foodName:String = "steakss"
    public var calories: String = ""


    private var serving: Int = 0
    public var servingSize: String = ""
    private var carbsPercentage: Int = 0
    private var carbsGrams: Int = 0

    private var fatPercentage: Int = 0
    private var fatbsGrams: Int = 0

    private var proteinPercentage: Int = 0
    private var proteinGrams: Int = 0

    private var totalDailyGoalCalories: Int = 0
    private var percentageOfDailyGoalCalories: Int = 0

    private var totalDailyGoalCarbs: Int = 0
    private var percentageOfDailyGoalCarbs: Int = 0

    private var totalDailyGoalFat: Int = 0
    private var percentageOfDailyGoalFat: Int = 0

    private var totalDailyGoalProeint: Int = 0
    private var percentageOfDailyGoalProtein: Int = 0

    private var totalCaloriesOfSelectedFood: Int = 0
    private var totalFatOfSelectedFood: Int = 0
    private var saturatedOfSelectedFood: Int = 0
    private var transOfSelectedFood: Int = 0
    private var polyunsaturatedOfSelectedFood: Int = 0
    private var monounsaturatedOfSelectedFood: Int = 0
    private var cholesterolOfSelectedFood: Int = 0
    private var sodiumOfSelectedFood: Int = 0
    private var totalCarbohydratesOfSelectedFood: Int = 0
    private var dietarFiberOfSelectedFood: Int = 0
    private var sugarsOfSelectedFood: Int = 0
    private var proteinOfSelectedFood: Int = 0
    private var vitaminDOfSelectedFood: Int = 0
    private var vitaminAOfSelectedFood: Int = 0
    private var vitaminCOfSelectedFood: Int = 0
    private var calciumOfSelectedFood: Int = 0
    private var ironOfSelectedFood: Int = 0
    private var potassiumOfSelectedFood: Int = 0

    constructor(
           // foodId:String,
            foodName:String,
            calories: String

//            serving: Int,
//            servingSize: String,
//            carbsPercentage: Int,
//            carbsGrams: Int,
//            fatPercentage: Int,
//            fatbsGrams: Int,
//            proteinPercentage: Int,
//            proteinGrams: Int,
//            totalDailyGoalCalories: Int,
//            percentageOfDailyGoalCalories: Int,
//            totalDailyGoalCarbs: Int,
//            percentageOfDailyGoalCarbs: Int,
//            totalDailyGoalFat: Int,
//            percentageOfDailyGoalFat: Int,
//            totalDailyGoalProeint: Int,
//            percentageOfDailyGoalProtein: Int,
//            totalCaloriesOfSelectedFood: Int,
//            totalFatOfSelectedFood: Int,
//            saturatedOfSelectedFood: Int,
//            transOfSelectedFood: Int,
//            polyunsaturatedOfSelectedFood: Int,
//            monounsaturatedOfSelectedFood: Int,
//            cholesterolOfSelectedFood: Int,
//            sodiumOfSelectedFood: Int,
//            totalCarbohydratesOfSelectedFood: Int,
//            dietarFiberOfSelectedFood: Int,
//            sugarsOfSelectedFood: Int,
//            proteinOfSelectedFood: Int,
//            vitaminDOfSelectedFood: Int,
//            vitaminAOfSelectedFood: Int,
//            vitaminCOfSelectedFood: Int,
//            calciumOfSelectedFood: Int,
//            ironOfSelectedFood: Int, potassiumOfSelectedFood: Int
        ) {
        //this.foodId = foodId
        this.foodName = foodName
        this.calories = calories

//        this.serving = serving
//        this.servingSize = servingSize
//
//        this.carbsPercentage = carbsPercentage
//        this.carbsGrams = carbsGrams
//        this.fatPercentage = fatPercentage
//        this.fatbsGrams = fatbsGrams
//        this.proteinPercentage = proteinPercentage
//        this.proteinGrams = proteinGrams
//        this.totalDailyGoalCalories = totalDailyGoalCalories
//        this.percentageOfDailyGoalCalories = percentageOfDailyGoalCalories
//        this.totalDailyGoalCarbs = totalDailyGoalCarbs
//        this.percentageOfDailyGoalCarbs = percentageOfDailyGoalCarbs
//        this.totalDailyGoalFat = totalDailyGoalFat
//        this.percentageOfDailyGoalFat = percentageOfDailyGoalFat
//        this.totalDailyGoalProeint = totalDailyGoalProeint
//        this.percentageOfDailyGoalProtein = percentageOfDailyGoalProtein
//        this.totalCaloriesOfSelectedFood = totalCaloriesOfSelectedFood
//        this.totalFatOfSelectedFood = totalFatOfSelectedFood
//        this.saturatedOfSelectedFood = saturatedOfSelectedFood
//        this.transOfSelectedFood = transOfSelectedFood
//        this.polyunsaturatedOfSelectedFood = polyunsaturatedOfSelectedFood
//        this.monounsaturatedOfSelectedFood = monounsaturatedOfSelectedFood
//        this.cholesterolOfSelectedFood = cholesterolOfSelectedFood
//        this.sodiumOfSelectedFood = sodiumOfSelectedFood
//        this.totalCarbohydratesOfSelectedFood = totalCarbohydratesOfSelectedFood
//        this.dietarFiberOfSelectedFood = dietarFiberOfSelectedFood
//        this.sugarsOfSelectedFood = sugarsOfSelectedFood
//        this.proteinOfSelectedFood = proteinOfSelectedFood
//        this.vitaminDOfSelectedFood = vitaminDOfSelectedFood
//        this.vitaminAOfSelectedFood = vitaminAOfSelectedFood
//        this.vitaminCOfSelectedFood = vitaminCOfSelectedFood
//        this.calciumOfSelectedFood = calciumOfSelectedFood
//        this.ironOfSelectedFood = ironOfSelectedFood
//        this.potassiumOfSelectedFood = potassiumOfSelectedFood
    }

    constructor(){
        //is needed for firestore
         }

}