class Animal(var especie: String) {
    init {
        println("Primeira coisa que executa na instanciação")
    }
    init {
        println("Init 2")
    }
}

fun main() {
    Animal("cachorro")
}