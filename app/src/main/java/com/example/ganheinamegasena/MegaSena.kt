package com.example.ganheinamegasena

import kotlin.random.Random

class MegaSena {
    companion object {
        fun generateNumbers(size: Int): MutableSet<Int> {
            val numberSet = mutableSetOf<Int>()
            while (true) {
                val number = Random.nextInt(60)
                numberSet.add(number + 1)
                if (numberSet.size == size) break
            }
            return numberSet
        }
    }
}