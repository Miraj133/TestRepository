package com.example.myapplication

import android.util.Log

class Cat(name: String, age: Int) : Animal(name, age) {

    override fun voice() {
        Log.d("lesson", "i give voiсe: miu-miu ")
    }

    fun scratch() {
        Log.d("lesson", "i'm scratching ")

    }
}