package com.math.matematika_2.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.math.matematika_2.R
import com.math.matematika_2.databinding.FragmentFourBinding
import com.math.matematika_2.dialog.RightDialog
import com.math.matematika_2.dialog.WrongDialog

@Suppress("DEPRECATION")
class FourFragment:DialogFragment() {
    private var BgMusic: MediaPlayer? = null
    private lateinit var binding: FragmentFourBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentFourBinding.inflate(inflater)

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

        binding.question4.text=question[i]
        binding.answer41.text=answer[i]
        binding.answer42.text=baa[i+2]
        binding.amswer43.text=baa[i+3]
        binding.answer44.text=baa[i+4]

        val mfragment= MondatDialog()
        val mbundle=Bundle()
        mfragment.arguments=mbundle

        binding.answer41.setOnClickListener {
            if(i==6){
                t++
                i++
                BgMusic= MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(requireFragmentManager(),"sdfghjkl")
                binding.question4.text=question[i]
                binding.answer42.text=answer[i]
                binding.answer41.text=baa[i+4]
                binding.answer44.text=baa[i+5]
                binding.amswer43.text=baa[i+6]
            }
            else{
                f++
                BgMusic=MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
                wrongdialog.show(requireFragmentManager(),"sdfghjkl")
            }
        }

        binding.answer42.setOnClickListener {
            if(i==7){
                t++
                i++
                BgMusic= MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(requireFragmentManager(),"sdfghjkl")
                binding.question4.text=question[i]
                binding.answer42.text=baa[i+8]
                binding.answer41.text=baa[i+6]
                binding.answer44.text=baa[i+7]
                binding.amswer43.text=answer[i]
            }
            else{
                f++
                BgMusic=MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
                wrongdialog.show(requireFragmentManager(),"sdfghjkl")
            }
        }

        binding.amswer43.setOnClickListener {
            if(i==8){
                t++
                i++
                BgMusic= MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(requireFragmentManager(),"sdfghjkl")
                binding.question4.text=question[i]
                binding.answer42.text=baa[i+9]
                binding.answer41.text=baa[i+8]
                binding.answer44.text=answer[i]
                binding.amswer43.text=baa[i+10]
            }
            else{
                f++
                BgMusic=MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
                wrongdialog.show(requireFragmentManager(),"sdfghjkl")
            }
        }

        binding.answer44.setOnClickListener {
            if(i==9){
                t++
                i++
                BgMusic= MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(requireFragmentManager(),"sdfghjkl")
                mbundle.putInt("t",t)
                mbundle.putInt("f",f)
                dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
                fragmentManager?.beginTransaction()?.add(R.id.fragment,mfragment)?.commit()
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