package com.hyeongjong.fragment_20220305.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hyeongjong.fragment_20220305.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

//    fragment_first xml파일을, 모양으로 삼자.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        JickbangCopy와 비슷, container에 뷰를 넣겠다, 루트는 없음
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

//    프래그먼트에서의 동작 관련 코드

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnLogInFragment.setOnClickListener {

            Log.d("프래그먼트", "첫번째 프래그먼트에서 로그 찍기")

        }
    }


}