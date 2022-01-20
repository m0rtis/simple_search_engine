fun main() {
    val inputNumber = readLine()!!.toInt()
    println(
        when (0) {
            inputNumber / 10 -> 1
            inputNumber / 100 -> 2
            inputNumber / 1000 -> 3
            inputNumber / 10000 -> 4
            else -> "invalid input"
        }
    )
}