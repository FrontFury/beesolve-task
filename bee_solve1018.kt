fun main(args: Array<String>){
    var input = readLine()!!.toInt()
    var amount = input
    var noteof100 = amount / 100
    amount %= 100
    var noteof50 = amount / 50
    amount %= 50
    var noteof20 = amount / 20
    amount %= 20
    var noteof10 = amount / 10
    amount %= 10
    var noteof5 = amount / 5
    amount %= 5
    var noteof2 = amount / 2
    amount %= 2
    var noteof1 = amount
    println(input)
    println("$noteof100 nota(s) de R\$ 100,00")
    println("$noteof50 nota(s) de R\$ 50,00")
    println("$noteof20 nota(s) de R\$ 20,00")
    println("$noteof10 nota(s) de R\$ 10,00")
    println("$noteof5 nota(s) de R\$ 5,00")
    println("$noteof2 nota(s) de R\$ 2,00")
    println("$noteof1 nota(s) de R\$ 1,00")
}
