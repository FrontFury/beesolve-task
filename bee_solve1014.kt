import java.util.*

fun main(args: Array<String>) {
val x = readLine()!!.toInt()
    val y = readLine()!!.toDouble()
    val consumption = x/y
    println("%.3f km/l".format(consumption))
}