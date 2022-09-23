package com.example.matematika_2

import android.os.Bundle
import com.example.matematika_2.databinding.ActivityTaskBinding
import com.example.matematika_2.fragment.TwoFragment

class TaskActivity : PlayActivity(){
    private lateinit var binding: ActivityTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nFragment=TwoFragment()
        val bundle=Bundle()
        bundle.putStringArrayList("question", question)
        bundle.putStringArrayList("answer", answer)
        nFragment.arguments=bundle
        supportFragmentManager.beginTransaction().replace(R.id.fragment,nFragment).commit()
    }
}