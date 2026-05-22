fun main() {

    print("Enter your marks: ")
    val marks = readLine()!!.toInt()

    when {
        marks >= 80 && marks <= 100 -> println("Grade: A+")
        marks >= 70 -> println("Grade: A")
        marks >= 60 -> println("Grade: A-")
        marks >= 50 -> println("Grade: B")
        marks >= 40 -> println("Grade: C")
        marks >= 33 -> println("Grade: D")
        marks >= 0 -> println("Grade: F")
        else -> println("Invalid Marks")
    }
}