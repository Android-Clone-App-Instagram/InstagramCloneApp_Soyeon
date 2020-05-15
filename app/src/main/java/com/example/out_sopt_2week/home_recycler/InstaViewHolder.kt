package com.example.out_sopt_2week.home_recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.out_sopt_2week.R

class InstaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    /*val tv_story = itemView.findViewById<TextView>(R.id.tv_story)
    val img_story = itemView.findViewById<ImageView>(R.id.img_story)*/

    val tv_username = itemView.findViewById<TextView>(R.id.tv_insta_username)
    val img_contents = itemView.findViewById<ImageView>(R.id.img_insta_contents)
    val img_profile = itemView.findViewById<ImageView>(R.id.img_insta_profile)

    fun bind(instaData: InstaData/*, storyData: StoryData*/){
        /*tv_story.text = storyData.userId
        Glide.with(itemView).load(storyData.img_profile).into(img_story)*/

        tv_username.text = instaData.userName
        Glide.with(itemView).load(instaData.img_profile).into(img_profile)
        Glide.with(itemView).load(instaData.img_contents).into(img_contents)
    }
}