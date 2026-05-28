fun main() {
    val n = readLine()!!.toDouble()
    when {
        n >= 0 && n <= 25 -> println("Intervalo [0,25]")
        n > 25 && n <= 50 -> println("Intervalo (25,50]")
        n > 50 && n <= 75 -> println("Intervalo (50,75]")
        n > 75 && n <= 100 -> println("Intervalo (75,100]")
        else -> println("Fora de intervalo")
    }
}