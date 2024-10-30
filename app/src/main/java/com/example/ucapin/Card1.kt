package com.example.ucapin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ucapin.databinding.ActivityCard1Binding

class Card1 : AppCompatActivity() {

    private lateinit var binding: ActivityCard1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding layout khusus untuk Card1
        binding = ActivityCard1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data dari intent
        val message = intent.getStringExtra("theMessage") ?: "Default Message 1"
        val message2 = intent.getStringExtra("theMessage2") ?: "Default Message 2"

        // Tampilkan data ke TextView di Card1
        binding.txMsg.text = message
        binding.txMsg2.text = message2
    }
}
