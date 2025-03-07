package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(private val newsList:ArrayList<Post>):RecyclerView.Adapter<Adapter.MyVieu>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyVieu {

       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list, parent,false)
        return MyVieu(itemView)
    }

    override fun onBindViewHolder(holder: Adapter.MyVieu, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.text3.text = currentItem.heading
    }




    override fun getItemCount(): Int {
        return newsList.size

    }

    class MyVieu(itemView: View):RecyclerView.ViewHolder(itemView) {

        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title)
        val text3: TextView = itemView.findViewById(R.id.text3)
    }
}



