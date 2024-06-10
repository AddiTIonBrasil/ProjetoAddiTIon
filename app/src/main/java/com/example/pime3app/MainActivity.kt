package com.example.pime3app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pime3app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)

        //val customDrawingView = binding.customDrawingView
        //customDrawingView.setCircleAttributes(color = Color.RED, radius = 150f)
        val progressArcView = binding.arc
        progressArcView.setProgress(60) // Define o progresso como 50%

        val calendarView = binding.calendarView
        val currentTimeInMillis = System.currentTimeMillis()

        calendarView.date = currentTimeInMillis


        setContentView(binding.root)

    }
}