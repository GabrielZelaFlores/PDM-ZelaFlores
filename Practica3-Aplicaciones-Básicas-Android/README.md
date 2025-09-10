# Práctica 3: Aplicaciones Básicas Android

## Autor
**Zela Flores Gabriel Frank**

## Fecha de creación
10/09/2025

## Última modificación
10/09/2025

---

## Descripción del proyecto
Este proyecto consiste en **dos actividades principales** desarrolladas en Android Studio utilizando **Kotlin y Jetpack Compose**:

1. **ImagenActivity**  
   - Muestra una imagen llamada `zelita.jpg`.  
   - Al tocar la imagen, se muestra un **Toast** con un mensaje personalizado.  
   - Objetivo: practicar interacción con imágenes y mostrar notificaciones breves al usuario.

2. **MusicaActivity**  
   - Implementa un **reproductor de música básico**.  
   - Permite **reproducir, pausar y detener** un archivo de audio llamado `ordinary.mp3` ubicado en la carpeta `res/raw/`.  
   - Objetivo: aprender a usar `MediaPlayer` y controlar la reproducción de audio en Android.

---

## Estructura del proyecto
- **MainActivity.kt** → Menú principal (opcional) para abrir las dos actividades.  
- **ImagenActivity.kt** → Actividad de la imagen con Toast.  
- **MusicaActivity.kt** → Reproductor de música.  
- **res/drawable/** → Contiene la imagen `zelita.jpg`.  
- **res/raw/** → Contiene el archivo de audio `ordinary.mp3`.  
- **res/values/** → Colores, temas y strings de la aplicación.  
- **AndroidManifest.xml** → Registro de todas las actividades (`MainActivity`, `ImagenActivity`, `MusicaActivity`).

---

## Cómo ejecutar el proyecto
1. Abrir el proyecto en **Android Studio**.  
2. Verificar que la imagen `zelita.jpg` esté en `res/drawable/` y la música `ordinary.mp3` en `res/raw/`.  
3. Ejecutar la aplicación en un **emulador o dispositivo físico**.  
4. Desde la pantalla principal (MainActivity) o ejecutando directamente las actividades:  
   - **ImagenActivity:** toca la imagen para ver el Toast.  
   - **MusicaActivity:** usar los botones para reproducir, pausar o detener la música.

---

## Control de versiones
- Se utilizó **Git** para controlar el proyecto.  
- Se hicieron commits frecuentes y descriptivos.  
- Se mantiene actualizado con todas las modificaciones realizadas.  
- Repositorio GitHub: https://github.com/GabrielZelaFlores/PDM-ZelaFlores.git

---

- Las actividades cumplen con las **convenciones de nomenclatura de Kotlin**.  
- Se aplican principios de **modularidad y cohesión**, manteniendo cada actividad independiente.  
- Los **comentarios en el código** explican la lógica de cada función, variable y sección relevante.  

---

## Requerimientos
- Android Studio Bumblebee o superior.  
- SDK Android mínimo API 21.  
- Kotlin 1.8+  
