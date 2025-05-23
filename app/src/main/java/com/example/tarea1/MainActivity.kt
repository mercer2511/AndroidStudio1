package com.example.tarea1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.tarea1.ui.RandomNumberScreen
import com.example.tarea1.ui.HeartCardScreen
import com.example.tarea1.ui.DiceScreen
import com.example.tarea1.ui.GeneralCardScreen
import com.example.tarea1.ui.theme.Tarea1Theme
import com.example.tarea1.viewmodel.MainViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Casino
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Style

// MainActivity.kt
// Actividad principal que configura la navegación y la UI usando Jetpack Compose.
// Utiliza un NavigationBar para cambiar entre diferentes pantallas (Random, Corazón, Dado, General).
// El estado selectedScreen determina qué pantalla se muestra actualmente.
// Se utiliza un ViewModel compartido para manejar el estado y la lógica de negocio.

// NavigationBarItem permite la navegación entre pantallas de forma reactiva.
// Cada pantalla es un Composable independiente que recibe el ViewModel como parámetro.
// El uso de Compose permite una UI declarativa y reactiva basada en el estado.

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea1Theme {
                val viewModel: MainViewModel = viewModel()
                var selectedScreen by remember { mutableStateOf(0) }
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(title = { Text("Desarrollo de Aplicaciones Móviles") })
                    },
                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(
                                selected = selectedScreen == 0,
                                onClick = { selectedScreen = 0 },
                                label = { Text("Aleatorio") },
                                icon = { Icon(Icons.Default.Casino, contentDescription = null) }
                            )
                            NavigationBarItem(
                                selected = selectedScreen == 1,
                                onClick = { selectedScreen = 1 },
                                label = { Text("Corazón") },
                                icon = { Icon(Icons.Default.Favorite, contentDescription = null) }
                            )
                            NavigationBarItem(
                                selected = selectedScreen == 2,
                                onClick = { selectedScreen = 2 },
                                label = { Text("Dado") },
                                icon = { Icon(Icons.Default.Casino, contentDescription = null) }
                            )
                            NavigationBarItem(
                                selected = selectedScreen == 3,
                                onClick = { selectedScreen = 3 },
                                label = { Text("General") },
                                icon = { Icon(Icons.Default.Style, contentDescription = null) }
                            )
                        }
                    }
                ) { innerPadding ->
                    // Renderiza la pantalla seleccionada según el valor de selectedScreen.
                    when (selectedScreen) {
                        0 -> RandomNumberScreen(viewModel)
                        1 -> HeartCardScreen(viewModel)
                        2 -> DiceScreen(viewModel)
                        3 -> GeneralCardScreen(viewModel)
                    }
                }
            }
        }
    }
}

