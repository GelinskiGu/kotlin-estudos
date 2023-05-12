package lambda

// { parâmetros -> corpo }
fun main() {
    val a = {
        val s = 1
        val s2 = s * 5
        println("Hello")
    }
    // receiveA(a)
    receiveA { println("Hello") }

    // val b = { x: Int -> x * x }
    receiveB { x: Int ->
        x * x
    }

    /*val c = { x: Int, y: Int ->
        println("Executando")
        x * y // Última linha do lambda é seu retorno
    }
    receiveC(c)*/
    receiveC { x, y -> x * y }
}

// () -> Unit
fun receiveA(lambda: () -> Unit) {
    lambda()
}

fun receiveB(lambda: (x: Int) -> Int) {
}

fun receiveC(lambda: (x: Int, y: Int) -> Int) {
}