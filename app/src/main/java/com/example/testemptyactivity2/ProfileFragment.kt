package com.example.testemptyactivity2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ProfileFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val view = inflater.inflate(R.layout.fragment_profile, container, false)
        //收藏按鈕監聽
        //val btncollect : Button =view.findViewById(R.id.btncollect)
       // btncollect.setOnClickListener {
            //val fragment=CollectFragment()
            //val transaction = fragmentManager?.beginTransaction()
            //transaction?.replace(R.id.fragment,fragment)?.commit()
        return inflater.inflate(R.layout.fragment_profile, container, false)
        //}
        //return view
    }

}