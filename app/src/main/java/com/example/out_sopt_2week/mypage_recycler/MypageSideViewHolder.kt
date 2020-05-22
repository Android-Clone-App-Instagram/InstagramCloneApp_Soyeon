package com.example.out_sopt_2week.mypage_recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.out_sopt_2week.R
import com.example.out_sopt_2week.data.MypageNaviData

class MypageSideViewHolder (view: View):RecyclerView.ViewHolder(view){
    var title :TextView = view.findViewById(R.id.tv_mypage_nav)
    fun bind(data: MypageNaviData){
        title.text=data.title
    }
}