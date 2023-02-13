package com.math.matematika_2.dialog

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.math.matematika_2.R

class RightDialog:DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        Handler(Looper.getMainLooper()).postDelayed({dismiss()},300)
        return inflater.inflate(R.layout.right, container, false)
    }
}