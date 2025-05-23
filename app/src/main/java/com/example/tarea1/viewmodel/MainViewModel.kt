package com.example.tarea1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.tarea1.util.RandomUtil

// MainViewModel.kt
// ViewModel principal que gestiona el estado de la aplicación usando el patrón MVVM.
// Utiliza mutableStateOf para exponer el estado observable a la UI con Jetpack Compose.
// La función generateRandomNumber permite generar un número aleatorio en un rango configurable.
// El estado randomNumber es privado para escritura y solo puede ser modificado por el ViewModel.

class MainViewModel : ViewModel() {
    // randomNumber es un estado observable que notifica a la UI cuando cambia.
    var randomNumber by mutableStateOf(1)
        private set

    // Genera un número aleatorio en el rango especificado (por defecto 1..13).
    fun generateRandomNumber(range: IntRange = 1..13) {
        randomNumber = RandomUtil.randomInt(range)
    }
}
