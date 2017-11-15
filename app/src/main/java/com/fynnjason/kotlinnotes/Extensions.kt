package com.fynnjason.kotlinnotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

/*扩展函数*/
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}