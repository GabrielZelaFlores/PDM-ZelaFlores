/*
Clase CuentaBancaria con saldo, límite de retiro y validación de datos.
Autor: Zela Flores Gabriel Frank - Ingeniería de Software 6 semestre
Fecha de creación: 01/09/2025
Última modificación: 01/09/2025
*/

// La clase CuentaBancaria con propiedades privadas
class CuentaBancaria(private var _saldo: Double, private var _limiteRetiro: Double) {

    var saldo: Double
        get() = _saldo  // Al obtener saldo devuelve el valor de saldo
        set(value) {
            // En validacion el saldo no puede ser negativo
            if (value >= 0) _saldo = value else println("El saldo no puede ser negativo")
        }

    var limiteRetiro: Double
        get() = _limiteRetiro
        set(value) {
            // el límite debe ser mayor que 0
            if (value > 0) _limiteRetiro = value else println("El límite de retiro debe ser mayor que 0")
        }

    // Metodo para realizar retiros de la cuenta
    fun retirar(monto: Double) {
        when {
            // Caso1 monto negativo o cero
            monto <= 0 -> println("El monto debe ser mayor que 0")

            // Caso2 monto excede el límite permitido
            monto > _limiteRetiro -> println("El monto excede el límite de retiro permitido")

            // Caso3 monto excede el saldo disponible
            monto > _saldo -> println("Fondos insuficientes")

            // Caso4 todas las validaciones pasan - retiro exitoso
            else -> {
                _saldo -= monto  // Resta el monto del saldo
                println("Retiro exitoso. Saldo actual: $_saldo")
            }
        }
    }
}

// Función principal para probar la clase
fun main() {
    // Se crea un saldo inicial 1000 y límite de retiro 500
    val cuenta = CuentaBancaria(1000.0, 500.0)

    // debería ser exitoso
    cuenta.retirar(200.0)

    // debería fallar por exceder el límite
    cuenta.retirar(300.0)
}
