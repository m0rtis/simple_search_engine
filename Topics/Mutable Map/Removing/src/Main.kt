fun removing(currentMap: MutableMap<Int, String>, value: String) : MutableMap<Int, String> {
    return currentMap.filterNot { it.value == value }.toMutableMap()
}