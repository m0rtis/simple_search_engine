fun main() {
    val input = readLine()!!
    val toPrint = when (input.firstOrNull()) {
        'i' -> input.drop(1).toInt() + 1
        's' -> input.drop(1).reversed()
        else -> input
    }
    println(toPrint)
}