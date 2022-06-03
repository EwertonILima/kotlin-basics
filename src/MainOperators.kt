fun main() {

    //Safe Operator
    var a: Int? = null
    println(a?.dec())
    println("*******************************************")


    //Elvis Operator
    val optional: String? = null
    val mandatory: String = optional ?: "Standard value"
    println(mandatory)
    println("*******************************************")

    //Destructuring Operator(Collection or Object)
    val (husband,wife) = listOf("John", "Maria")
    println("$husband and $wife")

    val (_, _, thirdPlace) = listOf("Kimi","Hamilton", "Alonso")
    println("$thirdPlace finished in third place")
    println("*******************************************")

    //Not-null Operator
    println("Error instant...")
    println(a!!.inc())


}