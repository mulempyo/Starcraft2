package org.techtown.starcraft2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.starcraft2.Protos.ProtosRecyclerView
import org.techtown.starcraft2.Terran.TerranRecyclerView
import org.techtown.starcraft2.Zerg.ZergRecyclerView
import org.techtown.starcraft2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.youtubeButton.setOnClickListener {
            val intent = Intent(this,NewsActivity::class.java)
            startActivity(intent)
        }
        binding.gameInfoButton.setOnClickListener {
            val intent = Intent(this,GameInfoActivity::class.java)
            startActivity(intent)
        }

    }
}




