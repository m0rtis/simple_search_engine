fun main() {
    val inputString: String = readLine()!!
    val length = inputString.length
    val firstLetter = inputString.substring(0, 1)
    val lastLetter = inputString.substring(length - 1)
    val immutablePartOfString = inputString.substring(1, length - 1)
    println("$lastLetter$immutablePartOfString$firstLetter")
}