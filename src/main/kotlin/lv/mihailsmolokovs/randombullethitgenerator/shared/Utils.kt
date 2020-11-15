package lv.mihailsmolokovs.randombullethitgenerator.shared

import java.time.Duration
import kotlin.random.Random

fun generateIntervalInSeconds(): Duration =
        Duration.ofSeconds(Random.nextLong(1, 6))

fun generateRandomCoordinates(): Coordinates {
    val x = Random.nextLong(1000)
    val y = Random.nextLong(1000)

    return Coordinates(x, y)
}