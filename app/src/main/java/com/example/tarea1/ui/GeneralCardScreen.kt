package com.example.tarea1.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tarea1.viewmodel.MainViewModel

// GeneralCardScreen.kt
// Pantalla que muestra las 4 cartas (corazón, trébol, diamante, espada) con el mismo número aleatorio.
// El usuario ya no selecciona el palo, solo se genera un número aleatorio y se muestran todas las variaciones.
// Uso de Jetpack Compose y ViewModel para la gestión de estado y UI declarativa.

@Composable
fun GeneralCardScreen(viewModel: MainViewModel = viewModel()) {
    val number = viewModel.randomNumber
    val suits = listOf("corazon", "trebol", "diamante", "espada")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Cartas generales: $number", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            // Muestra las 4 cartas con el mismo número, una para cada palo.
            suits.forEach { suit ->
                Image(
                    painter = painterResource(id = getGeneralCardDrawable(suit, number)),
                    contentDescription = "Carta $suit $number",
                    modifier = Modifier.size(80.dp).padding(4.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.generateRandomNumber() }) {
            Text("Nueva combinación")
        }
    }
}

// Función composable que obtiene el id del recurso drawable correspondiente al palo y número de carta.
@Composable
fun getGeneralCardDrawable(suit: String, number: Int): Int {
    val name = "${suit}${number}"
    return getDrawableIdByName(name)
}

