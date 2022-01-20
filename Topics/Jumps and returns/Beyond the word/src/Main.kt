fun main() {
    var alphabet = "abcdefghijklmnopqrstuvwxyz"
    val inputString = readLine()!!
    inputString.forEach {
        alphabet = alphabet.filter { letter -> letter != it }
    }
    println(alphabet)
}