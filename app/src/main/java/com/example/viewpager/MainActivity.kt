package com.example.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewpager.adapter.viewPager_Rcycle_Adapter
import com.example.viewpager.databinding.ActivityMainBinding
import com.example.viewpager.models.data_1


class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list:ArrayList<data_1>
    private lateinit var viewPager_Rcycle_Adapter:viewPager_Rcycle_Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()

        viewPager_Rcycle_Adapter= viewPager_Rcycle_Adapter(list)
        binding.viewPiger2.adapter=viewPager_Rcycle_Adapter


    }

    private fun loadData() {
        list= ArrayList()

        list.addAll(
            listOf(
                data_1("Xush kelibsiz", "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                        "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"),
            data_1("Hikoyalar dunyosi","Gar zamonni nayf qilsam ayb qilma, ey rafiq, \n" +
                    "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! "),
                data_1("Kitob ortidan..","Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n" +
                        " Kelmadi jonimg'a hech oromi jondin yaxshilig'."),
                data_1("Bizga qo`shiling","Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p,\n" +
                        " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?")
            )
        )
    }
}