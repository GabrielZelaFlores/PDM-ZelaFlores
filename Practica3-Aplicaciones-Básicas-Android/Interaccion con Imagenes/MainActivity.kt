/*
Problema: Mostrar un Toast al hacer clic en una imagen.
Autor: Zela Flores Gabriel Frank
Fecha creación: 10/09/2025
Última modificación: 10/09/2025
*/
package com.example.p3

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.p3.ui.theme.P3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P3Theme {
                // Mostrar la imagen y activar el Toast al tocarla
                ImageWithToast {
                    Toast.makeText(this, "¡Has tocado la foto de Zelita !", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

@Composable
fun ImageWithToast(onClick: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.zelita),
            contentDescription = "Foto de Zelita",
            modifier = Modifier
                .fillMaxSize() // ocupa toda la pantalla
                .clickable { onClick() }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewImage() {
    P3Theme {
        ImageWithToast {}
    }
}
