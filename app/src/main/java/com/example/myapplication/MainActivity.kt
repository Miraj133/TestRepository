package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), MainNavigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthFragment()

    }
    override fun openDish() {
        DishDialog().show(supportFragmentManager,"Dish")
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

    override fun openMenuCategoriesFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRoot, MenuCategoriesFragment())
            .addToBackStack("MenuCategoriesFragment")
            .commit()

    }


}
