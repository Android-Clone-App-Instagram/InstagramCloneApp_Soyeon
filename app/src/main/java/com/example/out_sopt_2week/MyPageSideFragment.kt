package com.example.out_sopt_2week

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.out_sopt_2week.mypage_recycler.MypageAdapter
import com.example.out_sopt_2week.data.MypageData
import com.example.out_sopt_2week.data.MypageNaviData
import com.example.out_sopt_2week.mypage_recycler.MypageSideAdapter
import kotlinx.android.synthetic.main.fragment_mypage.*

class MyPageSideFragment : Fragment() {
    lateinit var mypageSideAdapter: MypageSideAdapter
    val data_mypage= mutableListOf<MypageNaviData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_side_navi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mypageSideAdapter= MypageSideAdapter(view.context)
        rv_mypage.apply {
            adapter=mypageSideAdapter
            layoutManager= GridLayoutManager(view.context, 3)
        }
        loadDatas()
    }


    private fun loadDatas(){
        data_mypage.apply {
            add(
                MypageNaviData(
                    title = "보관"
                )
            )
            add(
                MypageNaviData(
                    title = "내 활동"
                )
            )
            add(
                MypageNaviData(
                    title = "네임 태그"
                )
            )
            add(
                MypageNaviData(
                    title = "저장됨"
                )
            )
            add(
                MypageNaviData(
                    title = "친한 친구"
                )
            )
            add(
                MypageNaviData(
                    title = "사람 찾아보기"
                )
            )
        }
        mypageSideAdapter.data=data_mypage
        mypageSideAdapter.notifyDataSetChanged()
    }
}
