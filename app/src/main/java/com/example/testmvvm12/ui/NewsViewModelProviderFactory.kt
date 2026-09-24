package com.example.testmvvm12.ui

import android.Manifest
import kotlinx.coroutines.launch
import okio.IOException
import retrofit2.Response
import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import android.os.Build
import androidx.annotation.RequiresPermission
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.testmvvm12.NewsApplication
import com.example.testmvvm12.models.Article
import com.example.testmvvm12.models.NewsResponse
import com.example.testmvvm12.repository.NewsRepository
import com.example.testmvvm12.util.Resource
class NewsViewModelProviderFactory(
    val app: Application,
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsRepository) as T
    }
}