package com.example.matematika_2.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.matematika_2.PlayActivity
import com.example.matematika_2.R
import com.example.matematika_2.databinding.FragmenrTwoBinding
import com.example.matematika_2.dialog.RightDialog
import com.example.matematika_2.dialog.WrongDialog

@Suppress("DEPRECATION")
class TwoFragment:Fragment() {
    private var BgMusic: MediaPlayer? = null
    private lateinit var binding:FragmenrTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmenrTwoBinding.inflate(inflater)

        var t=0
        var f=0
        var i=0

        val rightDialog = RightDialog()
        val wrongdialog= WrongDialog()

        val bundle=this.arguments
        val question:ArrayList<String> = bundle?.getStringArrayList("question") as ArrayList<String>
        val answer:ArrayList<String> = bundle.getStringArrayList("answer") as ArrayList<String>
        val baa:ArrayList<String> = bundle.getStringArrayList("baa") as ArrayList<String>
        val sound:ArrayList<Int> = bundle.getIntegerArrayList("sound") as ArrayList<Int>
        binding.question2.text=question[i]
        binding.answer21.text=answer[i]
        binding.answer22.text=baa[i]

        val mfragment=ThreeFragment()
        val mbundle=Bundle()
        mbundle.putStringArrayList("question", PlayActivity.question)
        mbundle.putStringArrayList("answer", PlayActivity.answer)
        mbundle.putStringArrayList("baa", PlayActivity.baa)
        mbundle.putIntegerArrayList("sound",PlayActivity.sound)
        mfragment.arguments=mbundle


        binding.answer21.setOnClickListener {
            when(i){
                0->{
                    t++
                    i++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[i]
                    binding.answer21.text=baa[i]
                    binding.answer22.text=answer[i]
                }
                2->{
                    t++
                    i++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[i]
                    binding.answer21.text=baa[i]
                    binding.answer22.text=answer[i]
                }
                else->{
                    f++
                    BgMusic=MediaPlayer.create(context, R.raw.wrong)
                    BgMusic?.start()
                    wrongdialog.show(requireFragmentManager(),"swdfghjk")
                }
            }
        }

        binding.answer22.setOnClickListener {
            when(i){
                1->{
                    t++
                    i++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[i]
                    binding.answer21.text=answer[i]
                    binding.answer22.text=baa[i]
                }
                3->{
                    t++
                    i++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    mbundle.putInt("t",t)
                    mbundle.putInt("f",f)
                    mbundle.putInt("i",i)
                    fragmentManager?.beginTransaction()?.replace(R.id.fragment,mfragment)?.commit()

                }
                else->{
                    f++
                    BgMusic=MediaPlayer.create(context, R.raw.wrong)
                    BgMusic?.start()
                    wrongdialog.show(requireFragmentManager(),"sdfghjkl")
                }
            }
        }

        binding.sound.setOnClickListener {
            BgMusic=MediaPlayer.create(context, sound[i])
            BgMusic?.start()
        }

        return binding.root
    }
}