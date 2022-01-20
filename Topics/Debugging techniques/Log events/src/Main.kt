fun String?.capitalize(): String? {
    println("Before: $this")
    val capitalized = when {
        isNullOrBlank() -> this
        length == 1 -> toUpperCase()
        else -> this[0].toUpperCase() + substring(1)
    }
    println("After: $capitalized")
    return capitalized
}
