abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("Acordei")
    }
    fun dormir(){
        println("Dormi")
    }
    abstract fun falar() // Já que a função irá mudar em todos seus filhos, precisa marcar como abstrata.
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() { // Função abstrata precisa ser obrigatoriamente implementada.
    }
}
fun main() {
    // val m = Mamifero() . Classe abstrata não pode ser instanciada.
}