package org.techtown.starcraft2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import org.techtown.starcraft2.Room.Starcraft2DB
import org.techtown.starcraft2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.goButton.setOnClickListener(){
            val intent = Intent(this,NewsActivity::class.java)
            startActivity(intent)
            val  adpater:TerranAdpater ?= null
            binding.recyclerView2.adapter = adpater
            binding.recyclerView2.layoutManager = LinearLayoutManager(this)
        }

        Room.databaseBuilder(applicationContext, Starcraft2DB::class.java,"starcraft2_database")



    }


}




