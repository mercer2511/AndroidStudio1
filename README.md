# Tarea1 - Aplicación Android en Kotlin

## Descripción
Tarea1 es una aplicación Android desarrollada en Kotlin utilizando Jetpack Compose para la interfaz de usuario. Permite al usuario interactuar con diferentes pantallas para mostrar cartas de corazones, cartas generales y un dado, generando valores aleatorios y mostrando imágenes correspondientes a cada valor.

## Características principales
- **Jetpack Compose**: Toda la UI está construida con el moderno framework declarativo de Google para Android.
- **Kotlin**: Lenguaje principal del proyecto, aprovechando sus características de seguridad y concisión.
- **ViewModel**: Uso de arquitectura MVVM para separar la lógica de UI y la lógica de negocio.
- **Recursos dinámicos**: Obtención de imágenes de recursos drawable de forma dinámica según el valor generado.
- **Navegación simple**: Cada pantalla es un Composable independiente.

## Estructura del proyecto
- `ui/`: Contiene las pantallas principales (`HeartCardScreen`, `GeneralCardScreen`, `DiceScreen`).
- `viewmodel/`: Incluye el `MainViewModel` para la gestión de estado y generación de números aleatorios.
- `res/drawable/`: Imágenes de cartas y dados.

## Aspectos técnicos de Kotlin y Jetpack Compose
- Uso de funciones `@Composable` para definir componentes de UI.
- Uso de `remember` y `mutableStateOf` para gestionar el estado local en Compose.
- Acceso a recursos mediante `LocalContext` y `getIdentifier` para obtener imágenes dinámicamente.
- Separación de lógica de UI y lógica de negocio usando ViewModel.

## Ejecución
1. Clona el repositorio y ábrelo en Android Studio.
2. Ejecuta el proyecto en un emulador o dispositivo físico.

---

Desarrollado por: [Leonardo Sanchez]

