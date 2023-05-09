class Pessoa(val anoNascimento: Int, var nome: String) { // Método construtor
    fun dormir() {

    }

    fun acordar() {

    }
}
fun main() {
    val pessoa: Pessoa = Pessoa(2005, "Fulano")

    pessoa.nome

    pessoa.acordar()
    
}