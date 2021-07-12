package com.example.myapplication

import android.util.Log

 abstract class Animal(var name: String, var age: Int) {


    open fun voice(){
        Log.d("lesson15", "i give voice ")
    }
}