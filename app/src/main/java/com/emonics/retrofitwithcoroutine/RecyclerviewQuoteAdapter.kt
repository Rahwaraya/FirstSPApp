package com.emonics.retrofitwithcoroutine

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

// This is  holds the view for the recyclerview
class RecyclerviewQuoteAdapter internal  constructor(private val itemList: List<QuoteList> ):RecyclerView.Adapter<RecyclerviewQuoteAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder {


        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            {

            }

            override fun getItemCount(): Int {
                TODO("Not yet implemented")
            }

            class MyViewHolder(itemView: View) : ViewHolder(itemView) {
            }
        }
    }
}