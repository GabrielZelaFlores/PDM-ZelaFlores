package com.example.proyecto

/*
Autor: Gabriel Zela Flores Gabriel Frank Krisna
Fecha creación: 26/09/2025
Última modificación: 26/09/2025
*/

import java.io.Serializable

data class Usuario(
    val nombre: String,
    val edad: String,
    val ciudad: String,
    val correo: String
) : Serializable
