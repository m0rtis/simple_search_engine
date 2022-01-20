    const val NUMBER_OF_ARGUMENTS = 3

    fun main(args: Array<String>) {
        if (args.size == NUMBER_OF_ARGUMENTS) {
            repeat(NUMBER_OF_ARGUMENTS) {
                println("Argument ${it + 1}: ${args[it]}. It has ${args[it].length} characters")
            }
        } else {
            println("Invalid number of program arguments")
        }
    }