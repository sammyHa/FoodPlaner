package com.samimhakimi.foodplaner.ui.extension

import android.content.Context
import android.widget.Toast

public fun Context.showToast (message: String, duration: Int = Toast.LENGTH_LONG){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}