/*
Descripción: Fragmento encargado de permitir al usuario elegir el tipo de comida principal antes de añadir los extras.
Autor: Gabriel Frank Krisna Zela Flores
Fecha de creación: 01/10/2025
Última actualización: 02/10/2025
*/

package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SeleccionComidaFragment : Fragment(R.layout.fragment_seleccion_comida) {

    override fun onViewCreated(vista: View, savedInstanceState: Bundle?) {
        super.onViewCreated(vista, savedInstanceState)

        // Botón que permite continuar al siguiente paso del pedido
        val botonContinuar: Button = vista.findViewById(R.id.btnSiguienteComida)
        // Grupo de opciones que representan los tipos de comida disponibles
        val grupoOpciones: RadioGroup = vista.findViewById(R.id.radioGroupComida)

        // Escucha el resultado enviado desde el fragmento de resumen (si el usuario decidió editar)
        parentFragmentManager.setFragmentResultListener("editarPedido", viewLifecycleOwner) { _, datos ->
            val comidaAnterior = datos.getString("comida", "")

            // Recorre los botones del grupo para marcar el que coincida con la selección previa
            for (i in 0 until grupoOpciones.childCount) {
                val opcion = grupoOpciones.getChildAt(i) as RadioButton
                if (opcion.text.toString() == comidaAnterior) {
                    opcion.isChecked = true
                    break
                }
            }
        }

        // Acción cuando el usuario pulsa el botón para continuar
        botonContinuar.setOnClickListener {
            // Obtiene el identificador del RadioButton seleccionado
            val idSeleccionado = grupoOpciones.checkedRadioButtonId

            if (idSeleccionado != -1) {
                // Recupera el RadioButton marcado
                val opcionSeleccionada = vista.findViewById<RadioButton>(idSeleccionado)
                // Convierte su texto a String (por ejemplo: “Pizza”, “Hamburguesa”)
                val comidaElegida = opcionSeleccionada.text.toString()

                // Crea un paquete con la información seleccionada
                val paqueteDatos = Bundle().apply {
                    putString("comida", comidaElegida)
                }

                // Navega al siguiente fragmento (SeleccionExtrasFragment) enviando los datos
                findNavController().navigate(
                    R.id.action_seleccionComidaFragment_to_seleccionExtrasFragment,
                    paqueteDatos
                )
            } else {
                // Si no se ha elegido ninguna opción, se muestra un mensaje de advertencia
                Toast.makeText(requireContext(), "Por favor selecciona una comida antes de continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
