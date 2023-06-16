package com.example.myflight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myflight.databinding.ActivityFlightListBinding

class FlightList : AppCompatActivity() {
    lateinit var binding: ActivityFlightListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFlightListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}