fun addUser(userMap: Map<String, String>, login: String, password: String): MutableMap<String, String> {
    val changedMap = userMap.toMutableMap()
    if (changedMap.contains(login)) {
        println("User with this login is already registered!")
    } else {
        changedMap[login] = password
    }
    return changedMap
}