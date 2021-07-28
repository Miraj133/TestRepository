package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthFragment()
        openOrderFragment()
    }
    private fun openAuthFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRoot, AuthFragment())
            .commit()
    }
    private fun openOrderFragment(etPhone:String){
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRoot,OrderFragment.newInstance(etPhone = etPhone))
            .commit()
    }
}
