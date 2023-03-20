package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.adapter.my_Pager_adapter
import com.example.viewpager.databinding.ActivityMain2Binding
import com.example.viewpager.databinding.ActivityMain3Binding
import com.example.viewpager.models.data_3

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy { ActivityMain3Binding.inflate(layoutInflater) }
    private lateinit var list:ArrayList<data_3>
    private lateinit var myPagerAdapter: my_Pager_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()

        myPagerAdapter= my_Pager_adapter(list)
        binding.myViewPager.adapter=myPagerAdapter


    }

    private fun loadData() {
        list= ArrayList()
        list.addAll(
            listOf(
                data_3(R.drawable.image_1," Geoaxborot","Geoaxborot moduli orqali siz o'zingizga yaqin bo'lgan migrantlar va boshqa muassasalar haqida ma'lumot olishingiz mumkin"),
                data_3(R.drawable.image_1,"Huquqiy axborot","Huquqiy axborot moduli orqali siz migratsiya sohasiga oid yangiliklardan, qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin"),
                data_3(R.drawable.image_1," To'lovlar xizmatlari","To'lov xizmatlari moduli orqali siz masofadan turib turli xil xizmatlarga to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin"),
                data_3(R.drawable.image_1,"Qo'shimcha imkoniyat","Qo'shimcha imkoniyatlar moduli orqali siz interaktiv so'zlashgichlar va lug'atlar yordamida til bilish savodxonligingizni oshirishingiz mumkin")
            )
        )
    }
}