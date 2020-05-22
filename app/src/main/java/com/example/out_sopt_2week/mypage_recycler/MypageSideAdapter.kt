package com.example.out_sopt_2week.mypage_recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.out_sopt_2week.R
import com.example.out_sopt_2week.data.MypageNaviData

class MypageSideAdapter (private val context:Context):RecyclerView.Adapter<MypageSideViewHolder>(){
    var data = listOf<MypageNaviData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MypageSideViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_mypage_nav,parent,false)
        return MypageSideViewHolder(view)
    }
    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MypageSideViewHolder, position: Int) {
        holder.bind(data[position])
    }
}