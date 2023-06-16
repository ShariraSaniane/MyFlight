package com.example.myflight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myflight.databinding.ActivityWeatherBinding

class Weather : AppCompatActivity() {
    lateinit var binding: ActivityWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWeatherBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.content1.setOnClickListener {
            val intent = Intent(this, WeatherDetail::class.java)
            startActivity(intent)
        }

        binding.content2.setOnClickListener {
            val intent = Intent(this, tes::class.java)
            startActivity(intent)
        }
    }
}