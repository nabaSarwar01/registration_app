package com.example.dem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class welcome : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }

    }
}