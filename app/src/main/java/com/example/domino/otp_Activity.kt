package com.example.domino

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class otp_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otp)
        var button1 = findViewById<TextView>(R.id.button2)
        button1.setOnClickListener {
            val intent1 =  Intent(this,page1::class.java)
            startActivity(intent1)
        }
    }
}