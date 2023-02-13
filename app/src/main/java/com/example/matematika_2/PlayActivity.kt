package com.example.matematika_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.example.matematika_2.databinding.ActivityPlayBinding

open class PlayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayBinding
    lateinit var list: List<Item>
    companion object{
        var j:Int=0
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

        list= arrayListOf()
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
        list=list+Item("Og'irlik o'lchovi",R.drawable.abd)
        list=list+Item("Geometrik shakllar",R.drawable.a21)
        list=list+Item("Geometrik burchaklar",R.drawable.aaa2)
        list=list+Item("Uzunlik o'lchovi",R.drawable.a22)
        list=list+Item("Qo'shib ayirishni takrorlash",R.drawable.a)

        val adapter=Adapter(list=list,this@PlayActivity)
        binding.grid.adapter=adapter

        binding.grid.onItemClickListener=AdapterView.OnItemClickListener { _: AdapterView<*>, _: View, i: Int, _: Long ->
            j = i
            when (i) {
                0 -> {
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

                    sound.clear()
                    sound.add(R.raw.a1)
                    sound.add(R.raw.a2)
                    sound.add(R.raw.a3)
                    sound.add(R.raw.a4)
                    sound.add(R.raw.a5)
                    sound.add(R.raw.a6)
                    sound.add(R.raw.a7)
                    sound.add(R.raw.a8)
                    sound.add(R.raw.a9)
                    sound.add(R.raw.a10)
                }
                1 -> {
                    question.clear()
                    question.add("1 dan keyin qaysi son keladi?")
                    question.add("4 dan keyin qaysi son keladi?")
                    question.add("5 dan oldin qaysi son keladi?")
                    question.add("9 dan oldin qaysi son keladi?")
                    question.add("4 sonining qo'shni sonini toping?")
                    question.add("7 sonining qo'shni sonini toping?")
                    question.add("Eng katta sonni toping?")
                    question.add("Eng kichik sonni toping")
                    question.add("Eng kichik sonni belgilang")
                    question.add("Eng katta sonni belgilang")

                    answer.clear()
                    answer.add("2")
                    answer.add("5")
                    answer.add("4")
                    answer.add("8")
                    answer.add("3")
                    answer.add("8")
                    answer.add("10")
                    answer.add("0")
                    answer.add("5")
                    answer.add("8")

                    baa.clear()
                    baa.add("4")

                    baa.add("2")

                    baa.add("9")

                    baa.add("5")

                    baa.add("8")
                    baa.add("2")

                    baa.add("2")
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

                    sound.clear()
                    sound.add(R.raw.b1)
                    sound.add(R.raw.b2)
                    sound.add(R.raw.b3)
                    sound.add(R.raw.b4)
                    sound.add(R.raw.b5)
                    sound.add(R.raw.b6)
                    sound.add(R.raw.b7)
                    sound.add(R.raw.b8)
                    sound.add(R.raw.b9)
                    sound.add(R.raw.b10)
                }
                2 -> {
                    question.clear()
                    question.add("3+2=?")
                    question.add("2+1=?")
                    question.add("3+1=?")
                    question.add("5-3=?")
                    question.add("1+3=?")
                    question.add("3+0=?")
                    question.add("4+1=?")
                    question.add("5-4=?")
                    question.add("4-2=?")
                    question.add("3-2=?")

                    answer.clear()
                    answer.add("5")
                    answer.add("3")
                    answer.add("4")
                    answer.add("2")
                    answer.add("4")
                    answer.add("3")
                    answer.add("5")
                    answer.add("1")
                    answer.add("2")
                    answer.add("1")

                    baa.clear()
                    baa.add("4")

                    baa.add("2")

                    baa.add("1")

                    baa.add("5")

                    baa.add("1")
                    baa.add("2")

                    baa.add("2")
                    baa.add("0")

                    baa.add("4")
                    baa.add("3")
                    baa.add("0")

                    baa.add("4")
                    baa.add("2")
                    baa.add("3")

                    baa.add("1")
                    baa.add("0")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("5")

                    sound.clear()
                    sound.add(R.raw.c1)
                    sound.add(R.raw.c2)
                    sound.add(R.raw.c3)
                    sound.add(R.raw.c4)
                    sound.add(R.raw.c5)
                    sound.add(R.raw.c6)
                    sound.add(R.raw.c7)
                    sound.add(R.raw.c8)
                    sound.add(R.raw.c9)
                    sound.add(R.raw.c10)
                }
                3 -> {
                    question.clear()
                    question.add("4+2=?")
                    question.add("9+1=?")
                    question.add("3+5=?")
                    question.add("8-3=?")
                    question.add("4+3=?")
                    question.add("3+4=?")
                    question.add("4+4=?")
                    question.add("8-1=?")
                    question.add("10-2=?")
                    question.add("9-2=?")

                    answer.clear()
                    answer.add("6")
                    answer.add("10")
                    answer.add("8")
                    answer.add("5")
                    answer.add("7")
                    answer.add("7")
                    answer.add("8")
                    answer.add("7")
                    answer.add("8")
                    answer.add("7")

                    baa.clear()
                    baa.add("4")

                    baa.add("2")

                    baa.add("1")

                    baa.add("8")

                    baa.add("1")
                    baa.add("9")

                    baa.add("8")
                    baa.add("6")

                    baa.add("7")
                    baa.add("9")
                    baa.add("10")

                    baa.add("4")
                    baa.add("8")
                    baa.add("3")

                    baa.add("1")
                    baa.add("10")
                    baa.add("3")

                    baa.add("4")
                    baa.add("2")
                    baa.add("9")

                    sound.clear()
                    sound.add(R.raw.d1)
                    sound.add(R.raw.d2)
                    sound.add(R.raw.d3)
                    sound.add(R.raw.d4)
                    sound.add(R.raw.d5)
                    sound.add(R.raw.d6)
                    sound.add(R.raw.d7)
                    sound.add(R.raw.d8)
                    sound.add(R.raw.d9)
                    sound.add(R.raw.d10)
                }
                4 -> {
                    question.clear()
                    question.add("O'n bir sonini ko'rsating")
                    question.add("10+1=?")
                    question.add("8+1=?")
                    question.add("11-3=?")
                    question.add("1+8=?")
                    question.add("11+0=?")
                    question.add("10-5=?")
                    question.add("5+6=?")
                    question.add("8+2=?")
                    question.add("7+2=?")

                    answer.clear()
                    answer.add("11")
                    answer.add("11")
                    answer.add("9")
                    answer.add("8")
                    answer.add("9")
                    answer.add("11")
                    answer.add("5")
                    answer.add("11")
                    answer.add("10")
                    answer.add("9")

                    baa.clear()
                    baa.add("9")

                    baa.add("2")

                    baa.add("7")

                    baa.add("5")

                    baa.add("7")
                    baa.add("6")

                    baa.add("7")
                    baa.add("5")

                    baa.add("4")
                    baa.add("8")
                    baa.add("0")

                    baa.add("4")
                    baa.add("9")
                    baa.add("3")

                    baa.add("1")
                    baa.add("8")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.e1)
                    sound.add(R.raw.e2)
                    sound.add(R.raw.e3)
                    sound.add(R.raw.e4)
                    sound.add(R.raw.e5)
                    sound.add(R.raw.e6)
                    sound.add(R.raw.e7)
                    sound.add(R.raw.e8)
                    sound.add(R.raw.e9)
                    sound.add(R.raw.e10)
                }
                5 -> {
                    question.clear()
                    question.add("O'n ikki sonini ko'rsating")
                    question.add("10+2=?")
                    question.add("8+2=?")
                    question.add("12-3=?")
                    question.add("1+10=?")
                    question.add("11+1=?")
                    question.add("12-5=?")
                    question.add("5+7=?")
                    question.add("8+2=?")
                    question.add("7+2=?")

                    answer.clear()
                    answer.add("12")
                    answer.add("12")
                    answer.add("10")
                    answer.add("9")
                    answer.add("11")
                    answer.add("12")
                    answer.add("7")
                    answer.add("12")
                    answer.add("10")
                    answer.add("9")

                    baa.clear()
                    baa.add("9")

                    baa.add("11")

                    baa.add("7")

                    baa.add("5")

                    baa.add("10")
                    baa.add("6")

                    baa.add("7")
                    baa.add("5")

                    baa.add("4")
                    baa.add("8")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("3")

                    baa.add("9")
                    baa.add("8")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.f1)
                    sound.add(R.raw.f2)
                    sound.add(R.raw.f3)
                    sound.add(R.raw.f4)
                    sound.add(R.raw.f5)
                    sound.add(R.raw.f6)
                    sound.add(R.raw.f7)
                    sound.add(R.raw.f8)
                    sound.add(R.raw.f9)
                    sound.add(R.raw.f10)
                }
                6 -> {
                    question.clear()
                    question.add("O'n uch sonini ko'rsating")
                    question.add("10+3=?")
                    question.add("8+4=?")
                    question.add("13-3=?")
                    question.add("1+12=?")
                    question.add("11+1=?")
                    question.add("12-5=?")
                    question.add("5+8=?")
                    question.add("8+2=?")
                    question.add("7+2=?")

                    answer.clear()
                    answer.add("13")
                    answer.add("13")
                    answer.add("12")
                    answer.add("10")
                    answer.add("13")
                    answer.add("12")
                    answer.add("7")
                    answer.add("13")
                    answer.add("10")
                    answer.add("9")

                    baa.clear()
                    baa.add("9")

                    baa.add("11")

                    baa.add("7")

                    baa.add("5")

                    baa.add("12")
                    baa.add("6")

                    baa.add("7")
                    baa.add("11")

                    baa.add("4")
                    baa.add("8")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("3")

                    baa.add("9")
                    baa.add("8")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.g1)
                    sound.add(R.raw.g2)
                    sound.add(R.raw.g3)
                    sound.add(R.raw.g4)
                    sound.add(R.raw.g5)
                    sound.add(R.raw.g6)
                    sound.add(R.raw.g7)
                    sound.add(R.raw.g8)
                    sound.add(R.raw.g9)
                    sound.add(R.raw.g10)
                }
                7 -> {
                    question.clear()
                    question.add("O'n tort sonini ko'rsating")
                    question.add("10+4=?")
                    question.add("8+6=?")
                    question.add("14-3=?")
                    question.add("1+12=?")
                    question.add("11+1=?")
                    question.add("12-5=?")
                    question.add("5+7=?")
                    question.add("8+2=?")
                    question.add("7+6=?")

                    answer.clear()
                    answer.add("14")
                    answer.add("14")
                    answer.add("14")
                    answer.add("11")
                    answer.add("13")
                    answer.add("12")
                    answer.add("7")
                    answer.add("12")
                    answer.add("10")
                    answer.add("13")

                    baa.clear()
                    baa.add("9")

                    baa.add("11")

                    baa.add("7")

                    baa.add("5")

                    baa.add("10")
                    baa.add("6")

                    baa.add("7")
                    baa.add("14")

                    baa.add("4")
                    baa.add("8")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("3")

                    baa.add("9")
                    baa.add("8")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.h1)
                    sound.add(R.raw.h2)
                    sound.add(R.raw.h3)
                    sound.add(R.raw.h4)
                    sound.add(R.raw.h5)
                    sound.add(R.raw.h6)
                    sound.add(R.raw.h7)
                    sound.add(R.raw.h8)
                    sound.add(R.raw.h9)
                    sound.add(R.raw.h10)
                }
                8 -> {
                    question.clear()
                    question.add("O'n besh sonini ko'rsating")
                    question.add("10+5=?")
                    question.add("8+7=?")
                    question.add("15-3=?")
                    question.add("1+12=?")
                    question.add("11+1=?")
                    question.add("15-5=?")
                    question.add("5+9=?")
                    question.add("8+2=?")
                    question.add("7+7=?")

                    answer.clear()
                    answer.add("15")
                    answer.add("15")
                    answer.add("15")
                    answer.add("12")
                    answer.add("13")
                    answer.add("12")
                    answer.add("10")
                    answer.add("14")
                    answer.add("10")
                    answer.add("14")

                    baa.clear()
                    baa.add("7")

                    baa.add("14")

                    baa.add("8")

                    baa.add("10")

                    baa.add("10")
                    baa.add("6")

                    baa.add("11")
                    baa.add("5")

                    baa.add("4")
                    baa.add("8")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("3")

                    baa.add("9")
                    baa.add("8")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("15")

                    sound.clear()
                    sound.add(R.raw.aa1)
                    sound.add(R.raw.aa2)
                    sound.add(R.raw.aa3)
                    sound.add(R.raw.aa4)
                    sound.add(R.raw.aa5)
                    sound.add(R.raw.aa6)
                    sound.add(R.raw.aa7)
                    sound.add(R.raw.aa8)
                    sound.add(R.raw.aa9)
                    sound.add(R.raw.aa10)
                }
                9 -> {
                    question.clear()
                    question.add("O'n olti sonini ko'rsating")
                    question.add("12+4=?")
                    question.add("8+8=?")
                    question.add("16-3=?")
                    question.add("1+11=?")
                    question.add("11+4=?")
                    question.add("15-5=?")
                    question.add("9+7=?")
                    question.add("4+8=?")
                    question.add("7+2=?")

                    answer.clear()
                    answer.add("16")
                    answer.add("16")
                    answer.add("16")
                    answer.add("13")
                    answer.add("12")
                    answer.add("15")
                    answer.add("10")
                    answer.add("16")
                    answer.add("12")
                    answer.add("9")

                    baa.clear()
                    baa.add("9")

                    baa.add("11")

                    baa.add("12")

                    baa.add("15")

                    baa.add("10")
                    baa.add("6")

                    baa.add("7")
                    baa.add("11")

                    baa.add("4")
                    baa.add("8")
                    baa.add("15")

                    baa.add("11")
                    baa.add("9")
                    baa.add("3")

                    baa.add("9")
                    baa.add("8")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.ba1)
                    sound.add(R.raw.ba2)
                    sound.add(R.raw.ba3)
                    sound.add(R.raw.ba4)
                    sound.add(R.raw.ba5)
                    sound.add(R.raw.ba6)
                    sound.add(R.raw.ba7)
                    sound.add(R.raw.ba8)
                    sound.add(R.raw.ba9)
                    sound.add(R.raw.ba10)
                }
                10 -> {
                    question.clear()
                    question.add("O'n yetti sonini ko'rsating")
                    question.add("10+7=?")
                    question.add("8+5=?")
                    question.add("12-3=?")
                    question.add("17-5=?")
                    question.add("11+1=?")
                    question.add("12-5=?")
                    question.add("5+9=?")
                    question.add("8+2=?")
                    question.add("7+5=?")

                    answer.clear()
                    answer.add("17")
                    answer.add("17")
                    answer.add("13")
                    answer.add("9")
                    answer.add("12")
                    answer.add("12")
                    answer.add("7")
                    answer.add("14")
                    answer.add("10")
                    answer.add("12")

                    baa.clear()
                    baa.add("9")

                    baa.add("15")

                    baa.add("11")

                    baa.add("5")

                    baa.add("10")
                    baa.add("6")

                    baa.add("16")
                    baa.add("5")

                    baa.add("4")
                    baa.add("8")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("15")

                    baa.add("9")
                    baa.add("8")
                    baa.add("15")

                    baa.add("4")
                    baa.add("16")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.bb1)
                    sound.add(R.raw.bb2)
                    sound.add(R.raw.bb3)
                    sound.add(R.raw.bb4)
                    sound.add(R.raw.bb5)
                    sound.add(R.raw.bb6)
                    sound.add(R.raw.bb7)
                    sound.add(R.raw.bb8)
                    sound.add(R.raw.bb9)
                    sound.add(R.raw.bb10)
                }
                11 -> {
                    question.clear()
                    question.add("O'n sakkiz sonini ko'rsating")
                    question.add("10+8=?")
                    question.add("8+9=?")
                    question.add("18-3=?")
                    question.add("1+15=?")
                    question.add("14+1=?")
                    question.add("16-5=?")
                    question.add("5+7=?")
                    question.add("9+2=?")
                    question.add("11+2=?")

                    answer.clear()
                    answer.add("18")
                    answer.add("18")
                    answer.add("17")
                    answer.add("15")
                    answer.add("16")
                    answer.add("15")
                    answer.add("11")
                    answer.add("12")
                    answer.add("11")
                    answer.add("13")

                    baa.clear()
                    baa.add("9")

                    baa.add("11")

                    baa.add("15")

                    baa.add("16")

                    baa.add("10")
                    baa.add("15")

                    baa.add("7")
                    baa.add("18")

                    baa.add("4")
                    baa.add("13")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("13")

                    baa.add("9")
                    baa.add("8")
                    baa.add("10")

                    baa.add("4")
                    baa.add("12")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.bc1)
                    sound.add(R.raw.bc2)
                    sound.add(R.raw.bc3)
                    sound.add(R.raw.bc4)
                    sound.add(R.raw.bc5)
                    sound.add(R.raw.bc6)
                    sound.add(R.raw.bc7)
                    sound.add(R.raw.bc8)
                    sound.add(R.raw.bc9)
                    sound.add(R.raw.bc10)
                }
                12 -> {
                    question.clear()
                    question.add("O'n to'qqiz sonini ko'rsating")
                    question.add("10+9=?")
                    question.add("9+9=?")
                    question.add("19-3=?")
                    question.add("1+14=?")
                    question.add("11+8=?")
                    question.add("12-4=?")
                    question.add("5+9=?")
                    question.add("12+5=?")
                    question.add("7+12=?")

                    answer.clear()
                    answer.add("19")
                    answer.add("19")
                    answer.add("18")
                    answer.add("16")
                    answer.add("15")
                    answer.add("19")
                    answer.add("8")
                    answer.add("14")
                    answer.add("17")
                    answer.add("19")

                    baa.clear()
                    baa.add("17")

                    baa.add("14")

                    baa.add("15")

                    baa.add("18")

                    baa.add("10")
                    baa.add("14")

                    baa.add("7")
                    baa.add("18")

                    baa.add("4")
                    baa.add("11")
                    baa.add("12")

                    baa.add("11")
                    baa.add("15")
                    baa.add("3")

                    baa.add("9")
                    baa.add("18")
                    baa.add("15")

                    baa.add("4")
                    baa.add("12")
                    baa.add("15")

                    sound.clear()
                    sound.add(R.raw.bd1)
                    sound.add(R.raw.bd2)
                    sound.add(R.raw.bd3)
                    sound.add(R.raw.bd4)
                    sound.add(R.raw.bd5)
                    sound.add(R.raw.bd6)
                    sound.add(R.raw.bd7)
                    sound.add(R.raw.bd8)
                    sound.add(R.raw.bd9)
                    sound.add(R.raw.bd10)
                }
                13 -> {
                    question.clear()
                    question.add("Yigirma sonini ko'rsating")
                    question.add("11+9=?")
                    question.add("18+2=?")
                    question.add("19-3=?")
                    question.add("1+15=?")
                    question.add("11+4=?")
                    question.add("19-5=?")
                    question.add("9+7=?")
                    question.add("11+8=?")
                    question.add("7+5=?")

                    answer.clear()
                    answer.add("20")
                    answer.add("20")
                    answer.add("20")
                    answer.add("16")
                    answer.add("16")
                    answer.add("15")
                    answer.add("14")
                    answer.add("16")
                    answer.add("19")
                    answer.add("12")

                    baa.clear()
                    baa.add("19")

                    baa.add("18")

                    baa.add("16")

                    baa.add("15")

                    baa.add("10")
                    baa.add("17")

                    baa.add("14")
                    baa.add("19")

                    baa.add("4")
                    baa.add("18")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("13")

                    baa.add("9")
                    baa.add("18")
                    baa.add("15")

                    baa.add("14")
                    baa.add("20")
                    baa.add("17")

                    sound.clear()
                    sound.add(R.raw.be1)
                    sound.add(R.raw.be2)
                    sound.add(R.raw.be3)
                    sound.add(R.raw.be4)
                    sound.add(R.raw.be5)
                    sound.add(R.raw.be6)
                    sound.add(R.raw.be7)
                    sound.add(R.raw.be8)
                    sound.add(R.raw.be9)
                    sound.add(R.raw.be10)
                }
                14 -> {
                    //vaqt  birligi
                    question.clear()
                    question.add("Ba'dan tarbiya vaqtini belgilang?")
                    question.add("Nonushta vaqtini belgilang")
                    question.add("Maktab vaqtini belgilang")
                    question.add("Uxlash vaqtini belgilang")
                    question.add("Yuvinish vaqtini belgilang")

                    image.clear()
                    image.add(R.drawable.img_1)
                    image.add(R.drawable.img_3)

                    image.add(R.drawable.img_2)
                    image.add(R.drawable.img_5)

                    image.add(R.drawable.img_3)
                    image.add(R.drawable.img_1)

                    image.add(R.drawable.img_4)
                    image.add(R.drawable.img_2)

                    image.add(R.drawable.img_5)
                    image.add(R.drawable.img_3)

                    sound.clear()
                    sound.add(R.raw.bf1)
                    sound.add(R.raw.bf2)
                    sound.add(R.raw.bf3)
                    sound.add(R.raw.bf4)
                    sound.add(R.raw.bf5)
                }
                15 -> {
                    //hafta kunlari
                    question.clear()
                    question.add("Haftaning 1-kunini belgilang")
                    question.add("Haftaning 5-kunini belgilang")
                    question.add("Haftaning 2-kunini belgilang")
                    question.add("Haftaning 4-kunini belgilang")
                    question.add("Haftaning 7-kunini belgilang")
                    question.add("Haftaning 3-kunini belgilang")
                    question.add("Haftaning 6-kunini belgilang")

                    answer.clear()
                    answer.add("Dushanba")
                    answer.add("Payshanba")

                    answer.add("Juma")
                    answer.add("Chorshanba")

                    answer.add("Seshanba")
                    answer.add("Yakshanba")

                    answer.add("Payshanba")
                    answer.add("Juma")

                    answer.add("Yakshanba")
                    answer.add("Shanba")

                    answer.add("Chorshanba")
                    answer.add("Dushanba")

                    answer.add("Shanba")
                    answer.add("Seshanba")

                    sound.clear()
                    sound.add(R.raw.bg1)
                    sound.add(R.raw.bg2)
                    sound.add(R.raw.b3)
                    sound.add(R.raw.bg4)
                    sound.add(R.raw.bg5)
                    sound.add(R.raw.bg6)
                    sound.add(R.raw.bg7)
                }
                16 -> {
                    //ogirlik olchovi
                    question.clear()
                    question.add("Tuz necha kg?")
                    question.add("Un necha kg?")
                    question.add("Karam necha kg?")
                    question.add("Qovoq necha kg?")
                    question.add("Tarvuz necha kg?")

                    image.clear()
                    image.add(R.drawable.img_15)
                    image.add(R.drawable.img_16)
                    image.add(R.drawable.img_17)
                    image.add(R.drawable.img_18)
                    image.add(R.drawable.img_19)

                    answer.clear()
                    answer.add("1")
                    answer.add("3")

                    answer.add("2")
                    answer.add("5")

                    answer.add("4")
                    answer.add("1")

                    answer.add("7")
                    answer.add("6")

                    answer.add("5")
                    answer.add("3")

                    sound.clear()
                    sound.add(R.raw.bh1)
                    sound.add(R.raw.bh2)
                    sound.add(R.raw.bh3)
                    sound.add(R.raw.bh4)
                    sound.add(R.raw.bh5)
                }
                17 -> {
                    //geomtrik shakkllar
                    question.clear()
                    question.add("Qaysi biri aylana shakli?")
                    question.add("Qaysi biri uchburchak shakli?")
                    question.add("Qaysi biri tortburchak shakli?")
                    question.add("Qaysi biri uchburchak shakli?")
                    question.add("Qaysi biri tortburchak shakli?")

                    image.clear()
                    image.add(R.drawable.img_6)
                    image.add(R.drawable.img_9)

                    image.add(R.drawable.img_7)
                    image.add(R.drawable.img_10)

                    image.add(R.drawable.img_8)
                    image.add(R.drawable.img_6)

                    image.add(R.drawable.img_7)
                    image.add(R.drawable.img_10)

                    image.add(R.drawable.img_8)
                    image.add(R.drawable.img_9)

                    sound.clear()
                    sound.add(R.raw.ca1)
                    sound.add(R.raw.ca2)
                    sound.add(R.raw.ca3)
                    sound.add(R.raw.ca4)
                    sound.add(R.raw.ca5)
                }
                18 -> {
                    //geometrik burchak
                    question.clear()
                    question.add("Qaysi biri to'gri burchak?")
                    question.add("Qaysi biri o'tkir burchak?")
                    question.add("Qaysi biri o'tmas burchak?")
                    question.add("Qaysi biri o'tkir burchak?")
                    question.add("Qaysi biri o'tmas burchak?")

                    image.clear()
                    image.add(R.drawable.aaa)
                    image.add(R.drawable.aaa1)

                    image.add(R.drawable.aaa2)
                    image.add(R.drawable.aaa1)

                    image.add(R.drawable.aaa4)
                    image.add(R.drawable.aaa3)

                    image.add(R.drawable.aaa2)
                    image.add(R.drawable.aaa1)

                    image.add(R.drawable.aaa4)
                    image.add(R.drawable.aaa)

                    sound.clear()
                    sound.add(R.raw.cb1)
                    sound.add(R.raw.cb2)
                    sound.add(R.raw.cb3)
                    sound.add(R.raw.cb4)
                    sound.add(R.raw.cb5)
                }
                19 -> {
                    //uzunlik o'lchovi
                    question.clear()
                    question.add("Kesmaning uzunligi necha sm?")
                    question.add("Kesmaning uzunligi necha sm?")
                    question.add("Kesmaning uzunligi necha sm?")
                    question.add("Kesmaning uzunligi necha sm?")
                    question.add("Qalamning uzunligi necha sm?")

                    image.clear()
                    image.add(R.drawable.img_11)
                    image.add(R.drawable.img_12)
                    image.add(R.drawable.img_13)
                    image.add(R.drawable.img_14)
                    image.add(R.drawable.img_20)

                    answer.clear()
                    answer.add("4")
                    answer.add("5")

                    answer.add("6")
                    answer.add("3")

                    answer.add("8")
                    answer.add("7")

                    answer.add("3")
                    answer.add("5")

                    answer.add("7")
                    answer.add("6")

                    sound.clear()
                    sound.add(R.raw.cc1)
                    sound.add(R.raw.cc2)
                    sound.add(R.raw.cc3)
                    sound.add(R.raw.cc3)
                    sound.add(R.raw.recording)
                }
                20 -> {
                    question.clear()
                    question.add("11+5")
                    question.add("10+2=?")
                    question.add("8+2=?")
                    question.add("12-3=?")
                    question.add("1+10=?")
                    question.add("11+1=?")
                    question.add("12-5=?")
                    question.add("5+7=?")
                    question.add("8+2=?")
                    question.add("7+2=?")

                    answer.clear()
                    answer.add("16")
                    answer.add("12")
                    answer.add("10")
                    answer.add("9")
                    answer.add("11")
                    answer.add("12")
                    answer.add("7")
                    answer.add("12")
                    answer.add("10")
                    answer.add("9")

                    baa.clear()
                    baa.add("9")

                    baa.add("11")

                    baa.add("7")

                    baa.add("5")

                    baa.add("10")
                    baa.add("6")

                    baa.add("7")
                    baa.add("5")

                    baa.add("4")
                    baa.add("8")
                    baa.add("12")

                    baa.add("11")
                    baa.add("9")
                    baa.add("3")

                    baa.add("9")
                    baa.add("8")
                    baa.add("5")

                    baa.add("4")
                    baa.add("2")
                    baa.add("7")

                    sound.clear()
                    sound.add(R.raw.cd1)
                    sound.add(R.raw.cd2)
                    sound.add(R.raw.cd3)
                    sound.add(R.raw.cd4)
                    sound.add(R.raw.cd5)
                    sound.add(R.raw.cd6)
                    sound.add(R.raw.cd7)
                    sound.add(R.raw.cd8)
                    sound.add(R.raw.cd9)
                    sound.add(R.raw.cd10)
                }
            }
            startActivity(Intent(this, TaskActivity::class.java))
        }
    }
}