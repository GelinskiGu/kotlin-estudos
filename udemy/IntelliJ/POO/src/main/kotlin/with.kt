fun main() {
    val p = Pessoa(1985, "Frank")
    p.acordar()
    p.dormir()

    with(p) {
        acordar()
        dormir()
        // Pode colocar variável também sem precisar do uso do this ou nome da variável.
    }
}