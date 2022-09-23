package com.example.matematika_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.matematika_2.databinding.ActivityPlayBinding

open class PlayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayBinding
    lateinit var list: List<Item>
    companion object{
        var question=ArrayList<String>()
        var answer=ArrayList<String>()
        val baa=ArrayList<String>()
        var sound=ArrayList<Int>()
        var image=ArrayList<Int>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)


        list=ArrayList<Item>()
        list=list+Item("1 dan 10 gacha sonlarni taqqoslash",R.drawable.a4)
        list=list+Item("1 dan 10 gacha qo‘shni sonlarni aniqlash",R.drawable.img)
        list=list+Item("1 dan 5 gacha sonlarni qo'shish va ayirish",R.drawable.a1)
        list=list+Item("1 dan 10 gacha sonlarni qo'shish va ayirish",R.drawable.a2)
        list=list+Item("11 soni va qo'shish, ayirish",R.drawable.a11)
        list=list+Item("12 soni va qo'shish, ayirish",R.drawable.a12)
        list=list+Item("13 soni va qo'shish, ayirish",R.drawable.a13)
        list=list+Item("14 soni va qo'shish, ayirish",R.drawable.a14)
        list=list+Item("15 soni va qo'shish, ayirish",R.drawable.a15)
        list=list+Item("16 soni va qo'shish, ayirish",R.drawable.a16)
        list=list+Item("17 soni va qo'shish, ayirish",R.drawable.a17)
        list=list+Item("18 soni va qo'shish, ayirish",R.drawable.a18)
        list=list+Item("19 soni va qo'shish, ayirish",R.drawable.a19)
        list=list+Item("20 soni va qo'shish, ayirish",R.drawable.a20)
        list=list+Item("Vaqt birligi",R.drawable.a7)
        list=list+Item("Hafta kunlari",R.drawable.a8)
        list=list+Item("Og'irlik o'lchovi",R.drawable.a9)
        list=list+Item("Geometrik shakllar",R.drawable.a21)
        list=list+Item("Uzunlik o'lchovi",R.drawable.a22)
        list=list+Item("Qo'shib ayirishni takrorlash",R.drawable.a)


        var adapter=Adapter(list=list,this@PlayActivity)
        binding.grid.adapter=adapter

        binding.grid.onItemClickListener=AdapterView.OnItemClickListener{ adapterView: AdapterView<*>, view2: View, i: Int, l: Long ->
            when(i){
                0->{
                    question.clear()
                    question.add("Qaysi son katta?")
                    question.add("Qaysi son katta?")
                    question.add("Qaysi son kichik?")
                    question.add("Qaysi son kichik?")
                    question.add("Qaysi son eng kattasi?")
                    question.add("Qaysi son eng kichigi?")
                    question.add("Eng katta sonni toping?")
                    question.add("Eng kichik sonni toping?")
                    question.add("Eng kichik sonni belgilang")
                    question.add("Eng katta sonni belgilang")

                    answer.clear()
                    answer.add("6")
                    answer.add("4")
                    answer.add("7")
                    answer.add("3")
                    answer.add("7")
                    answer.add("1")
                    answer.add("10")
                    answer.add("0")
                    answer.add("5")
                    answer.add("8")

                    baa.clear()
                    baa.add("4")

                    baa.add("3")

                    baa.add("9")

                    baa.add("8")

                    baa.add("5")
                    baa.add("2")

                    baa.add("8")
                    baa.add("9")

                    baa.add("4")
                    baa.add("1")
                    baa.add("8")

                    baa.add("7")
                    baa.add("4")
                    baa.add("9")

                    baa.add("8")
                    baa.add("10")
                    baa.add("6")

                    baa.add("4")
                    baa.add("2")
                    baa.add("5")


                }
                1->{
                    question.clear()
                    question.add("1 dan keyin qaysi son keladi?")
                    question.add("4 dan keyin qaysi son keladi?")
                    question.add("5 dan oldin qaysi son keladi?")
                    question.add("9 dan oldin qaysi son keladi?")
                    question.add("4 sonining qo'shni sonlarini toping?")
                    question.add("7 sonining qo'shni sonlarini toping?")
                    question.add("Eng katta sonni toping?")
                    question.add("Eng kichik sonni toping")
                    question.add("Qaysi sonlar o'zaro teng")
                    question.add("Qaysi sonlar o'zaro teng")

                    answer.clear()
                    answer.add("6")
                    answer.add("4")
                    answer.add("7")
                    answer.add("3")
                    answer.add("7")
                    answer.add("9")
                    answer.add("10")
                    answer.add("0")
                    answer.add("5")
                    answer.add("2")

                }
                2->{
                    question.clear()
                    question.add("3+2=?")
                    question.add("2+1=?")
                    question.add("3+1=?")
                    question.add("5-3=?")
                    question.add("")
                    question.add("Qaysi sonlar o'zaro teng")
                    question.add("Eng katta sonni toping?")
                    question.add("Eng kichik sonni toping")
                    question.add("Qaysi sonlar o'zaro teng")
                    question.add("Qaysi sonlar o'zaro teng")

                    answer.clear()
                    answer.add("6")
                    answer.add("4")
                    answer.add("7")
                    answer.add("3")
                    answer.add("7")
                    answer.add("9")
                    answer.add("10")
                    answer.add("0")
                    answer.add("5")
                    answer.add("2")

                }
                3->{

                }
                4->{

                }
                5->{

                }
                6->{

                }
                7->{

                }
                8->{

                }
                9->{

                }
                10->{

                }
                11->{

                }
                12->{

                }
                13->{

                }
                14->{

                }
                15->{

                }
                16->{

                }
                17->{

                }
                18->{

                }
                19->{

                }
            }
            startActivity(Intent(this,TaskActivity::class.java))
        }
    }
}