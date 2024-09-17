package com.example.myapplicationgam

// Hero class
class Hero(
    name: String,
    hp: Int,
    atk: Int,
    def: Int
) : Character(name, hp, atk, def), Actionable {

    override fun attack(target: Character) {
        val damage = atk - target.def
        if (damage > 0) {
            target.hp -= damage
            println("$name attacks ${target.name} for $damage damage!")
        } else {
            println("$name's attack is too weak to penetrate ${target.name}'s defense!")
        }
    }

    override fun defend() {
        def += 5
        println("$name is defending, increasing DEF by 5!")
    }

    override fun heal() {
        val healAmount = 10
        hp += healAmount
        println("$name heals for $healAmount HP!")
    }

    override fun printStats() {
        println("Hero Stats: Name: $name, HP: $hp, ATK: $atk, DEF: $def")
    }
}

// Enemy class
class Enemy(
    name: String,
    hp: Int,
    atk: Int,
    def: Int
) : Character(name, hp, atk, def), Actionable {

    override fun attack(target: Character) {
        val damage = atk - target.def
        if (damage > 0) {
            target.hp -= damage
            println("$name attacks ${target.name} for $damage damage!")
        } else {
            println("$name's attack is too weak to penetrate ${target.name}'s defense!")
        }
    }

    override fun defend() {
        def += 5
        println("$name is defending, increasing DEF by 5!")
    }

    override fun heal() {
        val healAmount = 10
        hp += healAmount
        println("$name heals for $healAmount HP!")
    }

    override fun printStats() {
        println("Enemy Stats: Name: $name, HP: $hp, ATK: $atk, DEF: $def")
    }
}
