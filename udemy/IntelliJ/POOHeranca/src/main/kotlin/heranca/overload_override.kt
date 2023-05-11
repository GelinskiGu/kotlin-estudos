package heranca

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
		super.desligar() // Para usar m�todos da classe pai usar a palavra super.
	}
	
	fun save() {}
	fun save(a: Int) {} // Pode duas fun��es com o mesmo nome mas par�metros diferentes.
	fun save(a: Float) {} // Tipo do par�metro diferentes.
	// Overload � fun��es com mesmo nome que se diferem no tipo ou n�mero de par�metros.
	
	
}

fun main() {
	val c: Computador = Computador("DELL")
	c.ligar()
	c.desligar()
}
