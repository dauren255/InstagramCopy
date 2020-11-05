package com.example.instagramcopy

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchAdapter(var context: Context, var arrayList: MutableList<String>) : RecyclerView.Adapter<SearchAdapter.ItemHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.search_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var str = arrayList.get(position)
        holder.search_text.text = str

    }

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var search_text = itemView.findViewById<TextView>(R.id.search_item)

    }
}