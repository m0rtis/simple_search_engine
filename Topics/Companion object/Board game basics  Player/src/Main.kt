class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var nextId = 1
        private const val FULL_HP = 100

        fun create(name: String): Player = Player(++nextId, name, hp = FULL_HP)
    }
}