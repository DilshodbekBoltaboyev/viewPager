package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.adapter.UserFragmenrStateAdapter
import com.example.viewpager.databinding.ActivityMain2Binding
import com.example.viewpager.models.data_2

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    private lateinit var list: ArrayList<data_2>
    private lateinit var userFragmenrStateAdapter: UserFragmenrStateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()
        userFragmenrStateAdapter = UserFragmenrStateAdapter(this, list)
        binding.viewPiger2.adapter = userFragmenrStateAdapter

    }

    private fun loadData() {
        list = ArrayList()
        list.addAll(
            listOf(
                data_2(
                    R.drawable.image_1,
                    "Click va Paymega o’tish xizmati",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."
                ),
                data_2(
                    R.drawable.image_1,
                    "Barcha operatorlar bo’yicha statistika",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."
                ),
                data_2(
                    R.drawable.image_1,
                    "Tariflarni filtrlash",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."
                ),
                data_2(
                    R.drawable.image_1,
                    "Yangi imkoniyatlar",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."
                )
            )
        )
    }
}