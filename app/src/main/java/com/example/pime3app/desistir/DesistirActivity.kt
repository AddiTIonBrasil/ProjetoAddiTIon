package com.example.pime3app.desistir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pime3app.databinding.ActivityDesistirBinding

class ViciosActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDesistirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDesistirBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}