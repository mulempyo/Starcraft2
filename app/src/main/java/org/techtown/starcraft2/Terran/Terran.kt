package org.techtown.starcraft2.Terran

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.starcraft2.databinding.TerranBinding

class Terran:AppCompatActivity() {
    val binding by lazy { TerranBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val unitName = intent.getStringExtra("Name")
        val unitInfo = intent.getStringExtra("info")
        binding.name.text = unitName
        binding.info.text = unitInfo

    }
}