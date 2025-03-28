package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Payments : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payemnt)


        val button:Button = findViewById(R.id.payment)

        button.setOnClickListener{
            val intent = Intent(this, Res::class.java)
            startActivity(intent)
        }


    }
}