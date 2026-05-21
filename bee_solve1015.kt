import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
val p1 = readLine()!!.split(" ")
    val x1 = p1[0].toDouble()
    val y1 = p1[1].toDouble()
    val p2 = readLine()!!.split(" ")
    val x2 = p2[0].toDouble()
    val y2 = p2[1].toDouble()
    val distance = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    println("%.4f".format(distance))
}