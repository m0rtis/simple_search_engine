fun solution(products: List<String>, product: String) {
    val indices = mutableListOf<Int>()
    products.forEachIndexed { index, item -> if (item == product) indices.add(index) }
    println(indices.joinToString(" "))
}