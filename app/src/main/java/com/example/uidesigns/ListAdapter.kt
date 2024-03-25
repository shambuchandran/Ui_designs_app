package com.example.uidesigns

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

class ListAdapter(val appContext: Context, val itemlist: List<Int>) :
    ArrayAdapter<Int>(appContext, R.layout.cataloguelistitem, itemlist) {
    private class ViewHolder(view: View) {
        val imageView: ImageView = view.findViewById(R.id.imageViewcatalogue)
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val viewHolder: ViewHolder
        if (view == null) {
            view = LayoutInflater.from(appContext).inflate(R.layout.cataloguelistitem, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            viewHolder = view.tag as ViewHolder
        }
        viewHolder.imageView.setImageResource(itemlist[position])
        return view!!
    }
}