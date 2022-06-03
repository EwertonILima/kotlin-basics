import java.util.*

fun main() {

    val sc: Scanner = Scanner(System.`in`)

    println("What time is it?")
    val hour: Int = sc.nextInt()
    if (hour < 12) {
        println("Good Morning")
    } else if (hour < 18) {
        println("Good afternoon")
    } else {
        println("Good evening")
    }

    println("*******************************************")
    print("Number between 1 and 7: ")
    val x = sc.nextInt()
    val day =
        when (x) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid value"
    }
    println("Day of the week: $day")

    println("*******************************************")
    val price = 34.5
    val discount = if (price < 20.0) price * 0.1 else price * 0.05
    println("Condition to calculate: $discount.")
    val goodHumor = true
    print("Today I am ${if (goodHumor) "happy" else "sad"}.")
    sc.close()

}