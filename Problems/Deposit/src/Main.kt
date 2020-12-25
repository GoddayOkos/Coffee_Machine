import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    when (scanner.nextLine()) {
        "amount" -> interest(amount = scanner.nextInt())
        "percent" -> interest(percent = scanner.nextInt())
        "years" -> interest(years = scanner.nextInt())
    }
}

fun interest(amount: Int = 1000, percent: Int = 5, years: Int = 10) {
    println((amount * (1 + percent.toDouble() / 100).pow(years)).toInt())
}
