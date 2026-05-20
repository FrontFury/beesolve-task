import java.util.*

fun main(args: Array<String>) {

    val sum = 10
    val d = readLine()!!.toDouble()
    val e = readLine()!!.toDouble()
    val f = readLine()!!.toDouble()
    val avg = (2 * d + 3 * e + 5*f)/sum
    println("MEDIA = %.1f".format(avg))
	
}