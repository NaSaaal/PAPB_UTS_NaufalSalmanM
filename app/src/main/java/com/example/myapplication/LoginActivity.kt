package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {
            // Navigasi ke WelcomeActivity
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}
