/*
Descripción: Fragmento encargado de presentar el detalle final del pedido, permitiendo confirmarlo o regresar para modificarlo.
Autor: Gabriel Frank Krisna Zela Flores
Fecha de creación: 01/10/2025
Última actualización: 02/10/2025
*/

package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController

class ResumenPedidoFragment : Fragment(R.layout.fragment_resumen_pedido) {

    override fun onViewCreated(vista: View, savedInstanceState: Bundle?) {
        super.onViewCreated(vista, savedInstanceState)

        // Se obtienen los datos enviados desde el fragmento anterior (SeleccionExtrasFragment)
        val platoElegido = arguments?.getString("comida") ?: "Sin elección"
        val incluyeBebida = arguments?.getBoolean("bebida") ?: false
        val incluyePapas = arguments?.getBoolean("papas") ?: false
        val incluyePostre = arguments?.getBoolean("postre") ?: false

        // Armamos el texto del resumen del pedido
        val textoResumen = """
            Comida: $platoElegido
            Extras:
              - Bebida: ${if (incluyeBebida) "Sí" else "No"}
              - Papas: ${if (incluyePapas) "Sí" else "No"}
              - Postre: ${if (incluyePostre) "Sí" else "No"}
        """.trimIndent()

        vista.findViewById<TextView>(R.id.tvResumen).text = textoResumen

        // Referencias de los botones en el layout
        val botonConfirmar: Button = vista.findViewById(R.id.btnConfirmar)
        val botonEditar: Button = vista.findViewById(R.id.btnEditar)

        // Evento para confirmar el pedido
        botonConfirmar.setOnClickListener {
            Toast.makeText(requireContext(), "Pedido confirmado exitosamente", Toast.LENGTH_SHORT).show()
            // Retorna al fragmento inicial (InicioFragment)
            findNavController().navigate(R.id.action_resumenPedidoFragment_to_inicioFragment)
        }

        // Evento para volver y editar el pedido
        botonEditar.setOnClickListener {
            // Se crea un paquete con los datos actuales del pedido
            val datosPedido = Bundle().apply {
                putString("comida", platoElegido)
                putBoolean("bebida", incluyeBebida)
                putBoolean("papas", incluyePapas)
                putBoolean("postre", incluyePostre)
            }

            // Se envía el resultado al fragmento anterior
            setFragmentResult("editarPedido", datosPedido)

            // Se regresa al fragmento de selección de comida sin destruirlo
            findNavController().popBackStack(R.id.seleccionComidaFragment, false)
        }
    }
}
