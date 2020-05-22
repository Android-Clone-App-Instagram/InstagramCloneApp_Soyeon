package com.example.out_sopt_2week.home_recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.out_sopt_2week.R
import com.example.out_sopt_2week.data.InstaData

class InstaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    /*val tv_story = itemView.findViewById<TextView>(R.id.tv_story)
    val img_story = itemView.findViewById<ImageView>(R.id.img_story)

    val userName: String,
    val img_profile:String,
    val like: Int,
    val contents: String
    */

    val tv_username1 = itemView.findViewById<TextView>(R.id.tv_insta_username1)
    val img_contents = itemView.findViewById<ImageView>(R.id.img_insta_contents)
    val img_profile = itemView.findViewById<ImageView>(R.id.img_insta_profile)
    val tv_username2 = itemView.findViewById<TextView>(R.id.tv_insta_username2)
    val tv_like=itemView.findViewById<TextView>(R.id.tv_insta_like)
    val tv_contents=itemView.findViewById<TextView>(R.id.tv_insta_contents)

    fun bind(instaData: InstaData){
        /*tv_story.text = storyData.userId
        Glide.with(itemView).load(storyData.img_profile).into(img_story)*/

        tv_username1.text = instaData.userName
        tv_username2.text = instaData.userName
        tv_like.text="좋아요 "+instaData.like+"개"
        tv_contents.text=instaData.contents
        Glide.with(itemView).load(instaData.img_profile).into(img_profile)
        Glide.with(itemView).load(instaData.img_contents).into(img_contents)
    }
}