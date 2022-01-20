import kotlin.math.abs

fun main() {
    val firstQueen = readLine()!!.split(" ").map { it.toInt() }
    val secondQueen = readLine()!!.split(" ").map { it.toInt() }

    println(if (canTake(firstQueen, secondQueen)) "YES" else "NO")
}

fun canTake(firstQueen: List<Int>, secondQueen: List<Int>): Boolean {
    val (x1, y1) = firstQueen
    val (x2, y2) = secondQueen

    val horizontal = x1 == x2
    val vertical = y1 == y2
    val diagonal = abs(x1 - x2) == abs(y1 - y2)

    return horizontal || vertical || diagonal
}
