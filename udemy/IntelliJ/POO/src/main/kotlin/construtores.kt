class Pessoa2(val anoNascimento: Int, var nome: String) { // Método construtor
    var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc
    }
    // Construtor secundário
    fun dormir() {

    }

    fun acordar() {

    }
}
fun main() {
    val pessoa: Pessoa2 = Pessoa2(2005, "Fulano", "2342341")
    // Recebe parâmetro a mais
}