/*
    Juego de piedra, papel o tijera en donde la computadora elige una opción aleatoria
    y el usuario escoge otra opcion, al final va imprimir si el usuario ganó, perdió o empató.
    Autor: Zela Flores Gabriel Frank
    Fecha creación: 24/08/2025
    Última modificación: 24/08/2025
*/

import kotlin.random.Random
 // Aqui genera la opcion aleatoria de la computadora
fun obtenerOpcionComputadora(): String {
    val opciones = listOf("piedra", "papel", "tijera")
    return opciones[Random.nextInt(opciones.size)]
}
 // Se va mostrar el resultado del juego
fun determinarResultado(usuario: String, computadora: String): String {
    return if (usuario == computadora) {
        "Empate"
    } else if (
        (usuario == "piedra" && computadora == "tijera") ||
        (usuario == "papel" && computadora == "piedra") ||
        (usuario == "tijera" && computadora == "papel")
    ) {
        "Ganaste"
    } else {
        "Perdiste"
    }
}

// Función principal del programa
fun main() {
    println("=== Juego: Piedra, Papel o Tijera ===")
    print("Elige una opcion (piedra, papel, tijera): ")

    val usuario = readLine()!!.lowercase()

    if (usuario !in listOf("piedra", "papel", "tijera")) {
        println("Opcion invalida. Debes elegir piedra, papel o tijera.")
        return
    }

    val computadora = obtenerOpcionComputadora()
    println("La computadora eligio: $computadora")

    val resultado = determinarResultado(usuario, computadora)
    println("Resultado: $resultado")
}
