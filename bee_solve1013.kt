import java.util.*

fun main(args: Array<String>) {
    var (A, B, C) = readLine()!!.split(" ")
    val a = A.toInt()
    val b = B.toInt()
    val c = C.toInt()
    val step01 = ((a + b) + Math.abs ( a - b ) ) / 2
    val step02 = ((step01 + c) + Math.abs( step01 - c ) ) / 2
    println("$step02 eh o maior")
}