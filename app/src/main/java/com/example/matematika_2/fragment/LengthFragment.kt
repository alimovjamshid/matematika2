package com.example.matematika_2.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.matematika_2.R
import com.example.matematika_2.databinding.FragmentLengthBinding
import com.example.matematika_2.dialog.RightDialog
import com.example.matematika_2.dialog.WrongDialog

class LengthFragment:DialogFragment() {
    private var BgMusic: MediaPlayer? = null
    private lateinit var binding:FragmentLengthBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentLengthBinding.inflate(inflater)

        var t=0
        var f=0
        var i=0

        val rightDialog = RightDialog()
        val wrongdialog= WrongDialog()

        val bundle=this.arguments
        val question:ArrayList<String> = bundle?.getStringArrayList("question") as ArrayList<String>
        val image:ArrayList<Int> = bundle?.getIntegerArrayList("image") as ArrayList<Int>
        val answer:ArrayList<String> =bundle?.getStringArrayList("answer") as ArrayList<String>

        binding.txt.text=question[0]
        binding.img.setImageResource(image[0])
        binding.btn1.text=answer[0]
        binding.btn2.text=answer[1]

        val afragment=MondatDialog()
        val abundle=Bundle()
        afragment.arguments=abundle

        binding.btn1.setOnClickListener {
            when(i) {
                0 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.txt.text = question[1]
                    binding.img.setImageResource(image[1])
                    binding.btn2.text=answer[2]
                    binding.btn1.text=answer[3]
                }
                2 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.txt.text = question[3]
                    binding.img.setImageResource(image[3])
                    binding.btn2.text=answer[6]
                    binding.btn1.text=answer[7]
                }
                4->{
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    abundle.putInt("t",t)
                    abundle.putInt("f",f)
                    dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
                    fragmentManager?.beginTransaction()?.add(R.id.fragment,afragment)?.commit()
                }
                else -> {
                    f++
                    BgMusic=MediaPlayer.create(context, R.raw.wrong)
                    BgMusic?.start()
                    wrongdialog.show(requireFragmentManager(),"swdfghjk")
                }
            }
        }

        binding.btn2.setOnClickListener {
            when(i) {
                1 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.txt.text=question[2]
                    binding.img.setImageResource(image[2])
                    binding.btn1.text=answer[4]
                    binding.btn2.text=answer[5]
                }
                3 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.txt.text=question[4]
                    binding.img.setImageResource(image[4])
                    binding.btn1.text=answer[8]
                    binding.btn2.text=answer[9]
                }
                else -> {
                    f++
                    BgMusic=MediaPlayer.create(context, R.raw.wrong)
                    BgMusic?.start()
                    wrongdialog.show(requireFragmentManager(),"swdfghjk")
                }
            }
        }

        val mfragment=MondatDialog()
        val mbundle=Bundle()
        mfragment.arguments=mbundle

        return binding.root
    }
}