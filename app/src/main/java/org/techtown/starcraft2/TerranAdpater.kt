package org.techtown.starcraft2


import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import dagger.hilt.android.qualifiers.ApplicationContext
import org.techtown.starcraft2.Room.DatabaseModule
import org.techtown.starcraft2.Room.Starcraft2DB

class TerranAdpater:RecyclerView.Adapter<TerranAdpater.ViewHolder>() {
private var list = listOf<DatabaseModule>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val recyclerView:RecyclerView = view.findViewById(R.id.recyclerView2)

    }
}




