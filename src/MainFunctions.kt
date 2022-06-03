import java.util.Calendar
import javax.print.attribute.standard.PagesPerMinute

//Function Top Level
fun min(a: Int,b: Int): Int = if (a < b) a else b

// 'Multiple Return'
data class Time(val hour: Int, val minute: Int, val second: Int)

fun now(): Time {
    val now = Calendar.getInstance()
    with(now){
        return Time(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

//Adding Method to Existing Class
fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this[1] else null

fun main() {
    println("The least value is ${min(3, 4)}")
    println("*******************************************")

    val (h,m,s) = now()
    println("$h:$m:$s")
    println("*******************************************")

    val list = listOf("John", "Maria", "Peter")
    println(list.secondOrNull())
    println("*******************************************")
}