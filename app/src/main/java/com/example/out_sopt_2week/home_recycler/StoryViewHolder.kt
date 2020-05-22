package com.example.out_sopt_2week.home_recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.out_sopt_2week.R
import com.example.out_sopt_2week.data.StoryData

class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val tv_story = itemView.findViewById<TextView>(R.id.tv_story)
    val img_story = itemView.findViewById<ImageView>(R.id.img_story)
    fun bind(storyData: StoryData){

        tv_story.text = storyData.userId
        Glide.with(itemView).load(storyData.img_profile).into(img_story)
    }
}