package com.example.matematika_2.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.matematika_2.PlayActivity
import com.example.matematika_2.R
import com.example.matematika_2.databinding.FragmenrThreeBinding
import com.example.matematika_2.dialog.RightDialog
import com.example.matematika_2.dialog.WrongDialog

@Suppress("DEPRECATION")
class ThreeFragment:Fragment() {
    private var BgMusic: MediaPlayer? = null
    private lateinit var binding:FragmenrThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmenrThreeBinding.inflate(inflater)

        val rightDialog = RightDialog()
        val wrongdialog= WrongDialog()

        val bundle=this.arguments
        val question:ArrayList<String> = bundle?.getStringArrayList("question") as ArrayList<String>
        val answer:ArrayList<String> = bundle.getStringArrayList("answer") as ArrayList<String>
        val baa:ArrayList<String> = bundle.getStringArrayList("baa") as ArrayList<String>
        val sound:ArrayList<Int> = bundle.getIntegerArrayList("sound") as ArrayList<Int>
        var i:Int= bundle.getInt("i")
        var t:Int= bundle.getInt("t")
        var f:Int= bundle.getInt("f")

        val mfragment=FourFragment()
        val mbundle=Bundle()
        mbundle.putStringArrayList("question", PlayActivity.question)
        mbundle.putStringArrayList("answer", PlayActivity.answer)
        mbundle.putStringArrayList("baa", PlayActivity.baa)
        mbundle.putIntegerArrayList("sound",PlayActivity.sound)
        mfragment.arguments=mbundle

        binding.question3.text=question[i]
        binding.answer31.text=baa[i]
        binding.answer32.text=answer[i]
        binding.answer33.text=baa[i+1]

        binding.answer31.setOnClickListener {
            f++
            BgMusic=MediaPlayer.create(context, R.raw.wrong)
            BgMusic?.start()
            wrongdialog.show(requireFragmentManager(),"sdfghjkl")
        }

        binding.answer32.setOnClickListener {
            if(i==4){
                t++
                i++
                BgMusic= MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(requireFragmentManager(),"sdfghjkl")
                binding.question3.text=question[i]
                binding.answer33.text=answer[i]
                binding.answer31.text=baa[i+1]
                binding.answer32.text=baa[i+2]
            }
            else{
                f++
                BgMusic=MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
                wrongdialog.show(requireFragmentManager(),"sdfghjkl")
            }
        }

        binding.answer33.setOnClickListener {
            if(i==5){
                t++
                i++
                BgMusic= MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(requireFragmentManager(),"sdfghjkl")
                mbundle.putInt("t",t)
                mbundle.putInt("f",f)
                mbundle.putInt("i",i)
                fragmentManager?.beginTransaction()?.replace(R.id.fragment,mfragment)?.commit()
            }
            else{
                f++
                BgMusic=MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
                wrongdialog.show(requireFragmentManager(),"sdfghjkl")
            }
        }

        binding.sound.setOnClickListener {
            BgMusic=MediaPlayer.create(context, sound[i])
            BgMusic?.start()
        }

        return binding.root
    }
}