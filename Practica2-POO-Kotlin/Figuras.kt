  /*
Figuras geométricas con área y perímetro.
Autor: Zela Flores Gabriel Frank - Ingeniería de Software 6 semestre
Fecha de creación: 01/09/2025
Última modificación: 01/09/2025
*/

abstract class Shape {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double

    // Usamos el polimorfismo para mostrar resultados
    fun imprimirResultados() {
        println("Área: ${calcularArea()} - Perímetro: ${calcularPerimetro()}")
    }
}

class Cuadrado(private val lado: Double) : Shape() {
    override fun calcularArea() = lado * lado
    override fun calcularPerimetro() = 4 * lado
}

class Rectangulo(private val base: Double, private val altura: Double) : Shape() {
    override fun calcularArea() = base * altura
    override fun calcularPerimetro() = 2 * (base + altura)
}

class Circulo(private val radio: Double) : Shape() {
    // Implementación específica del área usando la constante PI
    override fun calcularArea() = Math.PI * radio * radio
    override fun calcularPerimetro() = 2 * Math.PI * radio
}

fun main() {
    val cuadrado = Cuadrado(4.0)
    val rectangulo = Rectangulo(5.0, 3.0)
    val circulo = Circulo(2.5)

    // Demostración de polimorfismo: mismo metodo, comportamientos diferentes
    println("🔹 Cuadrado")
    cuadrado.imprimirResultados()

    println("🔹 Rectángulo")
    rectangulo.imprimirResultados()

    println("🔹 Círculo")
    circulo.imprimirResultados()
}
