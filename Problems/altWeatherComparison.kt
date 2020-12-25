data class City(val name: String, val defaultDegrees: Int) {
    var degrees: Int = defaultDegrees
        set(value) {
            if (value >= -92 && value <= 57) field = value
        }
}

fun main() {
    val firstCity = City("Dubai", 30)
    val secondCity = City("Moscow", 5)
    val thirdCity = City("Hanoi", 20)

    firstCity.degrees = readLine()!!.toInt()
    secondCity.degrees = readLine()!!.toInt()
    thirdCity.degrees = readLine()!!.toInt()

    val cities = listOf(firstCity, secondCity, thirdCity).sortedBy { it.degrees }

    print(if (cities[0].degrees == cities[1].degrees) "neither" else cities[0].name)
}