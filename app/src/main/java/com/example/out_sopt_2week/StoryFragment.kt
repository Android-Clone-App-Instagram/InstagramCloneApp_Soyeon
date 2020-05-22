package com.example.out_sopt_2week

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.out_sopt_2week.home_recycler.StoryAdapter
import com.example.out_sopt_2week.data.StoryData
import kotlinx.android.synthetic.main.fragment_home.*

class StoryFragment : Fragment() {
    lateinit var storyAdapter: StoryAdapter
    val datas= mutableListOf<StoryData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        storyAdapter=StoryAdapter(view.context)
        rv_home.adapter=storyAdapter // 이 리사이클러뷰의 어답터는 InstaAdapter
        rv_home.addItemDecoration(MyDivideLine(100, Color.CYAN)) // rv의 구분선
        loadDatas()
    }

    private fun loadDatas(){
        datas.apply {
            add(
                StoryData(
                    userId = "cat1",
                    img_profile = "https://cdn.pixabay.com/photo/2017/02/15/12/12/cat-2068462__480.jpg"
                )
            )
            add(
                StoryData(
                    userId = "cat2",
                    img_profile = "https://cdn.pixabay.com/photo/2014/04/13/20/49/cat-323262__480.jpg"
                )
            )
            add(
                StoryData(
                    userId = "cat3",
                    img_profile = "https://cdn.pixabay.com/photo/2016/01/19/17/41/friends-1149841__480.jpg"
                )
            )
            add(
                StoryData(
                    userId = "cat4",
                    img_profile = "https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519__480.jpg"
                )
            )
        }
        storyAdapter.datas=datas
        storyAdapter.notifyDataSetChanged()
    }
}