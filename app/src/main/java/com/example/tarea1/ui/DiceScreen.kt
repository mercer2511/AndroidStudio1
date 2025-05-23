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

// DiceScreen.kt
// Pantalla que simula el lanzamiento de un dado usando Jetpack Compose y ViewModel.
// Uso de @Composable para definir la UI de forma declarativa.
// Se utiliza lógica para asegurar que el número esté en el rango 1-6.
// Se accede a recursos drawable dinámicamente según el número generado.

@Composable
fun DiceScreen(viewModel: MainViewModel = viewModel()) {
    // number se calcula a partir del estado del ViewModel, asegurando un valor entre 1 y 6.
    val number = (viewModel.randomNumber % 6).let { if (it == 0) 6 else it }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Dado: $number", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = getDiceDrawable(number)),
            contentDescription = "Dado $number",
            modifier = Modifier.size(120.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.generateRandomNumber(1..6) }) {
            Text("Lanzar dado")
        }
    }
}

// Función composable que obtiene el id del recurso drawable correspondiente al número de dado.
@Composable
fun getDiceDrawable(number: Int): Int {
    val name = "dado$number"
    return getDrawableIdByName(name)
}

@Composable
fun getDrawableIdByName(name: String): Int {
    val context = androidx.compose.ui.platform.LocalContext.current
    return context.resources.getIdentifier(name, "drawable", context.packageName)
}
