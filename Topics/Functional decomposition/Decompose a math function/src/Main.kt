import kotlin.math.pow

fun f(x: Double): Double {
    return when {
        x <= 0 -> f1(x)
        0.0 < x && x < 1.0 -> f2(x)
        x >= 1 -> f3(x)
        else -> throw IllegalArgumentException("X is out of possible ranges")
    }
}

// implement your functions here
fun f1(x: Double): Double = x.pow(2) + 1

fun f2(x: Double): Double = 1 / x.pow(2)

fun f3(x: Double): Double = x.pow(2) - 1