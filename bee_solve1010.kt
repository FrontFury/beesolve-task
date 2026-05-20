import java.util.*

fun main(args: Array<String>) {
    val item1 = readLine()!!.split(" ")
    val productCode1 = item1[0].toInt()
    val quantity1 = item1[1].toInt()
    val productPrice1 = item1[2].toDouble()
    val item2 = readLine()!!.split(" ")
    val productCode2 = item2[0].toInt()
    val quantity2 = item2[1].toInt()
    val productPrice2 = item2[2].toDouble()
    val total = (quantity1 * productPrice1) + (quantity2 * productPrice2)
    println("VALOR A PAGAR: R\$ %.2f".format(total))	
}