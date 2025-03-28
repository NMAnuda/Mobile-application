package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val slot1View: View = findViewById(R.id.slot1)
        val login = findViewById<TextView>(R.id.login)

        login.setOnClickListener {
            val intent = Intent(this, loginsignup::class.java) // Assuming class name is LoginSignup
            startActivity(intent)
        }


        slot1View.setOnClickListener {
            val intent = Intent(this, Packages::class.java)
            intent.putExtra("SLOT_TIME", "8:00 - 9:30")
            startActivity(intent)
        }
    }
}