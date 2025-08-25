/*
    Este script que genera un número aleatorio entre 1 y 30.
    El usuario tiene 5 intentos para adivinarlo con pistas y si adivina gana,
    si se acaban los intentos pierde.
    Autor: Zela Flores Gabriel Frank
    Fecha creación: 24/08/2025
    Última modificación: 24/08/2025
*/

import kotlin.random.Random

// Inicia el juego de adivinar número
fun adivinaNumero() {
    val numeroSecreto = Random.nextInt(1, 31) // Número entre 1 y 30
    var intentos = 5

    println("=== Juego: Adivina el Número ===")
    println("He pensado un número entre 1 y 30. Tienes $intentos intentos.")

    while (intentos > 0) {
        print("Ingresa tu número: ")
        val intento = readLine()!!.toIntOrNull()

        if (intento == null || intento !in 1..30) {
            println("Entrada inválida. Debes ingresar un número entre 1 y 30.")
            continue
        }

        if (intento == numeroSecreto) {
            println("¡Felicidades! Adivinaste el número $numeroSecreto.")
            return
        } else if (intento < numeroSecreto) {
            println("El número secreto es mayor.")
        } else {
            println("El número secreto es menor.")
        }

        intentos--
        println("Te quedan $intentos intentos.")
    }

    println(" Perdiste. El número era $numeroSecreto.")
}

// Función principal
fun main() {
    adivinaNumero()
}