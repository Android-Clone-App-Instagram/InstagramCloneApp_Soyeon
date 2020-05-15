package com.example.out_sopt_2week.mypage_recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.out_sopt_2week.R

class MypageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val img_mypage_contents = itemView.findViewById<ImageView>(R.id.img_mypage_contents)
    fun bind(mypageData: MypageData){
        Glide.with(itemView).load(mypageData.image).into(img_mypage_contents)
    }
}