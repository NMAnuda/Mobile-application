package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout // Import RelativeLayout instead of Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Packages : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        // Find the RelativeLayout by its ID
        val cardLayout: RelativeLayout = findViewById(R.id.card_layout1)
        val login = findViewById<TextView>(R.id.login)

        login.setOnClickListener {
            val intent = Intent(this, loginsignup::class.java) // Assuming class name is LoginSignup
            startActivity(intent)
        }

        // Set the click listener
        cardLayout.setOnClickListener {
            val intent = Intent(this, Payments::class.java)
            startActivity(intent)
        }
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation5)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_bookings -> {
                    startActivity(Intent(this, History::class.java))
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, profile::class.java))
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}