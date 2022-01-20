fun main() {
    val input = readLine()!!
    val halfLength = input.length / 2
    val firstHalf = input.substring(0 until halfLength).toList().map { it.toString().toInt() }
    val secondHalf = input.substring(halfLength..input.lastIndex).toList().map { it.toString().toInt() }

    println(if (firstHalf.sum() == secondHalf.sum()) "YES" else "NO")
}