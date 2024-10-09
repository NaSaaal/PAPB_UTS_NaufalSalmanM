package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val nameInput = findViewById<EditText>(R.id.name_input)
        val submitButton = findViewById<Button>(R.id.submit_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        submitButton.setOnClickListener {
            val name = nameInput.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this, "Enter your name first", Toast.LENGTH_SHORT).show()
            } else {
                // Kirim data nama ke ProfileActivity
                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            }
        }

        cancelButton.setOnClickListener {
            // Kembali ke halaman login
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
