fun main() {
    val values = readLine()!!.split(" ")
    val a = values[0].toInt()
    val b = values[1].toInt()
    val c = values[2].toInt()
    val d = values[3].toInt()
    if (b > c &&
        d > a &&
        (c + d) > (a + b) &&
        c > 0 &&
        d > 0 &&
        a % 2 == 0) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }
}