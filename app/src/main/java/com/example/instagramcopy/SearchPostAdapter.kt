package com.example.instagramcopy

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.makeramen.roundedimageview.RoundedImageView

class SearchPostAdapter(var context: Context, var arrayList: MutableList<Post>) : RecyclerView.Adapter<SearchPostAdapter.ItemHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.search_post_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var post: Post = arrayList.get(position)
        holder.postImage.setImageResource(post.postImage)
    }

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var postImage = itemView.findViewById<RoundedImageView>(R.id.search_post_image)

    }
}