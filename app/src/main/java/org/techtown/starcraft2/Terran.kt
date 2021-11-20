package org.techtown.starcraft2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import org.techtown.starcraft2.databinding.TerranBinding

class Terran:AppCompatActivity() {
    val binding by lazy { TerranBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val unitName = intent.getStringExtra("Name")
        val unitInfo = intent.getStringExtra("info")
        val unitImg = intent.getStringExtra("img")
        binding.name.text = unitName
        binding.info.text = unitInfo
        binding.img.loadImage(unitImg, getProgressDrawable(this))
    }
}