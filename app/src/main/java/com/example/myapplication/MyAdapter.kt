package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val context: Context, val userlist:List<MyDataItem>):RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    class ViewHolder(iteamView: View):RecyclerView.ViewHolder(iteamView) {
        var userid :TextView
        var title:TextView

        init {
            userid = iteamView.findViewById(R.id.textView_title)
            title = iteamView.findViewById(R.id.textview_url)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var iteamView = LayoutInflater.from(context).inflate(R.layout.row_items,parent,false)
        return ViewHolder(iteamView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userid.text = userlist[position].userId.toString()
        holder.userid.text = userlist[position].title
    }

    override fun getItemCount(): Int {
        return  userlist.size
    }

}