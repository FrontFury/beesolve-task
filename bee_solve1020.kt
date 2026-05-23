fun main(){
    val days = readLine()!!.toInt()
    val years = days / 365
    val months = (days % 365)/30
    val remaindingDays = (days % 365)%30
    println("$years ano(s)")
    println("$months mes(es)")
    println("$remaindingDays dia(s)")
}