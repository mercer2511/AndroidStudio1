package com.example.tarea1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tarea1.viewmodel.MainViewModel

// RandomNumberScreen.kt
// Pantalla simple que muestra un número aleatorio usando Jetpack Compose y ViewModel.
// Uso de @Composable para definir la UI de forma declarativa.
// Se utiliza el patrón MVVM para separar la lógica de UI y la lógica de negocio.

@Composable
fun RandomNumberScreen(viewModel: MainViewModel = viewModel()) {
    // Se obtiene el número aleatorio desde el ViewModel, que gestiona el estado.
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Número aleatorio: ${viewModel.randomNumber}", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.generateRandomNumber() }) {
            Text("Generar nuevo número")
        }
    }
}
