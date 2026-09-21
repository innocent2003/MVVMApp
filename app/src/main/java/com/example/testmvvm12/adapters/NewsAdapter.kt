package com.example.testmvvm12.adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testmvvm12.R
import com.example.testmvvm12.models.Article

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val articleImage = itemView.findViewById<android.widget.ImageView>(R.id.ivArticleImage)
        val source = itemView.findViewById<android.widget.TextView>(R.id.tvSource)
        val title = itemView.findViewById<android.widget.TextView>(R.id.tvTitle)
        val description = itemView.findViewById<android.widget.TextView>(R.id.tvDescription)
        val publishedAt = itemView.findViewById<android.widget.TextView>(R.id.tvPublishedAt)
    }

    private val differCallback = object : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_article_preview,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var onItemClickListener: ((Article) -> Unit)? = null

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = differ.currentList[position]
        Glide.with(holder.itemView)
            .load(article.urlToImage)
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_foreground)
            .into(holder.articleImage)
        holder.source.text = article.source?.name.orEmpty()
        holder.title.text = article.title.orEmpty()
        holder.description.text = article.description.orEmpty()
        holder.publishedAt.text = article.publishedAt.orEmpty()

        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(article)
        }
    }

    fun setOnItemClickListener(listener: (Article) -> Unit) {
        onItemClickListener = listener
    }
}