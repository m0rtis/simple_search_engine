fun main() {
    val color = readLine()!!.lowercase()
    println(Rainbow.isColorInRainbow(color))
}

enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");

    companion object {
        fun isColorInRainbow(color: String): Boolean {
            for (rainbow in values()) {
                if (color == rainbow.color) return true
            }
            return false
        }
    }
}