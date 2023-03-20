package com.example.viewpager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.databinding.RvViewpagerItemBinding
import com.example.viewpager.models.data_1

class
viewPager_Rcycle_Adapter(val list: List<data_1>) : RecyclerView.Adapter<viewPager_Rcycle_Adapter.VIewHOlder>() {

    inner class VIewHOlder(var rvViewpagerItemBinding: RvViewpagerItemBinding):RecyclerView.ViewHolder(rvViewpagerItemBinding.root){

        fun onBind(data:data_1, position: Int){
            rvViewpagerItemBinding.text1.text=data.text_1
            rvViewpagerItemBinding.text2.text=data.text_2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VIewHOlder {
        return VIewHOlder(RvViewpagerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VIewHOlder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}