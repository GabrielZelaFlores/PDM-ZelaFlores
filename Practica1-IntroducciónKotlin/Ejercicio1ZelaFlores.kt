/*
    Este script calcula el nivel de rendimiento de un empleado en base a su puntuación,
    del 0 al 10 y su salario mensual, al final se muestra el nivel y el dinero adicional recibido.
    Autor: Zela Flores Gabriel Frank Krisna
    Fecha creación: 24/08/2025
    Última modificación: 24/08/2025
*/

// Aqui determinamos el nivel de rendimiento segun la puntuacion
fun obtenerNivel(puntuacion: Int): String {
    return when (puntuacion) {
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Puntuación inválida"
    }
}
// Función principal del programa
fun main() {
    print("Ingrese su salario mensual: ")
    val salario = readLine()!!.toDouble()

    print("Ingrese su puntuacion (0-10): ")
    val puntuacion = readLine()!!.toInt()

    // Validación de puntuación
    if (puntuacion !in 0..10) {
        println("Error: La puntuacion debe estar entre 0 y 10.")
        return
    }

    val nivel = obtenerNivel (puntuacion)
    val dineroRecibido = salario * (puntuacion.toDouble() / 10)

    // Los resultados que deberia de imprimir
    println("Nivel de rendimiento: $nivel")
    println("Cantidad de dinero recibido: $$dineroRecibido")
}

