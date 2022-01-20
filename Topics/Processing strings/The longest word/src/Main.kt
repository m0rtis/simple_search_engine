fun main() {
    val needle = readLine()!!.toInt()
    val haystack = readLine()!!.split(" ").map { it.toInt() }
    var times = 0
    haystack.forEach {
        if (it == needle) times++
    }
    println(times)
}