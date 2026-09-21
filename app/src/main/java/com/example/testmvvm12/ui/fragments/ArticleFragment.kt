package com.example.testmvvm12.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.testmvvm12.R
import com.example.testmvvm12.models.Article
import com.example.testmvvm12.ui.NewsActivity
import com.google.android.material.snackbar.Snackbar

class ArticleFragment : Fragment(R.layout.fragment_article) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val article = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            requireArguments().getSerializable("article", Article::class.java)
        } else {
            @Suppress("DEPRECATION")
            requireArguments().getSerializable("article") as? Article
        } ?: return

        view.findViewById<WebView>(R.id.webView).apply {
            webViewClient = WebViewClient()
            article.url?.let(::loadUrl)
        }

        view.findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.fab)
            .setOnClickListener {
            (requireActivity() as NewsActivity).viewModel.saveArticle(article)
            Snackbar.make(view, "Article saved successfully", Snackbar.LENGTH_SHORT).show()
        }
    }
}