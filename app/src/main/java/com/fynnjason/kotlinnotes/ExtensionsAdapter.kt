package com.fynnjason.kotlinnotes

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class ExtensionsAdapter(datas: List<String>) : RecyclerView.Adapter<ExtensionsAdapter.ViewHolder>(), View.OnClickListener {

    val datas = datas

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = parent?.inflate(R.layout.item_extensions, false)
        view?.setOnClickListener(this)
        return ViewHolder(view)
    }

    override fun onClick(view: View?) {
        mOnItemClickListener?.let {
            //点击事件获取Tag中的Position
            mOnItemClickListener?.onItemClick(view, view?.tag as Int)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tvNumber?.text = datas.get(position)
        //将position保存在itemView的Tag中，以便点击时进行获取
        holder?.itemView?.tag = position
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val tvNumber: TextView? = itemView?.findViewById(R.id.tv_number)
    }

    interface OnItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

    var mOnItemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener) {
        mOnItemClickListener = listener
    }

}