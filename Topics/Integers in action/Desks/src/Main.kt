fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()

    println(countDesks(first) + countDesks(second) + countDesks(third))
}

fun countDesks(pupil: Int): Int {
    return pupil / 2 + pupil % 2
}