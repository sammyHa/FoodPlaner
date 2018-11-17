package com.samimhakimi.foodplaner.ui.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.samimhakimi.foodplaner.R
import com.samimhakimi.foodplaner.ui.adapters.AddFoodPagerAdapter
import com.samimhakimi.foodplaner.ui.models.FoodNutiritionFacts
import kotlinx.android.synthetic.main.add_food_layout.*

class SearchActivity:AppCompatActivity(),View.OnClickListener{

    public var mSearchBox:EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_food_layout)

        val fragmentAdapter = AddFoodPagerAdapter(supportFragmentManager)
        search_viewPager.adapter = fragmentAdapter
        add_food_tabs.setupWithViewPager(search_viewPager)
//        mSearchBox!!.setImeActionLabel(" ",KeyEvent.KEYCODE_SEARCH)
//        img_barcode.setOnClickListener(this)

    }



    override fun onClick(v: View?) {
//        if (v?.id == R.id.img_barcode){
//            val intent = Intent(this, BarcodeActivity::class.java)
//            startActivity(intent)
//            toast("Searching...")
//        }
    }


    fun toast(message:String){
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }


}