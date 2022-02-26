package com.example.homework16.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework16.R
import com.example.homework16.resycleView.PostCarAdapter
import com.example.homework16.resycleView.models.PostCar
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment(R.layout.fragment_main) {

    private val postCarList = listOf<PostCar>(
        PostCar(postCarTitle = "Kia Soul III", postCarDescription ="Цена: от 1 175 000 ₽" ,
            postCarImageResource = R.drawable.readcar),
        PostCar(postCarTitle = "Mitsubishi ASX I Рестайлинг 3",
            postCarDescription ="Цена:1 731 000 ₽" , postCarImageResource = R.drawable.blakccar ),
        PostCar(postCarTitle = "Renault Arkana I", postCarDescription ="Цена: от 1 098 000 ₽ " ,
            postCarImageResource = R.drawable.carbl),
        PostCar(postCarTitle = "Haval Jolion I", postCarDescription ="Цена: от 1 214 000 ₽ " ,
            postCarImageResource = R.drawable.blucar),
        PostCar(postCarTitle = "Chery Tiggo 7 Pro I", postCarDescription ="Цена: от 1 369 900 ₽ " ,
            postCarImageResource = R.drawable.whytecar),
        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initAdapter()
    }
    private fun initAdapter(){
        val adapter = PostCarAdapter()
        adapter.postCarList = postCarList
        rvPostCar.layoutManager = LinearLayoutManager(requireContext())
        rvPostCar.adapter = adapter

    }
}