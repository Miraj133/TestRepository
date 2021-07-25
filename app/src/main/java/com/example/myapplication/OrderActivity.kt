package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {


    companion object {
        private const val PHONE_KEY = "phone"
        fun newInstance(activity: Activity, etPhone: Editable) {
            val myIntent = Intent(activity, OrderActivity::class.java).apply {
                putExtra(PHONE_KEY, etPhone.toString())
            }
            activity.startActivity(myIntent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_activity)
        val etFirsText = findViewById<EditText>(R.id.etFirsText)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        etFirsText.setText(intent.getStringExtra("phone"))
    }
}