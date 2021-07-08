package com.example.myapplication

import android.util.Log

class Dog(name: String, age: Int) : Animal(name, age) {

    init {
        super.age = age
        super.name = name
    }

    fun bite() {
        Log.d("lesson15", " i bite: kus'")
    }

    override fun voice() {
        Log.d("lesson", "i give voice: vuf-vuf ")
    }
}
