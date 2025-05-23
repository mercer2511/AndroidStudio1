package com.example.tarea1.util

import kotlin.random.Random

object RandomUtil {
    fun randomInt(range: IntRange): Int = Random.nextInt(range.first, range.last + 1)
}
