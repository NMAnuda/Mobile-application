package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class History : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)


        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation4)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_bookings -> {

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
        bottomNavigation.selectedItemId = R.id.nav_bookings
    }
}