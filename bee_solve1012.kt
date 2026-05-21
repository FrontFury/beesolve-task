import java.util.*

fun main(args: Array<String>) {
val input = readLine()!!.split(" ")
    val A = input[0].toDouble()
    val B = input[1].toDouble()
    val C = input[2].toDouble()
    val pi = 3.14159
    val triangle = (A*C)/2.0
    val circle = pi * C * C
    val trapizium = ((A+B)*C)/2.0
    val square = B*B
    val rectangle = A*B
    println("TRIANGULO: %.3f".format(triangle))
    println("CIRCULO: %.3f".format(circle))
    println("TRAPEZIO: %.3f".format(trapizium))
    println("QUADRADO: %.3f".format(square))
    println("RETANGULO: %.3f".format(rectangle))	
}