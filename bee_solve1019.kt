fun main(){
    var seconds = readLine()!!.toInt()
    val hours = seconds / 3600
    seconds %= 3600
    val minutes = seconds / 60
    seconds %= 60
    println("$hours:$minutes:$seconds")
}