package com.samimhakimi.foodplaner.ui.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.EditText
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.*

import com.samimhakimi.foodplaner.R
import com.samimhakimi.foodplaner.ui.activities.SearchActivity
import com.samimhakimi.foodplaner.ui.adapters.FoodAdapter
import com.samimhakimi.foodplaner.ui.models.FoodNutiritionFacts
import kotlinx.android.synthetic.main.add_food_layout.*
import kotlinx.android.synthetic.main.add_food_layout.view.*
import kotlinx.android.synthetic.main.fragment_search_food.*
import kotlinx.android.synthetic.main.layout_search_result_item.view.*
import java.util.Locale.filter

class SearchFoodFragment : Fragment() {

    private val TAG = "SearchFoodFragment"

    public var mAdapter: FoodAdapter? = null
    lateinit var mSearchBox: EditText
    private var mRecyclerView: RecyclerView? = null
    private var firestoreDB: FirebaseFirestore? = FirebaseFirestore.getInstance()
    private var foodRef: CollectionReference = firestoreDB!!.collection("food")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_search_food, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        mSearchBox = view.findViewById(R.id.search_box)
        mSearchBox.setImeActionLabel(" ", KeyEvent.KEYCODE_SEARCH)

        setUpRecyclerView()
        //searchItems()

    }




    fun setUpRecyclerView() {


        /**
         * old code start
         */
        val query: Query = foodRef.orderBy("foodName", Query.Direction.ASCENDING).startAt("milk").limit(200)

        val option: FirestoreRecyclerOptions<FoodNutiritionFacts> = FirestoreRecyclerOptions.Builder<FoodNutiritionFacts>()
                .setQuery(query, FoodNutiritionFacts::class.java)
                .build()

        mAdapter = FoodAdapter(option)
        mRecyclerView = view!!.findViewById(R.id.search_result_recyclerview)
        mRecyclerView!!.setHasFixedSize(true)
        mRecyclerView!!.layoutManager = LinearLayoutManager(context)

        mRecyclerView!!.adapter = mAdapter
        /**
         * old code end
         */

    }


    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {

        inflater?.inflate(R.menu.menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onStart() {
        super.onStart()
        mAdapter!!.startListening()
    }

    override fun onStop() {
        super.onStop()
        mAdapter!!.stopListening()

    }
}







