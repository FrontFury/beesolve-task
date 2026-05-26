fun main() {
    var a = 10
    var b = 20

    println("Before swapping:")
    println("a = $a")
    println("b = $b")

    // Swapping using temporary variable
    val temp = a
    a = b
    b = temp

    println("After swapping:")
    println("a = $a")
    println("b = $b")
}