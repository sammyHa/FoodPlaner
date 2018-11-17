package com.samimhakimi.foodplaner.ui.models

class FoodTest {
    var foodId:String? = null
    var foodName:String? = null
    var foodCal:String? = null
    var foodSize:String? = null

    constructor()

    constructor(foodId: String?, foodName: String?, foodCal: String?, foodSize: String?) {
        this.foodId = foodId
        this.foodName = foodName
        this.foodCal = foodCal
        this.foodSize = foodSize
    }


}