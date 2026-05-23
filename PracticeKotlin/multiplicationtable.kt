fun main(){
    print("Enter your Number : ")
    val num = readLine()!!.toInt()
    var i : Int = 0

    while (i <= 10){
        println("$i * $num = ${i*num}")
        i++
    }
}
