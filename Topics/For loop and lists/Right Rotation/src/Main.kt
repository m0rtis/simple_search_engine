import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val numberList = MutableList(number) { scanner.nextInt() }
    var numberOfShifts = scanner.nextInt()
    numberOfShifts = if (numberOfShifts > number) numberOfShifts % number else numberOfShifts
    repeat(numberOfShifts) {
        numberList.add(0, numberList.last())
        numberList.removeAt(numberList.lastIndex)
    }

    println(numberList.joinToString(" "))
}
