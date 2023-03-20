package com.example.viewpager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager.databinding.ItemViewpagerBinding
import com.example.viewpager.models.data_3

class my_Pager_adapter(val list:ArrayList<data_3>):PagerAdapter() {
    override fun getCount(): Int =list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val ItemViewpagerBinding=ItemViewpagerBinding.inflate(LayoutInflater.from(container.context), container, false)


        ItemViewpagerBinding.image.setImageResource(list[position].image)
        ItemViewpagerBinding.text1.text=list[position].text_1
        ItemViewpagerBinding.text2.text=list[position].text_2

       container.addView(ItemViewpagerBinding.root)
        return ItemViewpagerBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}