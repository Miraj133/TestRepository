package com.example.myapplication

import android.util.Log

open abstract class Animal(var name: String, var age: Int) {


   init {
        this.name = name
        this.age = age
    }

    open fun voice(){
        Log.d("lesson15", "i give voice ")
    }
}