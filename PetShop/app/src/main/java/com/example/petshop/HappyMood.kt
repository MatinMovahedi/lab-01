package com.example.petshop

class HappyMood(date: String) : Mood(date) {

    override fun getMood(): String {
        return "Happy"
    }
}