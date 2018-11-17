package com.samimhakimi.foodplaner.ui.fragments


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Toast.LENGTH_LONG
import com.github.clans.fab.FloatingActionButton
import com.github.clans.fab.FloatingActionMenu

import com.samimhakimi.foodplaner.R
import kotlin.collections.ArrayList
import com.samimhakimi.foodplaner.ui.activities.SearchActivity
import com.samimhakimi.foodplaner.ui.adapters.PagerAdapter


class HomeFragment : Fragment(),View.OnClickListener{


    lateinit var mCarbsProgress: ProgressBar
    lateinit var mProteinProgress: ProgressBar
    lateinit var mFatProgress: ProgressBar

    lateinit var mPagerAdapter: PagerAdapter
    lateinit var mViewPager: ViewPager
    val layouts:ArrayList<Int> = arrayListOf(R.layout.layout_circular_protein, R.layout.layout_circular_carbs, R.layout.layout_circular_fat)
    //private val layouts: IntArray = intArrayOf(R.layout.layout_circular_protein,
           // R.layout.layout_circular_carbs, R.layout.layout_circular_fat)

     internal lateinit var mDotsLayout: LinearLayout
    private var dots: ArrayList<ImageView>?= null
    lateinit var mParams: LinearLayout.LayoutParams

    private val handler = Handler()
    internal lateinit var tvCarbsConsumedPercentage: TextView
    internal lateinit var tvCarbsConsumed: TextView
    internal lateinit var tvCarbsNeeded: TextView
    internal lateinit var tvCarbsToGo: TextView

    internal lateinit var tvProteinConsumedPercentage: TextView
    internal lateinit var tvProteinConsumed: TextView
    internal lateinit var tvProteinNeeded: TextView
    internal lateinit var tvProteinToGo: TextView

    internal lateinit var tvFatConsumedPercentage: TextView
    internal lateinit var tvFatConsumed: TextView
    internal lateinit var tvFatNeeded: TextView
    internal lateinit var tvFatToGo: TextView
    internal lateinit var mDisabledLayout: RelativeLayout
    //fab buttons
    internal lateinit var mFloatingActionMenu: FloatingActionMenu
    internal lateinit var mBreakfastFab:FloatingActionButton
    internal lateinit var mLunchFab:FloatingActionButton
    internal lateinit var mDinnerFab:FloatingActionButton
    internal lateinit var mSnacksFab:FloatingActionButton


    companion object {
        val TAG: String = HomeFragment::class.java.simpleName
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_home)
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        return view

    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //init()
//        val res = resources
//        val drawableCarbs = res.getDrawable(R.drawable.circular)
//       // mCarbsProgress = view!!.findViewById<View>(R.id.circularCarbsProgressbar) as ProgressBar
//        mCarbsProgress.progress = 0 // main prgress
//        mCarbsProgress.secondaryProgress = 100
//        mCarbsProgress.progressDrawable = drawableCarbs
//
        mDotsLayout = view.findViewById(R.id.layoutDots)
        mFloatingActionMenu = view.findViewById(R.id.floating_action_menu)
        mBreakfastFab = view.findViewById(R.id.fab_breakfast)
        mLunchFab = view.findViewById(R.id.fab_lunch)
        mDinnerFab = view.findViewById(R.id.fab_dinner)
        mSnacksFab = view.findViewById(R.id.fab_snacks)

        mDisabledLayout = view.findViewById(R.id.disabled_layout)

        mBreakfastFab.setOnClickListener(this)
        mLunchFab.setOnClickListener(this)
        mDinnerFab.setOnClickListener(this)
        mSnacksFab.setOnClickListener(this)


