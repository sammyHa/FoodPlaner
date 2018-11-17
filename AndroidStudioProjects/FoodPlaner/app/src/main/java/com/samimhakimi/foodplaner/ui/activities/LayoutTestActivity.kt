package com.samimhakimi.foodplaner.ui.activities

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.samimhakimi.foodplaner.R

class LayoutTestActivity: AppCompatActivity() {
     lateinit var mCarbsProgress: ProgressBar
     lateinit var mProteinProgress: ProgressBar
     lateinit var mFatProgress: ProgressBar


    private val handler = Handler()
    internal lateinit var tv_carbs_consumed_percentage: TextView
    internal lateinit var tv_carbs_consumed: TextView
    internal lateinit var tv_carbs_needed: TextView
    internal lateinit var tv_carbs_to_go: TextView

    internal lateinit var tv_protein_consumed_percentage: TextView
    internal lateinit var tv_protein_consumed: TextView
    internal lateinit var tv_protein_needed: TextView
    internal lateinit var tv_protein_togo: TextView

    internal lateinit var tv_fat_consumed_percentage: TextView
    internal lateinit var tv_fat_consumed: TextView
    internal lateinit var tv_fat_needed: TextView
    internal lateinit var tv_fat_togo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
       // init()



    }

    fun init(){
        carbsCounter()
        proteinCounter()
        fatCounter()
    }

    fun carbsCounter(){
        var carbsStatus = 0
        carbsStatus += percentageCalculator(520,630)
        handler.post{
            mCarbsProgress.progress= carbsStatus
            tv_carbs_consumed_percentage.text = getString( R.string.grams,carbsStatus ,"%")
            var carbs = consumedInGrams(520)
            tv_carbs_consumed.text = getString(R.string.grams, carbs, " of ")
            var totalCarbs = totalInGrams(630)
            tv_carbs_needed.text = getString(R.string.grams, totalCarbs, "g")
            var carbs_to_go = toGoInGrams(520,630)
            var absultevalue = Math.abs(carbs_to_go)
            tv_carbs_to_go.text = getString(R.string.grams, absultevalue , "g")

        }
    }

    fun proteinCounter(){
        var protienStatus = 0
        protienStatus += percentageCalculator(30,120)
        handler.post{
            mProteinProgress.progress = protienStatus
            tv_protein_consumed_percentage.text = getString( R.string.grams,protienStatus ,"%")
            var protein = consumedInGrams(30)
            tv_protein_consumed.text = getString(R.string.grams, protein, " of ")
            var totalprotein = totalInGrams(120)
            tv_protein_needed.text = getString(R.string.grams, totalprotein, "g")
            var protein_to_go = toGoInGrams(30,120)
            var absultevalue = Math.abs(protein_to_go)
            tv_protein_togo.text = getString(R.string.grams, absultevalue , "g")

        }
    }

    fun fatCounter(){
        var fatStatus = 0
        fatStatus += percentageCalculator(142,190)
        handler.post{
            mFatProgress.progress= fatStatus
            tv_fat_consumed_percentage.text = getString( R.string.grams,fatStatus ,"%")
            var carbs = consumedInGrams(142)
            tv_fat_consumed.text = getString(R.string.grams, carbs, " of ")
            var totalFat = totalInGrams(190)
            tv_fat_needed.text = getString(R.string.grams, totalFat, "g")
            var fat_to_go = toGoInGrams(142,190)
            var absultevalue = Math.abs(fat_to_go)
            tv_fat_togo.text = getString(R.string.grams, absultevalue , "g")

        }
    }



    fun percentageCalculator(consumed:Int, totalNeeded: Int):Int{
                return consumed * 100 / totalNeeded
    }

    fun consumedInGrams(consumed:Int): Int {
        return consumed
    }

    fun toGoInGrams(consumed:Int, totalNeeded: Int): Int {
        return  consumed - totalNeeded
    }

    fun totalInGrams(totalNeeded: Int): Int {
        return totalNeeded
    }
}
