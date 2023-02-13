package com.example.matematika_2.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.matematika_2.PlayActivity
import com.example.matematika_2.TaskActivity
import com.example.matematika_2.databinding.MondatBinding

class MondatDialog:DialogFragment() {
    private lateinit var binding:MondatBinding
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=MondatBinding.inflate(inflater)

        val bundle=this.arguments
        val t:Int=bundle?.getInt("t") as Int
        val f:Int=bundle.getInt("f")

        binding.notogri.text= "Noto'g'ri : $f"
        binding.togri.text="To'g'ri : "+t.toString()
        binding.clear.setOnClickListener {
            startActivity(Intent(context,PlayActivity::class.java))
        }
        binding.refresh.setOnClickListener {
            startActivity(Intent(context,TaskActivity::class.java))
        }

        return binding.root
    }
}


