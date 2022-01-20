fun main() {
    val time: List<String> = readLine()!!.split(" ")
    val date: List<String> = readLine()!!.split(" ")

    val formattedTime: String = format(time, ":")
    val formattedDate: String = format(date, "/")

    println("$formattedTime $formattedDate")
}

fun format(list: List<String>, delimiter: String): String {
    var result = ""
    list.forEachIndexed { index, s ->
        run {
            result = if (index > 0) {
                "$result$delimiter$s"
            } else {
                s
            }
        }
    }
    return result
}