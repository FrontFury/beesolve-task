import java.util.*

fun main(args: Array<String>) {
    val employee = readLine()!!.toInt()
    val workingHours = readLine()!!.toInt()
    val perHourPay = readLine()!!.toDouble()
    val salary = workingHours * perHourPay
    println("NUMBER = $employee")
    println("SALARY = U\$ %.2f".format(salary))
}