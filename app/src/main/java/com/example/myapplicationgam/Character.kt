package com.example.myapplicationgam

// Interface for common actions
interface Actionable {
    fun attack(target: Character)
    fun defend()
    fun heal()
}

// Character base class
abstract class Character(
    var name: String,
    var hp: Int,
    var atk: Int,
    var def: Int
) {
    abstract fun printStats()

    fun isAlive(): Boolean {
        return hp > 0
    }
}