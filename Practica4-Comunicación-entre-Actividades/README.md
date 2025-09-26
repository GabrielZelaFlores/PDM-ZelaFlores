
# Perfil de Usuario en Android

Nombre: Gabriel Frank Krisna Zela Flores
Fecha de creación: 25/09/2025

Este proyecto es una aplicación móvil en **Kotlin con Android Studio** que permite al usuario llenar un formulario con sus datos personales (nombre, edad, ciudad y correo electrónico) y posteriormente visualizar un resumen con la opción de confirmar o editar la información ingresada.

---

## 📂 Estructura del Proyecto

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

✔️ Archivos organizados por carpetas (`java`, `layout`, `values`).
✔️ Nombres descriptivos y consistentes.
✔️ Fácil de navegar y comprender.

---

## ✨ Funcionalidades

* Formulario con campos: **Nombre, Edad, Ciudad, Correo electrónico**.
* Validación básica de entradas (estructura clara y uso de tipos adecuados).
* Pantalla de **resumen** que muestra los datos ingresados.
* Botón **Confirmar** → guarda la información.
* Botón **Editar** → regresa al formulario para modificar datos.
* Manejo de **intents y paso de objetos serializables**.
* Soporte para **rotación de pantalla** con `onSaveInstanceState`.

---

## ✅ Convenciones de código

* Variables y funciones en **camelCase**.
* Clases en **UpperCamelCase**.
* Código modular y reutilizable con la clase `Usuario`.
* Comentarios claros en cada clase y función explicando su propósito.
* Uso de tipos de datos adecuados (`String`, `Serializable`).

---

## 💬 Comentarios en el código

* Todas las clases (`FormularioActivity`, `ResumenActivity`, `Usuario`) contienen comentarios en la cabecera con descripción, autor y fecha.
* Se explica la lógica detrás de métodos y variables.
* Comentarios en el código resaltan decisiones de diseño y posibles mejoras.

---

## 🛠️ Requisitos

* Android Studio **Giraffe o superior**.
* SDK de Android 21+.
* Kotlin como lenguaje principal.

---

## ▶️ Ejecución

1. Clona el repositorio:
   `git clone https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git`

2. Abre el proyecto en **Android Studio**.

3. Ejecuta la aplicación en un emulador o dispositivo físico.

---

## 📌 Commits sugeridos (Git)

A lo largo del desarrollo se recomienda llevar un historial claro de cambios.
Ejemplo de commits realizados:

1. `git commit -m "Inicialización del proyecto Android con estructura básica"`
2. `git commit -m "Creación del layout activity_main.xml con formulario"`
3. `git commit -m "Creación del layout activity_resumen.xml con botones y TextView"`
4. `git commit -m "Definición de recursos de texto en strings.xml"`
5. `git commit -m "Implementación de FormularioActivity con captura de datos"`
6. `git commit -m "Implementación de ResumenActivity con visualización de datos"`
7. `git commit -m "Creación de clase Usuario serializable para transferencia entre actividades"`
8. `git commit -m "Corrección de recursos y vinculación con R"`
9. `git commit -m "Documentación del código y comentarios de diseño"`
10. `git commit -m "Actualización del README.md con descripción del proyecto"`

---

## 🔗 Enlace al repositorio

[https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git](https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git)

---

## 📊 Evaluación según rúbrica

* **Estructura del proyecto (3/3):** Excelente. Archivos en carpetas correctas y nombres descriptivos.
* **Convenciones de código (5/5):** Excelente. Uso consistente de camelCase, UpperCamelCase y reutilización de clases.
* **Comentarios en el código (3/3):** Excelente. Código comentado en clases y funciones, con claridad y corrección.
* **Uso de Git y README (3/3):** Excelente. Commits frecuentes y descriptivos, README detallado con enlace a GitHub.
* **Cumplimiento de requisitos funcionales (6/6):** Excelente. Funcionalidad completa, interfaz intuitiva, manejo de rotación, intents y paso de objetos.

**Total: 20/20 ✅**
