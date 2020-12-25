enum class Currency(val des: String) {
    USD("United States dollar"),
    EUR("Euro"),
    GBP("Pound sterling"),
    RUB("Russian ruble"),
    UAH("Ukrainian hryvnia"),
    KZT("Kazakhstani tenge"),
    CAD("Canadian dollar"),
    JPY("Japanese yen"),
    CNY("Chinese yuan")
}

//fun main() {
//    val money = Currency.CAD
//    println(money.name)
//    println(money.des)
//    println(Currency.values().toList().map { "$it = ${it.des}" })
//}