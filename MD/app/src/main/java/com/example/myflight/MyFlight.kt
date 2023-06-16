package com.example.myflight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myflight.databinding.ActivityMyFlightBinding

class MyFlight : AppCompatActivity() {
    lateinit var binding: ActivityMyFlightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMyFlightBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.content1.setOnClickListener {
            val intent = Intent(this, MyFlightDetail::class.java)
            startActivity(intent)
        }
    }
}