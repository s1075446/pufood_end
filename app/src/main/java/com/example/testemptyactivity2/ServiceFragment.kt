package com.example.testemptyactivity2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ServiceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_service, container, false)
        //收藏按鈕監聽
        val btncollect : Button =view.findViewById(R.id.btn_save_pop)
         btncollect.setOnClickListener {
        val fragment=Service1Fragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment,fragment)?.commit()
        }
        return view
    }
}