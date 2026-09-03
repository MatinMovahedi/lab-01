package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Stinger", 32)

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)

        for (pet in pets) {
            println("${pet.name}: ${pet.speak()}")
        }

        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)

        cat.pet()
        dog.pet()

        val happyMood = HappyMood("September 3, 2026")
        val sadMood = SadMood("September 3, 2026")

        println(happyMood.getMood())
        println(sadMood.getMood())
    }
}