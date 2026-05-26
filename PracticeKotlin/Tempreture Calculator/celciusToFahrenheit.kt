fun main() {
    print("Enter temperature in Centigrade: ")
    val celsius = readLine()!!.toDouble()

    val fahrenheit = (9.0 / 5.0) * celsius + 32

    println("Temperature in Fahrenheit: $fahrenheit")
}