package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        // Ambil nama dari intent
        val usernameTextView = findViewById<TextView>(R.id.username_text)
        val name = intent.getStringExtra("USER_NAME")
        usernameTextView.text = name

        val logoutButton = findViewById<Button>(R.id.logout_button)

        logoutButton.setOnClickListener {
            // Kembali ke halaman login dan tampilkan pesan logout
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "You have successfully logged out", Toast.LENGTH_SHORT).show()
        }
    }
}
