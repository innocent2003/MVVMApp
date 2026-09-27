package com.example.testmvvm12.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testmvvm12.R

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

//        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}