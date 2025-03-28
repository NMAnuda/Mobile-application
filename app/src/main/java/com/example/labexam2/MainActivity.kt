package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val slot1View: View = findViewById(R.id.slot1)


        slot1View.setOnClickListener {
            val intent = Intent(this, Packages::class.java)
            intent.putExtra("SLOT_TIME", "8:00 - 9:30")
            startActivity(intent)
        }
    }
}