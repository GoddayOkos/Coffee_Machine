import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`).next()
    println(Rainbow.values().any { it.color == input })
}

enum class Rainbow(val color: String) {
    RED("red"), ORANGE("orange"), YELLOW("yellow"), GREEN("green"),
    BLUE("blue"), INDIGO("indigo"), VIOLET("violet")
}