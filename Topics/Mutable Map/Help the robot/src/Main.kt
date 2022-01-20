fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    return purchases.toMutableMap().apply {
        addition.onEach { (k, v) -> merge(k, v, Int::plus)}
    }
}