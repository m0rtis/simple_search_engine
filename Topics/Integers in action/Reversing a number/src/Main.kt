import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var inputNumber: Int = scanner.nextInt()
    var reverse: Int = 0

    while (inputNumber != 0) {
        reverse = reverse * 10 + inputNumber % 10
        inputNumber /= 10
    }
    println(reverse)
}