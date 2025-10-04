/*
Descripción: Actividad base que aloja el NavHostFragment encargado de controlar la navegación entre los diferentes fragmentos del aplicativo.
Autor: Gabriel Frank Krisna Zela Flores
Fecha de creación: 01/10/2025
Última actualización: 01/10/2025
*/

package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(estadoGuardado: Bundle?) {
        super.onCreate(estadoGuardado)
        // Se asigna el diseño principal de la actividad (activity_main.xml),
        // el cual incluye el componente NavHostFragment que permitirá moverse entre pantallas.
        setContentView(R.layout.activity_main)
    }
}
