package com.example.testmvvm12.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testmvvm12.R
import com.example.testmvvm12.db.ArticleDatabase
import com.example.testmvvm12.repository.NewsRepository
import androidx.lifecycle.ViewModelProvider

class NewsActivity : AppCompatActivity() {
    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val repository = NewsRepository(ArticleDatabase(this))
//        viewModel = ViewModelProvider(
//            this,
//            NewsViewModelProviderFactory(application, repository)
//        )[NewsViewModel::class.java]
//        enableEdgeToEdge()
        setContentView(R.layout.activity_news)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}