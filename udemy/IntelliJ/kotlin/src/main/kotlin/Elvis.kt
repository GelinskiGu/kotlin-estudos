fun main() {
    val str: String? = null

    println(str ?: "nulo" ) // Caso seja nulo, executa a instrução a direita. Isso não é operador ternário.
}