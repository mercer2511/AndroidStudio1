package com.example.tarea1.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tarea1.viewmodel.MainViewModel

// HeartCardScreen.kt
// Pantalla que muestra una carta de corazones aleatoria usando Jetpack Compose y ViewModel.
// Uso de @Composable para definir componentes de UI de forma declarativa.
// Se accede a recursos drawable dinámicamente usando el nombre generado.

@Composable
fun HeartCardScreen(viewModel: MainViewModel = viewModel()) {
    // number es un estado proveniente del ViewModel, siguiendo el patrón MVVM.
    val number = viewModel.randomNumber
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Carta de corazones: $number", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = getHeartCardDrawable(number)),
            contentDescription = "Carta de corazones $number",
            modifier = Modifier.size(120.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.generateRandomNumber() }) {
            Text("Nueva carta")
        }
    }
}

// Función composable que obtiene el id del recurso drawable correspondiente al número de carta.
@Composable
fun getHeartCardDrawable(number: Int): Int {
    val name = "corazon$number"
    return getDrawableIdByName(name)
}

