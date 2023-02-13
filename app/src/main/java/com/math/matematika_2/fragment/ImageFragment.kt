package com.math.matematika_2.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.math.matematika_2.R
import com.math.matematika_2.databinding.FragmentImageBinding
import com.math.matematika_2.dialog.RightDialog
import com.math.matematika_2.dialog.WrongDialog

@Suppress("DEPRECATION")
class ImageFragment:DialogFragment() {
    private var BgMusic: MediaPlayer? = null
    private lateinit var binding: FragmentImageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentImageBinding.inflate(inflater)

        var t=0
        var f=0
        var i=0

        val rightDialog = RightDialog()
        val wrongdialog= WrongDialog()

        val bundle=this.arguments
        val question:ArrayList<String> = bundle?.getStringArrayList("question") as ArrayList<String>
        val image:ArrayList<Int> = bundle.getIntegerArrayList("image") as ArrayList<Int>
        val sound:ArrayList<Int> = bundle.getIntegerArrayList("sound") as ArrayList<Int>

        binding.answer.text=question[0]
        binding.ikki1.setImageResource(image[0])
        binding.ikki2.setImageResource(image[1])

        val mfragment= MondatDialog()
        val mbundle=Bundle()
        mfragment.arguments=mbundle

        binding.ikki1.setOnClickListener {
            when(i) {
                0 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.answer.text = question[1]
                    binding.ikki2.setImageResource(image[2])
                    binding.ikki1.setImageResource(image[3])
                }
                2 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.answer.text = question[3]
                    binding.ikki2.setImageResource(image[6])
                    binding.ikki1.setImageResource(image[7])
                }
                4->{
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

        binding.ikki2.setOnClickListener {
            when(i) {
                1 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.answer.text = question[2]
                    binding.ikki1.setImageResource(image[4])
                    binding.ikki2.setImageResource(image[5])
                }
                3 -> {
                    i++
                    t++
                    BgMusic=MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(requireFragmentManager(),"sdfghjkl")
                    binding.answer.text = question[4]
                    binding.ikki1.setImageResource(image[8])
                    binding.ikki2.setImageResource(image[9])
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