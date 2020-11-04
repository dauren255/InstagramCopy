package com.example.instagramcopy

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PostAdapter(var context: Context, var arrayList: MutableList<Post>) : RecyclerView.Adapter<PostAdapter.ItemHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var post: Post = arrayList.get(position)
        holder.PostAuthorUsername.text = post.postAuthorUsername
        Glide.with(context).load(post.postImage).into(holder.PostImage)
        Glide.with(context).load(post.postAuthorPhoto).into(holder.PostAuthorImage)
        holder.PostLikes.text = post.postLikes.toString()+" likes"
        holder.PostPublisher.text = post.postAuthorUsername.toString()
        holder.PostDescription.text = post.postDescription.toString()
        holder.PostComments.text = "View All "+post.commentCount.toString()+" comments"

    }

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var PostAuthorImage = itemView.findViewById<ImageView>(R.id.image_profile)
        var PostAuthorUsername = itemView.findViewById<TextView>(R.id.username_profile)
        var PostImage = itemView.findViewById<ImageView>(R.id.post_image)
        var PostLikes = itemView.findViewById<TextView>(R.id.likes)
        var PostPublisher = itemView.findViewById<TextView>(R.id.publisher)
        var PostDescription = itemView.findViewById<TextView>(R.id.description)
        var PostComments = itemView.findViewById<TextView>(R.id.comments)

    }
}