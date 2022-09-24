package com.example.matematika_2.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.matematika_2.databinding.FragmentDaysBinding
import com.example.matematika_2.dialog.RightDialog
import com.example.matematika_2.dialog.WrongDialog

class DaysFragment:DialogFragment() {
    private var BgMusic: MediaPlayer? = null
    private lateinit var binding:FragmentDaysBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentDaysBinding.inflate(inflater)

        var t=0
        var f=0
        var i=0

        val rightDialog = RightDialog()
        val wrongdialog= WrongDialog()

        val bundle=this.arguments
        val question:ArrayList<String> = bundle?.getStringArrayList("question") as ArrayList<String>
        val answer:ArrayList<String> = bundle?.getStringArrayList("answer") as ArrayList<String>

        binding.question2.text=question[0]

        binding.answer21.text=answer[0]
        binding.answer22.text=answer[1]

        binding.answer21.setOnClickListener {
            when(i){
                0->{

                }
            }
        }

        binding.answer22.setOnClickListener {
            when(i){
                1->{

                }
                3->{

                }
                5->{

                }
            }
        }


        return binding.root
    }
}