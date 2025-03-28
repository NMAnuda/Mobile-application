package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout // Import RelativeLayout instead of Button

class Packages : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        // Find the RelativeLayout by its ID
        val cardLayout: RelativeLayout = findViewById(R.id.card_layout1)

        // Set the click listener
        cardLayout.setOnClickListener {
            val intent = Intent(this, Payments::class.java)
            startActivity(intent)
        }
    }
}