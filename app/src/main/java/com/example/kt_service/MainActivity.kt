package com.example.kt_service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var intent = Intent(this, MyService::class.java)
            startService(intent);
            val toast = Toast.makeText(this, "啟動Service", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}