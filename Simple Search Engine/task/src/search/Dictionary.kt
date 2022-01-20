package search

data class Dictionary(
    val menuHeader: String,
    val menuOptions: List<String>,
    val menuIncorrectOption: String,
    val selectStrategy: String,
    val searchQueryRequest: String,
    val searchResultFound: String,
    val searchResultNotFound: String,
    val listOfEntriesHeader: String
)
