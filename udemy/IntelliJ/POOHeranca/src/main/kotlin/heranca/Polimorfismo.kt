package heranca

interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario { // Para sobrescrever salário de Funcionário
    override fun bonus(): Float {
        return salario * 0.5f
    }

}
class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }

}
/* Para não fazer isso, é melhor usar Polimorfismo
fun mostraBonus(g: Gerente) {
    println(g.bonus())
}
fun mostraBonus(a: Analista) {
    println(a.bonus())
}
*/

// Vira isso:
fun mostraBonus(f: Funcionario) {
    println(f.bonus())
}

fun main() {
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))
}