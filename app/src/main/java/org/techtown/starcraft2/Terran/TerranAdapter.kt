package org.techtown.starcraft2.Terran

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.techtown.starcraft2.R
import org.techtown.starcraft2.Starcraft2Unit
import org.techtown.starcraft2.databinding.ItemListBinding

class TerranAdapter(var context: Context,var unitList:ArrayList<Starcraft2Unit>):RecyclerView.Adapter<TerranAdapter.TerranHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TerranHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemListBinding>(
                inflater, R.layout.item_list,parent,
                false)
        return TerranHolder(v)

    }

    override fun onBindViewHolder(holder: TerranHolder, position: Int) {
        val newList = unitList[position]
        holder.binding.isItem =unitList[position]
        holder.binding.root.setOnClickListener{

            val unitName = newList.unitName
            val info = newList.info

            val intent = Intent(context, Terran::class.java)
            intent.putExtra("unitName",unitName)
            intent.putExtra("info",info)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return unitList.size
    }

    inner class TerranHolder(var binding: ItemListBinding):RecyclerView.ViewHolder(binding.root){}
}