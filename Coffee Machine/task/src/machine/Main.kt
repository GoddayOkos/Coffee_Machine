package machine

import java.util.*

val scanner = Scanner(System.`in`)

fun main() = CoffeeMachine().start()

class CoffeeMachine(private var water: Int = 400, private var milk: Int = 540, private var coffeeBeans: Int = 120,
                         private var disposableCups: Int = 9, private var money: Int = 550) {
    private var isOn: Boolean = false

    enum class Coffee(var water: Int, var milk: Int, var coffeeBeans: Int, var money: Int) {
        ESPRESSO(250, 0, 16, 4),
        LATTE(350, 75, 20, 7),
        CAPPUCCINO(200, 100, 12, 6)
    }

    fun start() {
        isOn = true
        while (isOn) {
            print("Write action (buy, fill, take, remaining, exit): ")
            when (readLine()!!.toString()) {
                "buy" -> buy()
                "fill" -> fill()
                "take" -> take()
                "remaining" -> display()
                "exit" -> isOn = false
            }
        }
    }

    private fun buy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        when (readLine()!!.toString()) {
            "1" -> enoughResources(Coffee.ESPRESSO) { makeCoffee(Coffee.ESPRESSO) }
            "2" -> enoughResources(Coffee.LATTE) { makeCoffee(Coffee.LATTE) }
            "3" -> enoughResources(Coffee.CAPPUCCINO) { makeCoffee(Coffee.CAPPUCCINO) }
            "back" -> return
        }
    }

    private fun makeCoffee(coffee: Coffee) {
        println("I have enough resources, making you a coffee!")
        water -= coffee.water
        milk -= coffee.milk
        coffeeBeans -= coffee.coffeeBeans
        disposableCups -= 1
        money += coffee.money
    }

    private fun enoughResources(coffee: Coffee, function: () -> Unit) = when {
        water < coffee.water -> println("Sorry, not enough water!")
        milk < coffee.milk -> println("Sorry, not enough milk!")
        coffeeBeans < coffee.coffeeBeans -> println("Sorry, not enough beans!")
        disposableCups < 1 -> println("Sorry, not enough cups!")
        else -> function()
    }

    private fun fill() {
        print("Write how many ml of water do you want to add: ")
        water += scanner.nextInt()
        print("Write how many ml of milk do you want to add: ")
        milk += scanner.nextInt()
        print("Write how many grams of coffee beans do you want to add: ")
        coffeeBeans += scanner.nextInt()
        print("Write how many disposable cups of coffee do you want to add: ")
        disposableCups += scanner.nextInt()
        scanner.nextLine()
        println()
    }

    private fun take() {
        println("I gave you $$money")
        money -= money
        println()
    }

    private fun display() {
        println("The coffee machine has:\n$water of water\n$milk of milk\n$coffeeBeans of coffee beans\n" +
                "$disposableCups of disposable cups\n$$money of money\n")
    }
}
