package com.example.proyecto

/*
Autor: Gabriel Frank Krisna Zela Flores 
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

