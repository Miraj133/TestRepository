package com.example.myapplication

import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),MainNavigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthFragment()
    }

     override fun openAuthFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRoot, AuthFragment())
            .commit()
    }



    override fun openOrderFragment(etPhone: String) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRoot, OrderFragment.newInstance(etPhone = etPhone))
            .addToBackStack("OrderFragment")
            .commit()
    }
}
