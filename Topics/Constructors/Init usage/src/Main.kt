fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

data class ByteTimer(var time: Int) {
    init {
        time = if (time > Byte.MAX_VALUE) {
            Byte.MAX_VALUE.toInt()
        } else if (time < Byte.MIN_VALUE) {
            Byte.MIN_VALUE.toInt()
        } else time
    }
}