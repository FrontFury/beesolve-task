fun main(){
    print("Enter Your Number = ")
    val a = readln().toInt()
    if (a >= 0 && a <= 100){
        if (a >= 80 && a <= 100){
            println("Your mark is $a and you got A+")
        }
        else if (a >= 70 && a <= 79){
            println("Your mark is $a and you got A")
        }
        else if (a >= 60 && a <= 69){
            println("Your mark is $a and you got A-")
        }
        else if (a >= 50 && a <= 59){
            println("Your mark is $a and you got B")
        }
        else if (a >= 40 && a <= 49){
            println("Your mark is $a and you got C")
        }
        else{
            println("Your mark is $a and you're fail")
        }
    }
    else{
        println("Invalid Input.Please Try again.....")
    }

}