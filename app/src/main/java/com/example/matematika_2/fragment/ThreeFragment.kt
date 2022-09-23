package com.example.matematika_2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.matematika_2.databinding.FragmenrThreeBinding

class ThreeFragment:Fragment() {
    private lateinit var binding:FragmenrThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmenrThreeBinding.inflate(inflater)


        return binding.root
    }
}