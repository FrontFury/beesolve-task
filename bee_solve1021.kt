fun main() {

    val value = readLine()!!.toDouble()
    var money = (value * 100.0).toInt()

    val noteof100 = money / 10000
    money %= 10000
    val noteof50 = money / 5000
    money %= 5000
    val noteof20 = money / 2000
    money %= 2000
    val noteof10 = money / 1000
    money %= 1000
    val noteof5 = money / 500
    money %= 500
    val noteof2 = money / 200
    money %= 200
    //Coins
    val coin1 = money / 100
    money %= 100
    val paisa50 = money / 50
    money %= 50
    val paisa25 = money / 25
    money %= 25
    val paisa10 = money / 10
    money %= 10
    val paisa5 = money / 5
    money %= 5
    val paisa1 = money

    println("NOTAS:")
    println("$noteof100 nota(s) de R$ 100.00")
    println("$noteof50 nota(s) de R$ 50.00")
    println("$noteof20 nota(s) de R$ 20.00")
    println("$noteof10 nota(s) de R$ 10.00")
    println("$noteof5 nota(s) de R$ 5.00")
    println("$noteof2 nota(s) de R$ 2.00")

    println("MOEDAS:")
    println("$coin1 moeda(s) de R$ 1.00")
    println("$paisa50 moeda(s) de R$ 0.50")
    println("$paisa25 moeda(s) de R$ 0.25")
    println("$paisa10 moeda(s) de R$ 0.10")
    println("$paisa5 moeda(s) de R$ 0.05")
    println("$paisa1 moeda(s) de R$ 0.01")
}