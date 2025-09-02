/*
Clase Producto con precio, descuento y cálculo de precio final.
Autor: Zela Flores Gabriel Frank - Ingeniería de Software 6 semestre
Fecha de creación: 01/09/2025
Última modificación: 01/09/2025
*/

class Producto(private var _precio: Double, private var _descuento: Double) {

    var precio: Double
        // se devuelve el valor almacenado en precio
        get() = _precio
        // aqui se valida y establece el nuevo valor
        set(value) {
            // el precio no puede ser negativo
            if (value >= 0) _precio = value else println(" El precio no puede ser negativo")
        }

    var descuento: Double
        // devuelve el valor almacenado en descuento
        get() = _descuento
        // valida y establece el nuevo valor
        set(value) {
            // el descuento debe estar entre 0% y 100%
            if (value in 0.0..100.0) _descuento = value else println(" El descuento debe estar entre 0 y 100")
        }

    // Metodo para calcular el precio final después del descuento
    fun calcularPrecioFinal(): Double {
        return _precio - (_precio * (_descuento / 100))
    }
}

fun main() {
    // precio 100.0 y descuento 15.0
    val prod = Producto(100.0, 15.0)

    println("Precio final: ${prod.calcularPrecioFinal()}")

    // Ejemplo de uso de los setters con validación
    prod.precio = -50.0  // Esto mostrará un mensaje de error
    prod.descuento = 150.0  // Esto mostrará un mensaje de error

    // Valores válidos
    prod.precio = 200.0
    prod.descuento = 25.0
    println("Nuevo precio final: ${prod.calcularPrecioFinal()}")
}
