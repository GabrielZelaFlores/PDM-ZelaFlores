/*
Problema: Reproductor de música básico con botones para reproducir, pausar y detener.
Autor: Zela Flores Gabriel Frank
Fecha creación: 10/09/2025
Última modificación: 10/09/2025
*/

package com.example.p3

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.p3.ui.theme.P3Theme

class MusicaActivity : ComponentActivity() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            P3Theme {
                MusicPlayerUI(
                    onPlay = { playMusic() },
                    onPause = { pauseMusic() },
                    onStop = { stopMusic() }
                )
            }
        }
    }

    // ▶ Reproducir música
    private fun playMusic() {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ordinary) // tu archivo en res/raw/
        }
        mediaPlayer?.start()
    }

    // ⏸ Pausar música
    private fun pauseMusic() {
        mediaPlayer?.pause()
    }

    // ⏹ Detener música
    private fun stopMusic() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}

@Composable
fun MusicPlayerUI(onPlay: () -> Unit, onPause: () -> Unit, onStop: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = onPlay,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("▶ Reproducir")
        }
        Button(
            onClick = onPause,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("⏸ Pausar")
        }
        Button(
            onClick = onStop,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("⏹ Detener")
        }
    }
}
