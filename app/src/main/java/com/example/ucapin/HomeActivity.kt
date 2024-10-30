package com.example.ucapin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ucapin.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreate.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("chosenCard", "Card1")
            }
            startActivity(intent)
        }

        binding.btnCreate2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("chosenCard", "Card2")
            }
            startActivity(intent)
        }
    }
}
