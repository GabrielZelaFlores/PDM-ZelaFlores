# Ciclo de Vida de un Contador

Este proyecto es una aplicación Android desarrollada en **Kotlin** que demuestra el funcionamiento del **ciclo de vida de una actividad** en Android.
Además, implementa un contador simple que se conserva al rotar la pantalla gracias al uso de `onSaveInstanceState` y `onRestoreInstanceState`.

---

## Estructura del Proyecto

* **MainActivity.kt** → Contiene la lógica del contador y la implementación de los métodos del ciclo de vida (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`).
* **activity\_main.xml** → Define la interfaz gráfica de usuario, con un `TextView` para mostrar el contador y un `Button` para incrementarlo.
* **strings.xml** → Contiene los textos utilizados en la interfaz (ej. `"Contador: 0"`, `"Aumentar Contador"`).

---

## Funcionalidades

* Muestra el **ciclo de vida** de la actividad mediante:

  * `Log.d` en la consola.
  * `Toast` en pantalla para cada método del ciclo (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`).
* **Contador interactivo**:

  * Se incrementa al presionar el botón.
  * El valor se conserva al girar la pantalla o re-crear la actividad mediante `onSaveInstanceState` y `onRestoreInstanceState`.

---

## Requisitos

* **Android Studio Ladybug (o superior)**
* **Gradle 8+**
* **SDK mínimo:** 24 (Android 7.0 Nougat)
* **Lenguaje:** Kotlin

---

## ▶Ejecución

1. Clonar el repositorio:

   ```bash
   https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git
   ```
2. Abrir el proyecto en **Android Studio**.
3. Conectar un dispositivo o iniciar un **emulador**.
4. Ejecutar la aplicación con **Run **.

---

## Autor

* **Zela Flores Gabriel Frank**
  📅 Creación: 12/09/2025
  🔄 Última modificación: 12/09/2025

---
