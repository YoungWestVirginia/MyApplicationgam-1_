package com.example.myapplicationgam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

fun main() {
    // Create Hero and Enemy
    val hero = Hero(name = "Hero", hp = 100, atk = 20, def = 10)
    val enemy = Enemy(name = "Enemy", hp = 80, atk = 15, def = 8)

    // Start the game
    val game = RPGGame(hero, enemy)
    game.startGame()
}
