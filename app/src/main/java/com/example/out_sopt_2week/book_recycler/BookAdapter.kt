package com.example.out_sopt_2week.book_recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.out_sopt_2week.R
import com.example.out_sopt_2week.data.BookData

class BookAdapter(private val context: Context):RecyclerView.Adapter<BookViewHolder>() {
    var data_books = mutableListOf<BookData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.rv_item_books, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data_books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(data_books[position])
    }
}