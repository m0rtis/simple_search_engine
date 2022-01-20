import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val numberList = MutableList(number) { scanner.nextInt() }
    numberList.add(0, numberList.last())
    numberList.removeAt(numberList.lastIndex)

    println(numberList.joinToString(" "))
}
