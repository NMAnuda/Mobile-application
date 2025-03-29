package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.buttonA)
        val login = findViewById<TextView>(R.id.login)

        login.setOnClickListener {
            val intent = Intent(this, loginsignup::class.java)
            startActivity(intent)
        }

        myButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation34)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {

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
        bottomNavigation.selectedItemId = R.id.nav_home
    }
}