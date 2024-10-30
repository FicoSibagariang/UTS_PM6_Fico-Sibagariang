package com.example.ucapin

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ucapin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private var chosenCard: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil nilai pilihan card yang dikirim dari HomeActivity
        chosenCard = intent.getStringExtra("chosenCard")

        binding.btnCreate3.setOnClickListener {
            val nama = findViewById<EditText>(R.id.nama).text.toString()
            val greetcard = findViewById<EditText>(R.id.greetcard).text.toString()

            if (nama.isEmpty() || greetcard.isEmpty()) {
                Toast.makeText(this, "Nama dan Greetcard harus diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            when (chosenCard) {
                "Card1" -> {
                    // Buka Card1 dan kirim data
                    val intent = Intent(this, Card1::class.java).apply {
                        putExtra("theMessage", nama)
                        putExtra("theMessage2", greetcard)
                    }
                    startActivity(intent)
                }
                "Card2" -> {
                    // Buka Card2 dan kirim data
                    val intent = Intent(this, Card2::class.java).apply {
                        putExtra("theMessage3", nama)
                        putExtra("theMessage4", greetcard)
                    }
                    startActivity(intent)
                }
                else -> {
                    // Jika pilihan tidak valid, tampilkan pesan
                    Toast.makeText(this, "Pilihan card tidak valid", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
