package com.hyeongjong.fragment_20220305.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.hyeongjong.fragment_20220305.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        requireContext() = requireActivity() 둘다 가능
        btnToastInFragment.setOnClickListener {
            Toast.makeText(requireContext(), "토스트 띄우기", Toast.LENGTH_SHORT).show()

        }

    }


}