fun main() {
    val letter = readLine()!!.first()
    for (i in 'a'..'z') {
        if (letter == i) break
        print(i)
    }
}