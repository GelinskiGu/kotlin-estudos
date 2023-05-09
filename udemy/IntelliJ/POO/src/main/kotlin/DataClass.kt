fun main() {
    val f1: FormaData = FormaData(10, 8)
    var f2: FormaData = FormaData(10, 8)
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())

    f2 = f1.copy(20)
}

class Forma(val a: Int, val b: Int) { // No data class não precisa desse override
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }
}
data class FormaData(val a: Int, val b: Int)