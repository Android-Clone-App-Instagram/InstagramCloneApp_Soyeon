package com.example.out_sopt_2week.home_recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.out_sopt_2week.R
import com.example.out_sopt_2week.data.StoryData

class StoryAdapter(private val context: Context):RecyclerView.Adapter<StoryViewHolder>() {
    var datas = mutableListOf<StoryData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.rv_item_story, parent, false)
        return StoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}