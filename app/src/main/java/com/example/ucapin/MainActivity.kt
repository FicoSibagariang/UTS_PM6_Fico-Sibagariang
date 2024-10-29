package com.example.ucapin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ucapin.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val editEmail:TextInputEditText = findViewById(R.id.enter_your_email_address)
//        val editPassword:TextInputEditText = findViewById(R.id.enter_your_password)
//        val btnLogin:Button = findViewById(R.id.btn_login)

        val correctUsername = "admin"
        val correctPassword = "admin123"

        binding.btnLogin.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()
            if (username == correctUsername && password == correctPassword) {
                Toast
                    .makeText(this, "Login Succesful", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast
                    .makeText(this, "Invalid username or password", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}