package com.example.pime3app.vicios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pime3app.databinding.ActivityViciosBinding

class ViciosActivity : AppCompatActivity() {
    private lateinit var binding : ActivityViciosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViciosBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}