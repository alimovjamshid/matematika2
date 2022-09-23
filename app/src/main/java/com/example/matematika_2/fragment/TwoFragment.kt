package com.example.matematika_2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.matematika_2.databinding.FragmenrTwoBinding

class TwoFragment:Fragment() {
    private lateinit var binding:FragmenrTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmenrTwoBinding.inflate(inflater)

        val bundle=this.arguments
        val question:ArrayList<String> = bundle?.getStringArrayList("question") as ArrayList<String>
        val answer:ArrayList<String> =bundle?.getStringArrayList("answer") as ArrayList<String>
        binding.question2.text=question[0]
        binding.answer21.text=answer[0]

        binding.answer21.setOnClickListener {
            Toast.makeText(context, "sallom", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}