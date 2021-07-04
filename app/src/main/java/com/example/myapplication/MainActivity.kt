package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.advanced_ui_element)

        val maxNumber = 10
        val x = (Math.random() * maxNumber).toInt()
        val squareArea = x * x
        val circleArea = Math.PI * x * x
        Log.d("lesson14", "площадь квадрата равна $squareArea")
        Log.d("lesson14", "площадь окружности равна $circleArea")

        if (squareArea < circleArea)
            Log.d("lesson14", "площадь квадрата со стороной $x меньше площади окружности радиуса $x")
        else
            Log.d("lesson14", "площадь квадрата со стороной $x больше площади окружности радиуса $x")
    }
}