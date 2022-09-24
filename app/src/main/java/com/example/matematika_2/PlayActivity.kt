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
        list=list+Item("Geometrik burchaklar",R.drawable.aaa2)
        list=list+Item("Uzunlik o'lchovi",R.drawable.a22)
        list=list+Item("Qo'shib ayirishni takrorlash",R.drawable.a)

        val adapter=Adapter(list=list,this@PlayActivity)
        binding.grid.adapter=adapter

        binding.grid.onItemClickListener=AdapterView.OnItemClickListener { adapterView: AdapterView<*>, view2: View, i: Int, l: Long ->
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
                    question.add("Qaysi sonlar o'zaro teng")
                    question.add("Qaysi sonlar o'zaro teng")

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
                    answer.add("2")

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
                }
                15 -> {
                    //hafta kunlari

                }
                16 -> {
                    //ogirlik olchovi

                }
                17 -> {
                    //geomtrik shakkllar

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
                }
                19 -> {
                    //uzunlik o'lchovi

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
                }
            }
            startActivity(Intent(this, TaskActivity::class.java))
        }
    }
}