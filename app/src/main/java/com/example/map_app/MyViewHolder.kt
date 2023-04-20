package com.example.map_app

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.map_app.databinding.ItemViewBinding

class MyViewHolder(itemView: ItemViewBinding) : RecyclerView.ViewHolder(itemView.root) {
    private val binding: ItemViewBinding = ItemViewBinding.bind(itemView.root)

    init {
        val imageView: ImageView = binding.imageView
        val nameView: TextView = binding.name
        val addressView: TextView = binding.address
        val direction: TextView = binding.direction
        val timeView: TextView = binding.time
    }
}
