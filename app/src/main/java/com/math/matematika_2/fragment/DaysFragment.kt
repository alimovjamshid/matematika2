package com.math.matematika_2.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.math.matematika_2.R
import com.math.matematika_2.databinding.FragmentDaysBinding
import com.math.matematika_2.dialog.RightDialog
import com.math.matematika_2.dialog.WrongDialog

@Suppress("DEPRECATION")
class DaysFragment:DialogFragment() {
    private var BgMusic: MediaPlayer? = null
    private lateinit var binding: FragmentDaysBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentDaysBinding.inflate(inflater)

        var t=0
        var f=0
        var i=0

        val rightDialog = RightDialog()
        val wrongdialog= WrongDialog()

        val bundle=this.arguments
        val question:ArrayList<String> = bundle?.getStringArrayList("question") as ArrayList<String>
        val answer:ArrayList<String> = bundle.getStringArrayList("answer") as ArrayList<String>
        val sound:ArrayList<Int> = bundle.getIntegerArrayList("sound") as ArrayList<Int>

        binding.question2.text=question[0]

        binding.answer21.text=answer[0]
        binding.answer22.text=answer[1]

        val mfragment= MondatDialog()
        val mbundle=Bundle()
        mfragment.arguments=mbundle

        binding.answer21.setOnClickListener {
            when(i){
                0->{
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[1]
                    binding.answer22.text=answer[2]
                    binding.answer21.text=answer[3]
                }
                2->{
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[3]
                    binding.answer22.text=answer[6]
                    binding.answer21.text=answer[7]
                }
                4->{
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[5]
                    binding.answer22.text=answer[10]
                    binding.answer21.text=answer[11]
                }
                6->{
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    mbundle.putInt("t",t)
                    mbundle.putInt("f",f)
                    dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
                    fragmentManager?.beginTransaction()?.add(R.id.fragment,mfragment)?.commit()
                }
                else -> {
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
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[2]
                    binding.answer21.text=answer[4]
                    binding.answer22.text=answer[5]
                }
                3->{
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[4]
                    binding.answer21.text=answer[8]
                    binding.answer22.text=answer[9]
                }
                5->{
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.question2.text=question[6]
                    binding.answer21.text=answer[12]
                    binding.answer22.text=answer[13]
                }
                else -> {
                    f++
                    BgMusic=MediaPlayer.create(context, R.raw.wrong)
                    BgMusic?.start()
                    wrongdialog.show(requireFragmentManager(),"swdfghjk")
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