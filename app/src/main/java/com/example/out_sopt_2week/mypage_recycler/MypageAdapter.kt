package com.example.out_sopt_2week.mypage_recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.out_sopt_2week.R
import com.example.out_sopt_2week.data.MypageData

class MypageAdapter(private val context: Context):RecyclerView.Adapter<MypageViewHolder>() {
    var datas = mutableListOf<MypageData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MypageViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.rv_item_mypage, parent, false)
        return MypageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MypageViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}