const val HALF_LENGTH = 3

fun main() {
    val input = readLine()!!
    val firstHalf = input
        .substring(0 until HALF_LENGTH).toList()
        .map<Char, Int> { it.toString().toInt() }
    val secondHalf = input
        .substring(HALF_LENGTH..input.lastIndex).toList()
        .map<Char, Int> { it.toString().toInt() }

    println(if (firstHalf.sum() == secondHalf.sum()) "Lucky" else "Regular")
}