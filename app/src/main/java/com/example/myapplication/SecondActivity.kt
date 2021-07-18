package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.advanced_ui_element)
        val etFirsText = findViewById<EditText>(R.id.etFirsText)
        etFirsText.setText(intent.getStringExtra("phone"))
    }
}