// write your code here
fun isRightEquation(multiplierOne: Int, multiplierTwo: Int, product: Int): Boolean =
    multiplierOne * multiplierTwo == product

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}
