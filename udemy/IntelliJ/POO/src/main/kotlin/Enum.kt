enum class Prioridade(val id: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: $id"
        }
    },
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}


fun main() {
    for (p in Prioridade.values()) {
        println(p) // Imprime "Baixa, Media, Alta"
        //println(p.id) // Imprime "1, 5, 15"
    }
}