package com.example.testmvvm12

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
//import com.example.testmvvm12.db.ArticleDatabase
//import com.example.testmvvm12.repository.NewsRepository
import com.google.android.material.bottomnavigation.BottomNavigationView
class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

//        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}