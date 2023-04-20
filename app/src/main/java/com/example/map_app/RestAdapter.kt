package com.example.map_app

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.map_app.databinding.ItemViewBinding

class MyAdapter(private val context: Context, private val items: List<Item>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding = ItemViewBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
        holder.binding.name.text = item.name
        holder.binding.address.text = item.address
        holder.binding.direction.text = item.direction
        holder.binding.time.text = item.time
        holder.binding.imageView.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MyViewHolder(val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root)
}
