package search

class SearchUserInterface(
    private val data: List<String>,
    private val finder: SearchEngine,
    private val dictionary: Dictionary
    ) {
    fun handle() {
        while (true) {
            showMenu()
            when(readLine()!!.toInt()) {
                1 -> handleSearchQuery()
                2 -> printAllEntries()
                0 -> return
                else -> println(dictionary.menuIncorrectOption)
            }
        }
    }

    private fun showMenu() {
        println(dictionary.menuHeader)
        dictionary.menuOptions.forEach(::println)
    }

    private fun handleSearchQuery() {
        println(dictionary.selectStrategy)
        val strategyName = readLine()!!
        println(dictionary.searchQueryRequest)

        val query = readLine()!!
        val searchResult = finder.find(query, SearchStrategy.valueOf(strategyName), data)
        if (searchResult.isNotEmpty()) {
            println(dictionary.searchResultFound)
            printList(searchResult)
        } else {
            println(dictionary.searchResultNotFound)
        }
    }

    private fun printAllEntries() {
        println(dictionary.listOfEntriesHeader)
        printList(data)
    }

    private fun printList(toPrint: List<String>) = toPrint.forEach(::println)
}