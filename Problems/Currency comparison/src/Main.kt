import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
//    var flag = true
//    while (flag) {
//        println("Welcome to the currencies game. Enter two countries: ")
        val country1 = Country.findCountry(scanner.next().toUpperCase())
        val country2 = Country.findCountry(scanner.next().toUpperCase())
        println(country1.currency == country2.currency)
//        print("\nDo you want to play again? y - yes, any other key to quit: ")
//        flag = when (scanner.next()) {
//            "y" -> true
//            else -> false
//        }
//    }
    scanner.close()
}

enum class Country(val currency: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar"),
    NULL("");
    companion object {
        fun findCountry(country: String): Country {
            for (countries in Country.values()) {
                if (country == countries.name) return countries
            }
            return NULL
        }
    }
}


