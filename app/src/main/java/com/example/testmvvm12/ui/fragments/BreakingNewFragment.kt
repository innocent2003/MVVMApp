package com.example.testmvvm12.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testmvvm12.R
import com.example.testmvvm12.adapters.NewsAdapter
import com.example.testmvvm12.ui.NewsActivity

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {
	private lateinit var newsAdapter: NewsAdapter

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		newsAdapter = NewsAdapter()
		val recyclerView = view.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.rvBreakingNews)
		recyclerView.apply {
			adapter = newsAdapter
			layoutManager = LinearLayoutManager(requireContext())
		}

		val newsViewModel = (requireActivity() as NewsActivity).viewModel
		newsViewModel.breakingNews.observe(viewLifecycleOwner) { result ->
			result.data?.let { newsAdapter.differ.submitList(it.articles.toList()) }
		}
	}
}