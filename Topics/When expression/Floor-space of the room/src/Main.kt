import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

const val CURRENT_PI: Double = 3.14

fun main() {
    val scanner = Scanner(System.`in`)
    val area: Double = when (scanner.nextLine()) {
        "rectangle" -> scanner.nextDouble() * scanner.nextDouble()
        "triangle" -> {
            val (a, b, c) = listOf<Double>(
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble()
            )
            val p = (a + b + c) / 2
            sqrt(p * (p - a) * (p - b) * (p - c))
        }
        "circle" -> {
            val radius = scanner.nextDouble()
            CURRENT_PI * radius.pow(2)
        }
        else -> throw IllegalArgumentException("Invalid shape given")
    }
    println(area)
}