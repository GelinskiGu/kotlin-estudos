fun main() {
    println(media2(1f, 2f, 3f, "", false))
}

fun <T, J> media2(abc: J,vararg notas: T): Float { //Tipo T é o tipo genérico
    var soma = 0f
    for (n in notas) {
        if (n is Float)
            soma += n
    }
    return(soma / notas.size)
}