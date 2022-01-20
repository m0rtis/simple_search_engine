package search

class SearchEngine(private val index: Map<String, Set<Int>>) {
    companion object Indexer {
        fun makeInvertedIndex(data: List<String>, lineDelimiter: Char = ' '): Map<String, Set<Int>> {
            val mutableIndex: MutableMap<String, Set<Int>> = mutableMapOf()
            data.forEachIndexed { index, line ->
                line.split(lineDelimiter).forEach {
                    val word = it.lowercase()
                    val indices = mutableSetOf(index)
                    if (mutableIndex.containsKey(word)) {
                        indices += mutableIndex[word]!!
                    }
                    mutableIndex[word] = indices.toSet()
                }
            }
            return mutableIndex.toMap()
        }
    }

    internal object Factory {
        fun createSearchEngine(data: List<String>): SearchEngine {
            return SearchEngine(makeInvertedIndex(data))
        }
    }

    fun find(query:String, strategy: SearchStrategy, data: List<String>): List<String> {
        val indexes = strategy.search(query, index)
        return data.filterIndexed { index, _ -> index in indexes }
    }
}