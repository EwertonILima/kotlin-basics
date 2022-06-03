import java.util.*

fun main() {

    val sc: Scanner = Scanner(System.`in`)

    println("****************** WHILE ******************")
    var x = sc.nextInt()
    var sum = 0

    while (x != 0) {
        sum += x
        x = sc.nextInt()
    }
    println("Sum of the numbers: $sum")


    println("****************** FOR ********************")

    var n = sc.nextInt()

    sum = 0
    for (i in 0..n) {
        x = sc.nextInt()
        sum += x
        println("Step $i")
    }
    println("Sum of the numbers: $sum")

    println("upTo")

    for (i in 1..3) {
        println(i)
    }

    println("downTo")
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
    println("****************** DO WHILE ******************")
    x = sc.nextInt()
    sum = 0

    do {
        sum += x
        x = sc.nextInt()
    } while (x != 0)
    println("Sum of the numbers: $sum")

    sc.close()
}