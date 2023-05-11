package colecoes

fun main() {
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))
    val map2 = mutableMapOf<String, String>()

    println(map1)
    println(map1.entries) // Todos as entradas.
    println(map1.values) // Todos os valores.

    map2["Brasil"] = "Brasília" // Adicionar K,V ao map.
}