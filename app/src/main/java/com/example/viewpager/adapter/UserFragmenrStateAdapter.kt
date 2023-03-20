package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.models.data_2
import com.example.viewpager.viewPagerFragment

class UserFragmenrStateAdapter(fragmentActivity: FragmentActivity, val list:ArrayList<data_2>):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int =list.size

    override fun createFragment(position: Int): Fragment {
        return viewPagerFragment.newInstance(list[position].text_1,list[position].text_2)
    }
}