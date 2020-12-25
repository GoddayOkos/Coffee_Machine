import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val speed = scanner.nextInt()
    scanner.nextLine()
    val limit = scanner.nextLine()
    if (limit == "no limit") {
        speedChecker(speed = speed)
    } else {
        speedChecker(speed = speed, limit = limit.toInt())
    }
    scanner.close()
}

fun speedChecker(speed: Int = 0, limit: Int = 60) {
    if (speed > limit) {
        println("Exceeds the limit by ${speed - limit} kilometers per hour")
    } else {
        println("Within the limit")
    }
}