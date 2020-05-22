package com.example.out_sopt_2week

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.out_sopt_2week.mypage_recycler.MypageAdapter
import com.example.out_sopt_2week.data.MypageData
import com.example.out_sopt_2week.data.StoryData
import com.example.out_sopt_2week.home_recycler.StoryAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_mypage.*

class MyPageFragment : Fragment() {
    lateinit var mypageAdapter: MypageAdapter
    lateinit var storyAdapter: StoryAdapter
    val data_mypage= mutableListOf<MypageData>()
    val storydatas= mutableListOf<StoryData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        storyAdapter= StoryAdapter(view.context)
        rv_mypage_story.adapter=storyAdapter // 이 리사이클러뷰의 어답터는 StoryAdapter

        mypageAdapter= MypageAdapter(view.context)
        rv_mypage.apply {
            adapter=mypageAdapter
            layoutManager= GridLayoutManager(view.context, 3)
        }
        loadDatas()
    }


    private fun loadDatas(){
        data_mypage.apply {
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/21174/20/cover150/ek67263543_2.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/1809/47/cover500/e893746044_2.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/2245/67/cover150/e912435521_5.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/1809/47/cover150/e893746267_2.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/1933/52/cover150/e032435820_7.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/2673/4/cover150/e352435848_3.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/2753/61/cover150/e052435044_2.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/11526/94/cover500/ek99253140_5.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/13913/1/cover150/ek34253004_5.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/2089/10/cover150/e899721378_6.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/5689/99/cover150/e452437349_3.jpg"
                )
            )
            add(
                MypageData(
                    image = "https://image.aladin.co.kr/product/20594/1/cover150/e893101162_1.jpg"
                )
            )
        }

        storydatas.apply {
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
            add(
                StoryData(
                    userId = "cat5",
                    img_profile = "https://cdn.pixabay.com/photo/2017/02/15/12/12/cat-2068462__480.jpg"
                )
            )
            add(
                StoryData(
                    userId = "cat6",
                    img_profile = "https://cdn.pixabay.com/photo/2014/04/13/20/49/cat-323262__480.jpg"
                )
            )
            add(
                StoryData(
                    userId = "cat7",
                    img_profile = "https://cdn.pixabay.com/photo/2016/01/19/17/41/friends-1149841__480.jpg"
                )
            )
            add(
                StoryData(
                    userId = "cat8",
                    img_profile = "https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519__480.jpg"
                )
            )
        }
        mypageAdapter.datas=data_mypage
        mypageAdapter.notifyDataSetChanged()
    }
}
