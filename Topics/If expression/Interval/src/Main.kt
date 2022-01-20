fun main() {
    val firstRange = -14..12
    val secondRange = 15 until 17
    val thirdRange = 19 until Long.MAX_VALUE
    val valueToCheck = readLine()!!.toInt()

    println(
        if (valueToCheck in firstRange ||
            valueToCheck in secondRange ||
            valueToCheck in thirdRange
        ) "True" else "False"
    )
}