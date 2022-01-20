package search

enum class SearchStrategy(val search: (String, Map<String, Set<Int>>) -> Set<Int>) {
    ALL({ query: String, index: Map<String, Set<Int>> ->
        val parsed = parseQuery(query)
        val intersectingIndexes = mutableSetOf<Int>()
        for (word in parsed) {
            if (index.containsKey(word)) {
                intersectingIndexes += if (intersectingIndexes.size < 1) {
                    index[word]!!
                } else {
                    index[word]!! intersect intersectingIndexes
                }
            }
        }
        intersectingIndexes.toSet()
    }),
    ANY({ query: String, index: Map<String, Set<Int>> ->
        val parsed = parseQuery(query)
        val unitedIndexes = mutableSetOf<Int>()
        for (word in parsed) {
            if (index.containsKey(word)) {
                unitedIndexes += if (unitedIndexes.size < 1) {
                    index[word]!!
                } else {
                    index[word]!! union unitedIndexes
                }
            }
        }
        unitedIndexes.toSet()
    }),
    NONE({ query: String, index: Map<String, Set<Int>> ->
        val parsed = parseQuery(query)
        var allIndexes = setOf<Int>()
        index.forEach { _, ints -> allIndexes += ints }
        for (word in parsed) {
            if (index.containsKey(word)) {
                allIndexes = allIndexes subtract index[word]!!
            }
        }
        allIndexes
    });

    companion object Parser {
        fun parseQuery(query: String, delimiter: Char = ' '): Set<String> = query.split(delimiter).map { it.lowercase() }.toSet()
    }
}