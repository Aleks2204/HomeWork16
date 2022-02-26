package com.example.homework16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework16.common.Navigation.navigateToFragmentFromActivity
import com.example.homework16.ui.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToFragmentFromActivity(activity = this, fragment = MainFragment())
    }
}