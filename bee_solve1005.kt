import java.util.*

fun main(args: Array<String>) {
    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()
    val average = ((A * 3.5) + (B * 7.5)) / 11.0
    println("MEDIA = %.5f".format(average))
}