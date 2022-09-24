package com.example.matematika_2

import android.os.Bundle
import com.example.matematika_2.databinding.ActivityTaskBinding
import com.example.matematika_2.fragment.DaysFragment
import com.example.matematika_2.fragment.ImageFragment
import com.example.matematika_2.fragment.TwoFragment

class TaskActivity : PlayActivity(){
    private lateinit var binding: ActivityTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nFragment = TwoFragment()
        val mFragment = ImageFragment()
        val kFragment = DaysFragment()
        val bundle = Bundle()
        bundle.putStringArrayList("question", question)
        bundle.putStringArrayList("answer", answer)
        bundle.putStringArrayList("baa", baa)
        bundle.putIntegerArrayList("image", image)
        nFragment.arguments = bundle
        mFragment.arguments=bundle
        kFragment.arguments=bundle
        if (j <= 13 || j == 20) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment, nFragment).commit()
        }
        when(j){
            14->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment, mFragment).commit()
            }
            15->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment, kFragment).commit()
            }
            17->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment, mFragment).commit()
            }
            18->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment, mFragment).commit()
            }
            19->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment, mFragment).commit()
            }
            else->{

            }
        }
    }
}