package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybutton: Button = findViewById(R.id.buttonA)
        val login: TextView = findViewById<TextView>(R.id.login)
login.setOnClickListener {
    val intent = Intent(this, loginsignup::class.java)
    startActivity(intent)
}

        mybutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

//ddg
    }
}