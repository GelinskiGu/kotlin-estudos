package heranca

private class X private constructor() // Limita visibilidade no arquivo se private estiver antes da classe.
// Se estiver no construtor, classe não pode ser instanciada

// No protected, os filhos podem acessar os métodos/atributos.
// No private, apenas a classe pode acessar os métodos/atributos.

open class Electronic(private var marca: String) {
    private fun ativarCorrente() {}
    fun ligar(){
        ativarCorrente()
    }
    fun desligar() {}
}

class Computer(marca: String) : Electronic(marca) { // Classe especializada herda da maior
    fun instalarSoftware(){} // Comportamentos específicos
    fun processar() {}

}
/*
class Computer(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}
*/


fun main() {
    val c = Computer("DELL")

    // c.ativarCorrente() . Não faz sentido ativarCorrente e ligar depois. Modificador de acesso private
    c.ligar()
    c.desligar()
    // c.marca . Está privado
}