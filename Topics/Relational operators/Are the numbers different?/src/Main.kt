import java.util.Scanner

const val NUMBER_OF_INPUT_VALUES = 3

fun main() {
    val scanner = Scanner(System.`in`)
    val values: MutableList<Int> = mutableListOf()
    for (i in 0 until NUMBER_OF_INPUT_VALUES) {
        values.add(scanner.nextInt())
    }
    val distinctValues = values.distinct()
    println(distinctValues.count() == values.count())
}