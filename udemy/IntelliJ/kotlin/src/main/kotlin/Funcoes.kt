fun main() {
    helloWorld()
    println("A soma de 10 e 5 é ${sum(10, 5)}")
}

fun sum(a: Int, b: Int) = (a + b) // Function in one line. Return is optional.
// The function don't must have a return value.

fun helloWorld() {
    println("Hello World!")
}