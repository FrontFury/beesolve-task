fun main(){
    val passkey = "121212"
    var guess : String
    while (true){
        guess = readLine()!!.toString()
        if (guess == passkey){
            println("YES!! Permission Granted")
        }
        else{
            println("NO!! Permission Denied")
        }
    }
}