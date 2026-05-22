fun main(){
    print("Enter Your Mark = ")
    val a = readln().toInt()

    if(a > -1){
        if (a < 101){
            if (a>79){
                println("A+")
            }
            else{
                if (a>69){
                    println("A")
                }
                else{
                    if (a>59){
                        println("A-")
                    }
                    else{
                        if (a>49){
                            println("B")
                        }
                        else{
                            if (a>39){
                                println("C")
                            }
                            else{
                                println("Fail")
                            }
                        }
                    }
                }
            }
        }else{
            println("Invalid Input")
        }
    }
    else{
        println("Invalid Input")
    }
}