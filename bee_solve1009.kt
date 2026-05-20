import java.util.*

fun main(args: Array<String>) {
    val sellerName = readLine()!!
    val fixedSalary = readLine()!!.toDouble()
    val totalSell = readLine()!!.toDouble()
    val totalSalary = fixedSalary + (totalSell*0.15)
    println("TOTAL = R\$ %.2f".format(totalSalary))
}