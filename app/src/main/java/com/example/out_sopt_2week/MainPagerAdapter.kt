package com.example.out_sopt_2week

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.out_sopt_2week.yet.BookFragment
import com.example.out_sopt_2week.yet.FavoriteFragment

class MainPagerAdapter(fm:FragmentManager):
   FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
        override fun getItem(position:Int): Fragment{
            return when(position){
                0-> StoryFragment()
                1-> HomeFragment()
                2-> BookFragment()
                3-> FavoriteFragment()
                else -> MyPageFragment()
            }
        }

    override fun getCount() =3
}