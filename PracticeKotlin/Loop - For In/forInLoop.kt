// fun main(){
//     for(i in 1..20){
//         println(i)
//     }
// }

// Odd Number using for in loop
// fun main(){
//     for(i in 1..20 step 2){
//         println(i)
//     }
// }

//Even Number : 1-20
// fun main(){
//     for(i in 2..20 step 2){
//         println(i)
//     }
// }

//Reverse Print - Downto
// fun main(){
//     for(i in 20 downTo 1){
//         println(i)
//     }
// }

//Reversly Odd & Even Check
fun main(){
    for(i in 20 downTo 1){
        println("$i is ${if (i % 2 == 0) "Even" else "Odd"}")
    }
}
