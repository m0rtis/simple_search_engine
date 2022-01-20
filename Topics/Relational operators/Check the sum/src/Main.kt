import java.util.*

const val TWENTY = 20

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(
        isSumEqualTwenty(a, b) ||
            isSumEqualTwenty(a, c) ||
            isSumEqualTwenty(b, c)
    )
}

fun isSumEqualTwenty(first: Int, second: Int): Boolean {
    return first + second == TWENTY
}