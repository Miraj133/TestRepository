package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            Log.d("lesson15", "btnStart clicked")
            OrderScreenActivity.newInstance(activity = this, etPhone = etPhone.text)
        }

        val cat: Animal = Cat("barsik", 7)
        cat.voice()

        val dog: Animal = Dog("zahar", 2)
        dog.voice()

        var animal: Animal = Cat("murka", 12)
        (animal as? Cat)?.scratch()
        animal = Dog("markiz", 4)
        (animal as? Dog)?.bite()

        val names = arrayOf<String>(
            "katya",
            "tanya",
            "yana",
            "olya",
            "bella",
            "maks",
            "tolya",
            "vova",
            "zahar",
            "kolya"
        )
        val ages = intArrayOf(20, 26, 49, 45, 19, 21, 42, 22, 38, 10)

        val random = (10..15).random()
        val persons: MutableList<Person> = mutableListOf()
        repeat(random) {
            persons.add(Person(names.random(), ages.random()))
        }

        persons.forEach {
            Log.d("lesson14", "сгенерированная персона: ${it.name} ${it.age}")
        }

        persons.filter { it.age in 26..39 }.forEach {
            Log.d("lesson14", "фильтованная персона: ${it.name} ${it.age}")
        }


        val somePerson = persons.find { it.age == 22 }
        somePerson?.let {
            Log.d("lesson14", "найденная персона: ${it.name} ${it.age}")
        } ?: Log.d("lesson14", "No one found")


    }
}
