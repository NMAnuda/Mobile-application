package com.example.labexam2

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val slot1View: View = findViewById(R.id.slot1)
        val login = findViewById<TextView>(R.id.login)
        val todayTextView = findViewById<TextView>(R.id.todayTextView) // Reference to todayTextView

        login.setOnClickListener {
            val intent = Intent(this, loginsignup::class.java) // Assuming class name is LoginSignup
            startActivity(intent)
        }

        slot1View.setOnClickListener {
            val intent = Intent(this, Packages::class.java)
            intent.putExtra("SLOT_TIME", "8:00 - 9:30")
            startActivity(intent)
        }

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation7)
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

        val calendarButton = findViewById<Button>(R.id.calendarButton)

        calendarButton.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                this,
                { _, selectedYear, selectedMonth, selectedDay ->
                    // Format the selected date
                    val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                    // Update the todayTextView with the selected date
                    todayTextView.text = selectedDate
                },
                year,
                month,
                day
            )
            datePickerDialog.show()
        }
    }
}