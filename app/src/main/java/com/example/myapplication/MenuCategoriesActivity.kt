package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class MenuCategoriesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipes)
        val vpMain = findViewById<ViewPager2>(R.id.vpMain)
        vpMain.adapter = ViewPagerAdapter(this).apply {
            addFragment(AllFragment())
            addFragment(FastFoodFragment())
            addFragment(DessertsFragment())
        }
    }
}