package org.techtown.starcraft2


import android.content.Context
import android.content.pm.ApplicationInfo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlin.coroutines.coroutineContext

class TerranAdpater:RecyclerView.Adapter<TerranAdpater.ViewHolder>() {
    private var stdList:ArrayList<Starcraft2Model> = ArrayList()
    fun addItems(items:ArrayList<Starcraft2Model>){
        this.stdList=items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return stdList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
            val unitInfo = view.findViewById<TextView>(R.id.UnitInfoTextView)
        fun bindView(std: Starcraft2Model){
            unitInfo.text = std.unit
        }





    }
}

