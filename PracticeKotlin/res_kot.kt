// Fav Food Checker
fun main(){
    println("1. Burger")
    println("2. Pizza")
    println("3. Mango Juice")
    println("4. Milk Shake")
    println("========================")
    print("Enter Your Fav Food : ")
    val favFood = readln().toInt()

    if (favFood == 1){
        println("You Have Enough money for buying Burger ??")
        println("1. Yes")
        println("2. No")
        println("========================")
        print("Choose One : ")
        val choose1 = readln().toInt()
        if (choose1 == 1){
            println("Buy It")
        }
        else{
            if (choose1 == 2){
                println("Tata Bye Bye.............")
            }
            else{
                println("Invalid Input")
            }
        }
    }
    else{
        if (favFood == 2){
            println("You Have Enough money for buying Pizza ??")
            println("1. Yes")
            println("2. No")
            println("========================")
            print("Choose One : ")
            val choose2 = readln().toInt()
            if (choose2 == 1){
                println("Buy It")
            }
            else{
                if (choose2 == 2){
                    println("Tata Bye Bye, Basay giye khao.......")
                }
                else{
                    println("Invalid Input")
                }

            }
        }
        else{
            if (favFood == 3){
                println("You Have Enough money for buying Mango Juice ??")
                println("1. Yes")
                println("2. No")
                println("========================")
                print("Choose One : ")
                val choose3 = readln().toInt()
                if (choose3 == 1){
                    println("Buy It")
                }
                else{
                    if (choose3 == 2){
                        println("Tata Bye Bye.............")
                    }
                    else {
                        println("Invalid Input")
                    }
                }
            }
            else{
                if (favFood == 4){
                    println("You Have Enough money ??")
                    println("1. Yes")
                    println("2. No")
                    println("========================")
                    print("Choose One : ")
                    val choose4 = readln().toInt()
                    if (choose4 == 1){
                        println("Buy It")
                    }
                    else{
                        if (choose4 == 2){
                            println("Tata Bye Bye.............")
                        }
                        else {
                            println("Invalid Input")
                        }
                    }
                }
                else{
                    println("Invalid Input")
                }
            }
        }
    }
}