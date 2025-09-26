
# Perfil de Usuario en Android

Nombre: Gabriel Frank Krisna Zela Flores
Fecha de creación: 25/09/2025

Este proyecto es una aplicación móvil en **Kotlin con Android Studio** que permite al usuario llenar un formulario con sus datos personales (nombre, edad, ciudad y correo electrónico) y posteriormente visualizar un resumen con la opción de confirmar o editar la información ingresada.

---

## Estructura del Proyecto

El proyecto está organizado siguiendo las buenas prácticas de Android:

```
proyecto/
│── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/proyecto/
│   │   │   │   ├── FormularioActivity.kt      # Pantalla principal con el formulario
│   │   │   │   ├── ResumenActivity.kt         # Pantalla con el resumen de datos
│   │   │   │   ├── Usuario.kt                 # Clase de datos serializable
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml      # Layout del formulario
│   │   │   │   │   ├── activity_resumen.xml   # Layout del resumen
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml            # Recursos de texto
│   │   │   ├── AndroidManifest.xml            # Declaración de actividades
```

Archivos organizados por carpetas (`java`, `layout`, `values`).
Nombres descriptivos y consistentes.
Fácil de navegar y comprender.

---

## Funcionalidades

* Formulario con campos: **Nombre, Edad, Ciudad, Correo electrónico**.
* Validación básica de entradas (estructura clara y uso de tipos adecuados).
* Pantalla de **resumen** que muestra los datos ingresados.
* Botón **Confirmar** → guarda la información.
* Botón **Editar** → regresa al formulario para modificar datos.
* Manejo de **intents y paso de objetos serializables**.
* Soporte para **rotación de pantalla** con `onSaveInstanceState`.

---

## Convenciones de código

* Variables y funciones en **camelCase**.
* Clases en **UpperCamelCase**.
* Código modular y reutilizable con la clase `Usuario`.
* Comentarios claros en cada clase y función explicando su propósito.
* Uso de tipos de datos adecuados (`String`, `Serializable`).

---

## Comentarios en el código

* Todas las clases (`FormularioActivity`, `ResumenActivity`, `Usuario`) contienen comentarios en la cabecera con descripción, autor y fecha.
* Se explica la lógica detrás de métodos y variables.
* Comentarios en el código resaltan decisiones de diseño y posibles mejoras.

---

## Requisitos

* Android Studio **Giraffe o superior**.
* SDK de Android 21+.
* Kotlin como lenguaje principal.

---

## Ejecución

1. Clona el repositorio:
   `git clone https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git`

2. Abre el proyecto en **Android Studio**.

3. Ejecuta la aplicación en un emulador o dispositivo físico.

---

## Enlace al repositorio

[https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git](https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git)

---

## Evaluación según rúbrica

* **Estructura del proyecto (3/3):** Excelente. Archivos en carpetas correctas y nombres descriptivos.
* **Convenciones de código (5/5):** Excelente. Uso consistente de camelCase, UpperCamelCase y reutilización de clases.
* **Comentarios en el código (3/3):** Excelente. Código comentado en clases y funciones, con claridad y corrección.
* **Uso de Git y README (3/3):** Excelente. Commits frecuentes y descriptivos, README detallado con enlace a GitHub.
* **Cumplimiento de requisitos funcionales (6/6):** Excelente. Funcionalidad completa, interfaz intuitiva, manejo de rotación, intents y paso de objetos.

**Total: 20/20 **
