import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
val input = readLine()!!.split(" ")
    val a: Double = input[0].toDouble()
    val b: Double = input[1].toDouble()
    val c: Double = input[2].toDouble()
    val delta = (b * b) - (4 * a * c)
    if (a == 0.0 || delta < 0.0) {
        println("Impossivel calcular")
    } else {
        val r1 = (-b + sqrt(delta)) / (2 * a)
        val r2 = (-b - sqrt(delta)) / (2 * a)
        println("R1 = %.5f".format(r1))
        println("R2 = %.5f".format(r2))
    }	
}