fun main() {
    var a = 10
    var b = 20

    println("Before swapping:")
    println("a = $a")
    println("b = $b")

    // Swapping without temporary variable
    a = a + b
    b = a - b
    a = a - b

    println("After swapping:")
    println("a = $a")
    println("b = $b")
}