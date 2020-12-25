data class City(val name: String) {
    var degrees: Int = -1
        set(value) {
            field = when (name) {
                "Dubai" -> if (value < -92 || value > 57) 30 else value
                "Moscow" -> if (value < -92 || value > 57) 5 else value
                "Hanoi" -> if (value < -92 || value > 57) 20 else value
                else -> 0
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    val a = firstCity.degrees
    val b = secondCity.degrees
    val c = thirdCity.degrees

    when {
        a == b && b == c -> println("neither")
        b in a + 1 until c -> println(firstCity.name)
        a in b + 1 until c -> println(secondCity.name)
        else -> println(thirdCity.name)
    }
}
