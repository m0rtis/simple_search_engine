fun main() {
    val (A, B, H) = List(3) { readLine()!!.toInt() }
    println(
        if (H in A..B) {
            "Normal"
        } else if (H < A) {
            "Deficiency"
        } else {
            "Excess"
        }
    )
}