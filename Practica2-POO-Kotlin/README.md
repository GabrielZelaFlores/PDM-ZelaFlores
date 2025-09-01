# Práctica 2 – Programación Orientada a Objetos en Kotlin

Este repositorio contiene la **Práctica 2 del curso Programación para Dispositivos Móviles**, donde se resuelven 4 ejercicios aplicando **Programación Orientada a Objetos (POO) en Kotlin**, con clases, herencia, abstracción, encapsulamiento, validaciones y buenas prácticas de programación.

## Autor

* **Nombre:** Zela Flores Gabriel Frank
* **Curso:** Programación para Dispositivos Móviles
* **Profesor:** Josue Miguel Flores Parra
* **Fecha:** Septiembre 2025

---

## Contenido del proyecto

* `CuentaBancaria.kt` → Clase con saldo, límite de retiro y validaciones mediante `set`.
* `ClaseProducto.kt` → Clase con precio, descuento y cálculo del precio final.
* `Figuras.kt` → Clase abstracta `Shape` con área y perímetro, e implementación en `Cuadrado`, `Rectángulo` y `Círculo`.
* `Biblioteca.kt` → Sistema de gestión de biblioteca con materiales, usuarios y operaciones de préstamo/devolución.

Cada archivo incluye:

* Comentario inicial con descripción, autor y fechas.
* Uso de clases, herencia, encapsulamiento e interfaces.
* Validaciones de entrada y control de errores.

---

## Instrucciones de ejecución

1. Clonar el repositorio en tu computadora:

   ```bash
   git clone https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git
   cd Practica2-POO-Kotlin
   ```

2. Compilar un archivo específico (ejemplo con `CuentaBancaria.kt`):

   ```bash
   kotlinc CuentaBancaria.kt -include-runtime -d CuentaBancaria.jar
   ```

3. Ejecutar el archivo compilado:

   ```bash
   java -jar CuentaBancaria.jar
   ```
---

## Control de versiones con Git

Este proyecto utiliza **Git** para control de versiones:

* Commits realizados de manera frecuente.
* Mensajes de commit **claros y descriptivos** que explican los cambios realizados.
* El repositorio se mantiene **actualizado** con todas las modificaciones relevantes.

Ejemplos de commits:

* `Agregando clase CuentaBancaria con validación de saldo y retiros`
* `Agregando ClaseProducto con precio, descuento y cálculo de precio final`
* `Agregando Figuras geométricas con área y perímetro`
* `Agregando Biblioteca con materiales, usuarios y operaciones de préstamo`

---

## 🔗 Enlace al repositorio

[Ver repositorio en GitHub](https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git)

---

## Observaciones

* Todos los programas están escritos en **Kotlin orientado a objetos**.
* Se aplicaron principios de **modularidad, encapsulamiento, herencia y validaciones**.
* El proyecto cumple con los requisitos funcionales de la práctica y agrega robustez en el manejo de errores.

---

# Rúbrica de evaluación – Práctica 2 Kotlin

### 1. Estructura del proyecto (3 puntos)

* \[✅] **Excelente (3 pts):** El proyecto tiene una estructura clara y muy bien organizada. Los archivos están en carpetas adecuadas y los nombres son descriptivos y coherentes.
* [ ] **Adecuado (2 pts):** La estructura es clara y organizada en su mayoría, aunque puede haber cierto desorden.
* [ ] **Insuficiente (1 pt):** El proyecto carece de organización, los archivos están desordenados y sin coherencia.

---

### 2. Convenciones de Kotlin y buenas prácticas (5 puntos)

* \[✅] **Excelente (5 pts):** Se siguen estrictamente las convenciones de Kotlin, se evitan repeticiones de código innecesarias y se aplican principios de diseño como encapsulamiento, modularidad y cohesión.
* [ ] **Bueno (4 pts):** Se siguen convenciones de Kotlin y se evitan repeticiones de código en la mayoría de los casos.
* [ ] **Regular (3 pts):** Se siguen las convenciones de Kotlin de forma aceptable, aunque con algunos errores.
* [ ] **Malo (2 pts):** Convenciones aplicadas de forma inconsistente, con repeticiones innecesarias.
* [ ] **Muy Malo (1 pt):** No se siguen las convenciones, falta total de coherencia.

---

### 3. Comentarios en el código (3 puntos)

* \[✅] **Excelente (3 pts):** El código está comentado adecuadamente, con explicaciones claras, decisiones de diseño y posibles mejoras.
* [ ] **Adecuado (2 pts):** El código tiene comentarios en su mayoría, aunque incompletos en algunas partes.
* [ ] **Insuficiente (1 pt):** Carece de comentarios o los existentes son poco claros y escasos.

---

### 4. Uso de Git y README.md (3 puntos)

* \[✅] **Excelente (3 pts):** Git se usa de manera efectiva, con commits frecuentes y descriptivos. README completo y con enlace al repositorio.
* [ ] **Adecuado (2 pts):** Se usa Git con cierta frecuencia. README presente, aunque incompleto.
* [ ] **Insuficiente (1 pt):** No se usa Git o no hay README adecuado.

---

### 5. Cumplimiento de requisitos funcionales (6 puntos)

* \[✅] **Excelente (6 pts):** El proyecto cumple con todos los requisitos, maneja errores y excepciones correctamente, incluye funcionalidad adicional y es altamente intuitivo.
* [ ] **Bueno (5 pts):** Cumple los requisitos, es eficiente y tiene interfaz intuitiva.
* [ ] **Aceptable (4 pts):** Cumple con los requisitos básicos y maneja errores de forma general.
* [ ] **Mejorable (3 pts):** Cumple la mayoría de requisitos, pero con limitaciones.
* [ ] **Deficiente (2 pts):** Cumplimiento parcial, interfaz poco intuitiva y manejo de errores deficiente.
* [ ] **Muy Deficiente (1 pt):** No cumple con los requisitos funcionales, sin manejo de errores ni valor añadido.

---
