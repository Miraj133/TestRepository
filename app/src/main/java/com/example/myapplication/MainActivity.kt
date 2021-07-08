package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.advanced_ui_element)

        val cat: Animal = Cat("barsik", 7)
        cat.voice()

        val dog: Animal = Dog("zahar", 2)
        dog.voice()

        var animal: Animal = Cat("murka", 12)
        (animal as? Cat)?.scratch()
        animal = Dog("markiz", 4)
        (animal as? Dog)?.bite()
    }
}