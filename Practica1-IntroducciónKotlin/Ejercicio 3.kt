/*
    Este script es una calculadora básica que permite realizar suma, resta, multiplicación y división.
    Se selecciona desde el menú y se coloca los números a operar.
    Autor: Zela Flores Gabriel Frank
    Fecha creación: 24/08/2025
    Última modificación: 24/08/2025
*/

// Operaciones
fun sumar(a: Double, b: Double) = a + b
fun restar(a: Double, b: Double) = a - b
fun multiplicar(a: Double, b: Double) = a * b
fun dividir(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Error: No se puede dividir entre cero.")
        return Double.NaN
    }
    return a / b
}

// Función principal
fun main() {
    while (true) {
        println("\n=== Menú ===")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Seleccione una opción: ")

        val opcion = readLine()!!.toIntOrNull()

        if (opcion == null || opcion !in 1..5) {
            println("Opción inválida. Intente nuevamente.")
            continue
        }

        if (opcion == 5) {
            println("Saliendo de la calculadora... 👋")
            break
        }

        // Aqui pide los números
        print("Ingrese el primer número: ")
        val num1 = readLine()!!.toDouble()

        print("Ingrese el segundo número: ")
        val num2 = readLine()!!.toDouble()

        // Realiza la operacion
        val resultado = when (opcion) {
            1 -> sumar(num1, num2)
            2 -> restar(num1, num2)
            3 -> multiplicar(num1, num2)
            4 -> dividir(num1, num2)
            else -> Double.NaN
        }

        println("Resultado: $resultado")
    }
}