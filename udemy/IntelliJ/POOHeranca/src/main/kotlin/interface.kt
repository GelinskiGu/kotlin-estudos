interface Selvagem { // Interface representa um "contrato".
    fun atacar() { // O método na interface pode conter corpo.
        println("Atacar")
    }
    // val teste = "" // Interface não pode ter atributos/instanciar atributos pois interfaces não guardam estados.
    // Já na classe abstrata, isso é possível.
}

abstract class Mamifero2(val nome: String) {
    fun acordar() {
        println("Acordei")
    }
    fun dormir(){
        println("Dormi")
    }
    abstract fun falar() // Já que a função irá mudar em todos seus filhos, precisa marcar como abstrata.
}

class Cachorro2(nome: String) : Mamifero2(nome), Selvagem { // Kotlin não permite heranças múltiplas.
    override fun falar() { // Função abstrata precisa ser obrigatoriamente implementada.
    }
}
fun main() {
    // val m = Mamífero() . Classe abstrata não pode ser instanciada.
    // val s = Selvagem() . Interfaces não podem ser instanciadas
}