package com.example.out_sopt_2week

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.out_sopt_2week.book_recycler.BookAdapter
import com.example.out_sopt_2week.book_recycler.BookData
import com.example.out_sopt_2week.mypage_recycler.MypageAdapter
import com.example.out_sopt_2week.mypage_recycler.MypageData
import kotlinx.android.synthetic.main.fragment_book.*
import kotlinx.android.synthetic.main.fragment_mypage.*

class MyPageFragment : Fragment() {
    lateinit var mypageAdapter: MypageAdapter
    val data_mypage= mutableListOf<MypageData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
                    image = "https://image.aladin.co.kr/product/21174/20/cover150/ek67263543_2.jpg" )
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
        mypageAdapter.datas=data_mypage
        mypageAdapter.notifyDataSetChanged()
    }
}
