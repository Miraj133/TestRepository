package com.example.myapplication

import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthFragment()
    }
    private fun openAuthFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRoot, AuthFragment())
            .commit()
    }
    fun openOrderFragment(etPhone:Editable){
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRoot,OrderFragment.newInstance(etPhone = etPhone))
            .commit()
    }
}
