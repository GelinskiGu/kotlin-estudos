fun main() {
    val str: String? = null

    str?.let {
        it.lowercase() // A string começará ter nome 'it' nesse escopo
        // O código apenas será executado se a variável não for nula.
    }
}