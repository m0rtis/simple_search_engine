fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var total = 0
    shoppingList.forEach { if (priceList.containsKey(it)) total += priceList[it]!! }
    return total
}