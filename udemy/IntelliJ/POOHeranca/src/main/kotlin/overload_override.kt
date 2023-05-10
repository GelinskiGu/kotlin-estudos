open class Eletronico(var marca: String) {
	
	private fun corrente(ativo: Boolean) {
		
	}
	
	fun ligar()
	{
		corrente(true)
	}
	
	open fun desligar() {
		corrente(false)
	}
}

class Computador(marca: String) : Eletronico(marca) {
	override fun desligar() {
		save()
		super.desligar() // Para usar métodos da classe pai usar a palavra super.
	}
	
	fun save() {}
	fun save(a: Int) {} // Pode duas funções com o mesmo nome mas parâmetros diferentes.
	fun save(a: Float) {} // Tipo do parâmetro diferentes.
	// Overload é funções com mesmo nome que se diferem no tipo ou número de parâmetros.
	
	
}

fun main() {
	val c: Computador = Computador("DELL")
	c.ligar()
	c.desligar()
}
