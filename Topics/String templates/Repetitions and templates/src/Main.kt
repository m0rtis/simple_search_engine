fun main() {
    val inputString: String = readLine()!!
    val inputStringLength: Int = inputString.length
    println("$inputStringLength repetitions of the word $inputString: ${inputString.repeat(inputStringLength)}")
}