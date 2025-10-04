/*
Descripción: Fragmento principal que muestra la pantalla inicial y permite iniciar un nuevo pedido.
Autor: Gabriel Frank Krisna Zela Flores
Fecha de creación: 01/10/2025
Última actualización: 01/10/2025
*/

package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class InicioFragment : Fragment(R.layout.fragment_inicio) {

    override fun onViewCreated(vista: View, savedInstanceState: Bundle?) {
        super.onViewCreated(vista, savedInstanceState)

        // Referencia al botón del layout (id: btnNuevoPedido)
        val botonPedidoNuevo: Button = vista.findViewById(R.id.btnNuevoPedido)

        // Evento de clic: redirige al fragmento de selección de comida
        botonPedidoNuevo.setOnClickListener {
            val controladorNavegacion = findNavController()
            controladorNavegacion.navigate(R.id.action_inicioFragment_to_seleccionComidaFragment)
        }
    }
}
