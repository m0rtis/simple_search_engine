fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    val indices = mutableListOf<Int>()
    strings.forEachIndexed { index, item -> if (item == str) indices.add(index) }
    indices.forEach {
        strings[it] = "Banana"
    }
    return strings
}