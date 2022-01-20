
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    val vowels: List<Char> = listOf(
        'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'
    )
    return vowels.contains(letter)
}
