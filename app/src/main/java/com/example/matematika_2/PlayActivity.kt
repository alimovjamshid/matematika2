package com.example.matematika_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.matematika_2.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayBinding
    lateinit var list: List<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)


        list=ArrayList<Item>()
        list=list+Item("1 dan 10 gacha sonlarni qo'shish va ayirish",R.drawable.ic_launcher_foreground)


        var adapter=Adapter(list=list,this@PlayActivity)
        binding.grid.adapter=adapter

        binding.grid.onItemClickListener=AdapterView.OnItemClickListener{ adapterView: AdapterView<*>, view2: View, i: Int, l: Long ->
            Toast.makeText(this, list.get(i).name, Toast.LENGTH_SHORT).show()
        }
    }
}