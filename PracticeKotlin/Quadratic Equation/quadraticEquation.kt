import kotlin.math.sqrt

fun main() {
    print("Enter value of a: ")
    val a = readLine()!!.toDouble()

    print("Enter value of b: ")
    val b = readLine()!!.toDouble()

    print("Enter value of c: ")
    val c = readLine()!!.toDouble()

    val discriminant = (b * b) - (4 * a * c)

    if (discriminant > 0) {
        val root1 = (-b + sqrt(discriminant)) / (2 * a)
        val root2 = (-b - sqrt(discriminant)) / (2 * a)

        println("Two real roots:")
        println("Root 1 = $root1")
        println("Root 2 = $root2")

    } else if (discriminant == 0.0) {
        val root = -b / (2 * a)

        println("One real root:")
        println("Root = $root")

    } else {
        println("No real roots")
    }
}