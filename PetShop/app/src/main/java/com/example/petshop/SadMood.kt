package com.example.petshop

class SadMood(date: String) : Mood(date) {

    override fun getMood(): String {
        return "Sad"
    }
}