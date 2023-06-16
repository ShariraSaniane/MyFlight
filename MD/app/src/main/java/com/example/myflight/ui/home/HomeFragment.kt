package com.example.myflight.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myflight.R
import com.example.myflight.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFlightList.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_navigation_home_to_flightList)
        )
        binding.btnMyFlight.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_navigation_home_to_myFlight)
        )
        binding.btnWeather.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_navigation_home_to_weather)
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}