        mViewPager = view.findViewById(R.id.viewPager)
        mPagerAdapter = PagerAdapter(layouts, context!!.applicationContext)
        mViewPager.adapter = mPagerAdapter


//
//        val resProtein = resources
//        val drawableProtein = resProtein.getDrawable(R.drawable.circular_protein)
//        mProteinProgress = view!!.findViewById<View>(R.id.circularProteinProgressbar) as ProgressBar
//        mProteinProgress.progress = 0
//        mProteinProgress.secondaryProgress = 100
//        mProteinProgress.progressDrawable = drawableProtein



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
            tvCarbsConsumedPercentage.text = getString( R.string.grams,carbsStatus ,"%")
            var carbs = consumedInGrams(520)
            tvCarbsConsumed.text = getString(R.string.grams, carbs, "g")
            var totalCarbs = totalInGrams(630)
            tvCarbsNeeded.text = getString(R.string.grams, totalCarbs, "g")
            var carbs_to_go = toGoInGrams(520,630)
            var absultevalue = Math.abs(carbs_to_go)
            tvCarbsToGo.text = getString(R.string.grams, absultevalue , "g")

        }

    }

    fun proteinCounter(){
        var protienStatus = 0
        protienStatus += percentageCalculator(30,120)
        handler.post{
            mProteinProgress.progress = protienStatus
            tvProteinConsumedPercentage.text = getString( R.string.grams,protienStatus ,"%")
            var protein = consumedInGrams(30)
            tvProteinConsumed.text = getString(R.string.grams, protein, " of ")
            var totalprotein = totalInGrams(120)
            tvProteinNeeded.text = getString(R.string.grams, totalprotein, "g")
            var protein_to_go = toGoInGrams(30,120)
            var absultevalue = Math.abs(protein_to_go)
            tvProteinToGo.text = getString(R.string.grams, absultevalue , "g")

        }
    }

    fun fatCounter(){
        var fatStatus = 0
        fatStatus += percentageCalculator(142,190)
        handler.post{
            mFatProgress.progress= fatStatus
            tvFatConsumedPercentage.text = getString( R.string.grams,fatStatus ,"%")
            var carbs = consumedInGrams(142)
            tvFatConsumed.text = getString(R.string.grams, carbs, " of ")
            var totalFat = totalInGrams(190)
            tvFatNeeded.text = getString(R.string.grams, totalFat, "g")
            var fat_to_go = toGoInGrams(142,190)
            var absultevalue = Math.abs(fat_to_go)
            tvFatToGo.text = getString(R.string.grams, absultevalue , "g")

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

    fun createDots(currentPosition: Int): Unit {

        if (mDotsLayout!=null) {
            mDotsLayout.removeAllViews()
            //dots = ArrayList<ImageView>(layouts.size)
            //for (i in 0 until layouts.size)
            //var i: Int = 0
            layouts.indices.forEach { i ->
                dots!![i] = ImageView(context)
                if (i == currentPosition) {
                    dots!![i].setImageDrawable(ContextCompat.getDrawable(context!!.applicationContext, R.drawable.active_dot))
                } else {
                    dots!![i].setImageDrawable(ContextCompat.getDrawable(context!!.applicationContext, R.drawable.inactive_dot))
                }

                mParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT)

                mParams.setMargins(4, 0 , 4 ,0)
                mDotsLayout.addView(dots!![i], mParams)
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fab_breakfast -> {
                val intent = Intent(context, SearchActivity::class.java)
                startActivity(intent)
                mFloatingActionMenu.close(true)
            }
            R.id.fab_lunch -> {
                val intent = Intent(context, SearchActivity::class.java)
                startActivity(intent)
                mFloatingActionMenu.close(true)
            }
            R.id.fab_dinner -> {
                val intent = Intent(context, SearchActivity::class.java)
                startActivity(intent)
                mFloatingActionMenu.close(true)
            }
            R.id.fab_snacks -> {
                val intent = Intent(context, SearchActivity::class.java)
                startActivity(intent)
                mFloatingActionMenu.close(true)
            }
            else->{toast("Something went wrong at homefragment")}
        }

    }


    fun toast(message:String){
        Toast.makeText(context, message, LENGTH_LONG).show()

    }




}


