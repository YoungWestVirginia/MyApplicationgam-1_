package com.example.myapplicationgam

import kotlin.random.Random

// Interface for the game
interface Game {
    fun startGame()
    fun heroTurn()
    fun enemyTurn()
    fun checkGameOver(): Boolean
}

// Game implementation
class RPGGame(private val hero: Hero, private val enemy: Enemy) : Game {

    override fun startGame() {
        println("The game begins! ${hero.name} vs ${enemy.name}")
        while (true) {
            heroTurn()
            if (checkGameOver()) break
            enemyTurn()
            if (checkGameOver()) break
        }
    }

    override fun heroTurn() {
        println("\nHero's Turn:")
        hero.printStats()
        enemy.printStats()

        println("Choose an action: 1) Attack  2) Defend  3) Heal")
        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> hero.attack(enemy)
            2 -> hero.defend()
            3 -> hero.heal()
            else -> println("Invalid choice. You miss your turn!")
        }
    }

    override fun enemyTurn() {
        println("\nEnemy's Turn:")
        val action = Random.nextInt(1, 4)  // Randomly pick between attack, defend, heal

        when (action) {
            1 -> enemy.attack(hero)
            2 -> enemy.defend()
            3 -> enemy.heal()
        }
    }

    override fun checkGameOver(): Boolean {
        if (!hero.isAlive()) {
            println("The hero has been defeated! Game Over!")
            return true
        }

        if (!enemy.isAlive()) {
            println("The enemy has been defeated! You win!")
            return true
        }

        return false
    }
}
