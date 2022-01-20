fun main() {
    val inputString = readLine()!!
    for (symbol in inputString) {
        if (symbol.isDigit()) {
            println(symbol)
            return
        }
    }
}