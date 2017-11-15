package com.fynnjason.kotlinnotes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ExtensionsAdapter.OnItemClickListener {


    var mAdapter: ExtensionsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = ExtensionsAdapter(getData())
        mRecycler.adapter = mAdapter

        mAdapter?.setOnItemClickListener(this)
    }

    fun getData(): ArrayList<String> {
        val datas = ArrayList<String>()
        for (i in 1..100) {
            datas.add(i.toString())
        }
        return datas
    }

    private val mRecycler by lazy {
        recycler_extensions.setHasFixedSize(true)
        recycler_extensions.layoutManager = LinearLayoutManager(this)
        recycler_extensions
    }

    override fun onItemClick(view: View?, position: Int) {
        Toast.makeText(this, mAdapter?.datas?.get(position), Toast.LENGTH_SHORT).show()
    }
}
