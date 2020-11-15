package lv.mihailsmolokovs.randombullethitgenerator.shared

import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.specs.StringSpec

class UtilsTest : StringSpec() {

    init {
        "generateIntervalInSeconds: returned value in seconds should be inside the allowed interval" {
            val result = generateIntervalInSeconds()

            (result.seconds in 1..5L).shouldBeTrue()
        }

        "generateRandomCoordinates: returned coordinate values should be inside the allowed interval" {
            val result = generateRandomCoordinates()

            (result.x in 0..999L).shouldBeTrue()
            (result.y in 0..999L).shouldBeTrue()
        }
    }
}