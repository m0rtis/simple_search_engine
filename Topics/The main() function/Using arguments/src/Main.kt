import java.io.File

fun main() {
    val file = File("/home/m0rtis/IdeaProjects/Simple Search Engine/Topics/The main() function/Using arguments/src/words_sequence.txt")
    println(
        file.readLines().maxOf { it.length }
    )
}