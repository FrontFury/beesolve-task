fun main() {

    print("Enter a character: ")
    val ch = readLine()!![0].lowercaseChar()

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        println("Vowel")
    } else {
        println("Consonant")
    }
}