import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val numberList = MutableList(number) { scanner.nextInt() }
    val maxValue = numberList.maxOrNull()!!
    println(numberList.indexOfFirst { it == maxValue })
}
