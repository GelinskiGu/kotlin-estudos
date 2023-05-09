fun main() {
    val s: String? = null // Para declarar algo como null colocar '?'

    println(s?.length) // Tratar caso aja algum problema
    println(s!!.length) // Nós assumiremos qualquer erro que aconteça
}