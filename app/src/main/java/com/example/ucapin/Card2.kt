package com.example.ucapin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ucapin.databinding.ActivityCard2Binding

class Card2 : AppCompatActivity() {

    private lateinit var binding: ActivityCard2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCard2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data dari intent
        val message3 = intent.getStringExtra("theMessage3") ?: "Default Message 3"
        val message4 = intent.getStringExtra("theMessage4") ?: "Default Message 4"

        // Tampilkan data ke TextView
        binding.txMsg3.text = message3
        binding.txMsg4.text = message4
    }
}
