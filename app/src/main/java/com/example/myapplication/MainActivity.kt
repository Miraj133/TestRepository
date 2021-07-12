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

        val names = arrayOf<String>("katya", "tanya", "yana", "olya", "bella", "maks", "tolya", "vova", "zahar", "kolya")
        val ages = intArrayOf(20, 26, 49, 45, 19, 21, 42, 22, 38, 10)

        val random = (10..15).random()
        val persons : MutableList<Person> = mutableListOf()
        repeat(random) {
            persons.add(Person(names.random(), ages.random()))
        }


        persons.forEach {
            Log.d("less", "onCreate: ${it.name} ${it.age}")
        }
        val find = ages.find { it == 26 }
        Log.d("less", "$find")
        var filter = ages.filter { it in 26..39 }
        Log.d("less", "onCreate: $filter")


    }
}
