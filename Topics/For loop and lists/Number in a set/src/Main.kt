import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val numberList = mutableListOf<Int>()
    for (i in 1..number) {
        numberList.add(scanner.nextInt())
    }
    val m = scanner.nextInt()

    println(if (numberList.contains(m)) "YES" else "NO")
}