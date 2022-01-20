fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val last = numbers.last()
    numbers[numbers.lastIndex] = numbers[0]
    numbers[0] = last
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}