# Guía de Estudio: Proyecto Tarea1 (Android con Kotlin y Jetpack Compose)

## 1. ¿Qué es este proyecto?
Este proyecto es una aplicación Android desarrollada en Kotlin usando Jetpack Compose. Permite mostrar cartas y dados de forma aleatoria, usando imágenes y botones para interactuar.

## 2. ¿Qué es Kotlin?
Kotlin es un lenguaje de programación moderno, fácil de leer y escribir, que se usa mucho para crear aplicaciones Android. Es más seguro y sencillo que Java.

## 3. ¿Qué es Jetpack Compose?
Jetpack Compose es una herramienta de Google para crear interfaces gráficas (pantallas) de forma sencilla y moderna. Permite escribir la UI como "funciones" en vez de usar archivos XML.

## 4. ¿Qué es un ViewModel?
Un ViewModel es una clase que guarda y gestiona los datos de la aplicación, separando la lógica de la pantalla (UI) de la lógica de negocio. Así, si la pantalla se actualiza, los datos no se pierden.

## 5. ¿Cómo funciona la aplicación?
- Hay varias pantallas: una para mostrar un número aleatorio, otra para mostrar una carta de corazones, otra para lanzar un dado y otra para mostrar las 4 cartas de un mismo número.
- El usuario puede cambiar de pantalla usando una barra de navegación abajo.
- Cada vez que el usuario pulsa un botón, se genera un nuevo número aleatorio y se actualiza la imagen mostrada.

## 6. ¿Cómo se muestran las imágenes?
Las imágenes de cartas y dados están en la carpeta `res/drawable`.
- El código busca la imagen correcta usando el nombre (por ejemplo, "corazon5" para la carta de corazones número 5).
- Se usa una función especial para obtener la imagen según el número generado.

## 7. ¿Qué es una función @Composable?
Una función @Composable es una función especial de Jetpack Compose que sirve para crear partes de la interfaz gráfica. Por ejemplo, un botón, una imagen o una pantalla completa.

## 8. ¿Qué es el estado y cómo se maneja?
El estado es la información que puede cambiar en la app (por ejemplo, el número aleatorio). Se usa `mutableStateOf` para que, cuando el estado cambie, la pantalla se actualice automáticamente.

## 9. ¿Qué es el patrón MVVM?
MVVM significa Modelo-Vista-ViewModel. Es una forma de organizar el código para separar la lógica de negocio (ViewModel), la interfaz (Vista) y los datos (Modelo).

## 10. ¿Cómo se navega entre pantallas?
Se usa una barra de navegación (NavigationBar) en la parte inferior. Cada botón cambia la pantalla que se muestra.

## 11. Consideraciones importantes
- No necesitas saber mucha POO para entender este proyecto, pero sí debes saber qué es una función y cómo se llama.
- El ViewModel es como un "cerebro" que guarda el número aleatorio y se lo pasa a las pantallas.
- Las pantallas son funciones que muestran información y reaccionan a los cambios de estado.
- El código está comentado para ayudarte a entender cada parte.

## 12. Recomendaciones para estudiar
- Lee los comentarios en el código fuente.
- Prueba cambiar valores y observa cómo reacciona la app.
- Busca entender cómo se conecta el ViewModel con las pantallas.
- Investiga sobre Jetpack Compose y mira ejemplos sencillos.

---

¡Sigue practicando y experimentando! Si tienes dudas, consulta la documentación oficial de Android y Kotlin.
