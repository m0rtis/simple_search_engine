package search

import java.io.File

fun main(args: Array<String>) {
    val fileName = args.getOption("--data")
    val data = File(fileName).readLines()
    val engine = SearchEngine.Factory.createSearchEngine(data)
    val strategyNames = SearchStrategy.values().joinToString(", ") { it.name }
    val dictionary = Dictionary(
        menuHeader = "=== Menu ===",
        menuOptions = listOf(
            "1. Find an office",
            "2. Print all offices",
            "0. Exit"
        ),
        menuIncorrectOption = "Incorrect option! Try again.",
        selectStrategy = "Select a matching strategy: $strategyNames",
        searchQueryRequest = "Enter office name or part of address:",
        searchResultFound = "Office(s) found:",
        searchResultNotFound = "No matching offices found.",
        listOfEntriesHeader = "=== List of the offices ==="
    )

    SearchUserInterface(data, engine, dictionary).handle()

    println("Bye!")
}

private fun <String> Array<String>.getOption(name: String): String {
    if (!contains(name)) throw IllegalArgumentException("Option $name is obligatory")
    val optionIndex = indexOf(name) + 1
    return this[optionIndex]
}
