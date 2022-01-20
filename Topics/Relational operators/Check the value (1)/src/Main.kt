fun main() {
    val value = readLine()!!.toInt()
    val message: Boolean = value in 1 until 10
    println(message)
}
