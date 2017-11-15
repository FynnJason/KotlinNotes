package com.fynnjason.kotlinnotes

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import java.util.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val adapter = ExtensionsAdapter(Arrays.asList(""))

        adapter.setOnItemClickListener(object : ExtensionsAdapter.OnItemClickListener {
            override fun onItemClick(view: View?, position: Int) {

            }
        })
    }
}
