package com.samimhakimi.foodplaner.ui.adapters

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.collections.ArrayList

class PagerAdapter(private var layouts: ArrayList<Int>, mContext: Context) : PagerAdapter() {


    var mLayotInfaltor : LayoutInflater

    init {
        mLayotInfaltor = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }


    override fun isViewFromObject(view: View, p1: Any): Boolean {

        return view === p1
    }

    override fun getCount(): Int {
        return layouts.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view = mLayotInfaltor.inflate(layouts[position],container,false)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view: View = `object`as View
        container.removeView(view)
    }
}