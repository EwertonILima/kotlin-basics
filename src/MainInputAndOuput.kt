import java.util.*

fun main() {
    println("Hello World!")

    println("*******************************************")
    val y: Int = 32
    val x: Double = 10.35784
    println(String.format("%.2f", x))
    Locale.setDefault(Locale.US)
    println(String.format("%.2f", x))

    println("*******************************************")
    val sc: Scanner = Scanner(System.`in`)
    val testString = sc.next()
    println(testString)
    val testInt = sc.nextInt()
    println(testInt)
    val testDouble = sc.nextDouble()
    println(testDouble)
    val testChar = sc.next().single()
    println(testChar)
    val testRead = readLine()!![0]
    println(testRead)

    println("*******************************************")
    val z: Int
    val s1: String
    val s2: String
    val s3: String
    z = sc.nextInt()
    sc.nextLine()
    s1 = sc.nextLine()
    s2 = sc.nextLine()
    s3 = sc.nextLine()
    println(z)
    println(s1)
    println(s2)
    println(s3)


}