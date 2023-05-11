package heranca

class Matematica {
    companion object NOME { // Escrever atributos e métodos que são estáticos.
        val PI = 3.1415
        fun teste() {}
        init {
            println("Fui inicializado.")
        } // Só é inicializado 1 vez. Na primeira vez que for chamado.
    } // Apenas pode definir 1 no objeto. Pode ou não ser nomeado

    object obj1 {
        // Precisa sempre ser nomeado.
        // Pode ter mais de um por classe.
        val PI = 3.1415
        fun teste() {} // Pode repetir atributos e métodos de outros objects ou companion object

        /*
        * Podem ter a função init dentro:
        *   init {
        *   }
        *
        * */
    }

    object obj2 {
        val PI = 3.1415
        fun teste() {}
    }
}

fun main() {
    Matematica.PI // Ou Matematica.NOME.PI
    Matematica.teste()

    Matematica.obj1.PI // Precisa referenciar nome no object.

    val m = Matematica()
    // m.PI: Não pode por ser static.
}