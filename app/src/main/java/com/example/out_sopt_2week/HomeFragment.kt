package com.example.out_sopt_2week

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.out_sopt_2week.home_recycler.InstaAdapter
import com.example.out_sopt_2week.home_recycler.InstaData
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {
    lateinit var instaAdapter: InstaAdapter
    val datas= mutableListOf<InstaData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instaAdapter=InstaAdapter(view.context)
        rv_home.adapter=instaAdapter // 이 리사이클러뷰의 어답터는 InstaAdapter
        loadDatas()
    }

    private fun loadDatas(){
        datas.apply {
            add(
                InstaData(
                    userName = "cat1",
                    img_profile = "https://cdn.pixabay.com/photo/2017/02/15/12/12/cat-2068462__480.jpg",
                    img_contents = "https://cdn.pixabay.com/photo/2018/03/26/02/05/cat-3261420__480.jpg"
                ))
            add(
                InstaData(
                    userName = "cat2",
                    img_profile = "https://cdn.pixabay.com/photo/2014/04/13/20/49/cat-323262__480.jpg",
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/25/01/22/cat-2536662__480.jpg"
                ))
            add(
                InstaData(
                    userName = "cat3",
                    img_profile = "https://cdn.pixabay.com/photo/2016/01/19/17/41/friends-1149841__480.jpg",
                    img_contents = "https://cdn.pixabay.com/photo/2017/11/14/13/06/kitty-2948404__480.jpg"
                ))
            add(
                InstaData(
                    userName = "cat4",
                    img_profile = "https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519__480.jpg",
                    img_contents = "https://cdn.pixabay.com/photo/2016/09/07/16/19/bremen-town-musicians-1651945__480.jpg"
                ))
        }
        instaAdapter.datas=datas
        instaAdapter.notifyDataSetChanged()
    }
}
