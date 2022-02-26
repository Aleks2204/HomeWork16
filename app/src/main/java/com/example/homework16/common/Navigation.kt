package com.example.homework16.common

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.homework16.R

object Navigation {
    fun navigateToFragmentFromActivity(activity: AppCompatActivity, fragment: Fragment){
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}