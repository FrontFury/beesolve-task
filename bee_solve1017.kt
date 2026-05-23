fun main(){
    val time = readLine()!!.toInt()
    val speed = readLine()!!.toInt()
    val fuel = (time * speed) / 12.0
    println("%.3f".format(fuel))
}