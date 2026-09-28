package com.example.testmvvm12.repository

import com.example.testmvvm12.api.RetrofitInstance
import com.example.testmvvm12.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}