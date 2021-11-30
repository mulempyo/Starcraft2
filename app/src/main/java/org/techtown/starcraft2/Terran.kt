package org.techtown.starcraft2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.appcheck.FirebaseAppCheck
import com.google.firebase.appcheck.debug.DebugAppCheckProviderFactory
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