package com.tiara.recyclerviewkotlin

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tiara.recyclerviewkotlin.SuperAdapter
import org.w3c.dom.Text

class SuperAdapter (var data : ArrayList<Supermakan>, var context: Activity?) : RecyclerView.Adapter<SuperAdapter.MyViewHolder>(){

    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val imgSupermakan = view.findViewById<ImageView>(R.id.img_item_makan)
        val nameSupermakan = view.findViewById<TextView>(R.id.tv_item_makan)

        fun bindView(supermakan: Supermakan, listener: (Supermakan) -> Unit){
            imgSupermakan.setImageResource(supermakan.imgSupermakan)
            nameSupermakan.text = supermakan.nameSupermakan
            itemView.setOnClickListener{
                listener(supermakan)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_makan, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgSupermakan.setImageResource(data[position].imgSupermakan)
        holder.nameSupermakan.text = data[position].nameSupermakan
    }

    override fun getItemCount(): Int {
        return data.size
    }


}