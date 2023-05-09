class Receita {
    lateinit var instrucoes: String // Em vez de colocar "var instrucoes?: String = null
    fun geraReceita() {
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita() {
        if (!this::instrucoes.isInitialized) { // Checa se foi inicializada
            instrucoes = "Lave as mãos."
        }
    }
}

fun main() {
    var r: Receita = Receita()
    r.geraReceita()
    println(r.instrucoes)
}