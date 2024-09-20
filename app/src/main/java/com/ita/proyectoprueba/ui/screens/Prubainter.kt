package com.ita.proyectoprueba.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.ita.proyectoprueba.R

@Composable
fun PruebaInter(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(5.dp)
    ) {

        // Fila de Encabezado
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically // Centra verticalmente los elementos
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Perfil
                Spacer(modifier = Modifier.height(95.dp))
                Image(
                    painter = painterResource(id = R.drawable.perfil), //
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(70.dp) // Tamaño de la imagen
                        .background(
                            Color.DarkGray,
                            shape = CircleShape//adicional
                        ) // Fondo gris oscuro con forma circular
                        .clip(CircleShape) // Recorta la imagen en forma de círculo
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "My Library", // Texto del encabezado
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row {
                // Buscar
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                // Añadir
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(19.dp))//Adicional

        //Categorias

        // Divisor-Adicional
        Divider(
            color = Color.White, // Color gris para el divisor
            thickness = 2.dp, // Grosor
            modifier = Modifier.padding(vertical = 10.dp)
        )

        // Botones de Categoría
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround // Espacia los botones de manera uniforme
        ) {
            // lista de categorías para crear botones
            //Lista de elementos no modificables
            //Adicional
            listOf("Playlists", "Artists", "Albums", "Podcasts").forEach { category ->
                Box(
                    modifier = Modifier
                        .padding(5.dp) //
                        .background(
                            Color.DarkGray, // Fondo
                            shape = RoundedCornerShape(30.dp) // Bordes redondeados
                        )
                        .clickable { }
                        .padding(vertical = 10.dp, horizontal = 8.dp),
                    contentAlignment = Alignment.Center // Centra el contenido dentro del botón
                ) {
                    Text(
                        text = category,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Reproducción Reciente
        Row(
            modifier = Modifier.fillMaxWidth(), //ancho disponible
            horizontalArrangement = Arrangement.SpaceBetween, // Espacia los elementos entre sí
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Recently played",
                color = Color.White,
                fontSize = 25.sp
            )
            Row {
                // Icono de Lista
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Lista",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                //Icono de Menú
                Icon(
                    imageVector = Icons.Default.Menu, //
                    contentDescription = "Menu", // Descripción
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Lista de Canciones con Scroll y Efecto Clickable**
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            // Canciones Favoritas
            SongRow(
                imageRes = R.drawable.liked,
                title = "Liked Songs",
                subtitle = "Playlist • 185 songs"
            )

            // Episodios
            SongRow(
                imageRes = R.drawable.episodes,
                title = "Your Episodes",
                subtitle = "Playlist • 3 episodes"
            )

            // Artista: Taylor Swift
            SongRow(
                imageRes = R.drawable.tylorswift,
                title = "Taylor Swift",
                subtitle = "Artista"
            )

            // Playlist Personalizada
            SongRow(
                imageRes = R.drawable.playlist,
                title = "My playlist #Nat",
                subtitle = "Lista • Nat"
            )

            // Fila de Podcast: Latina to Latina
            SongRow(
                imageRes = R.drawable.prodcast,
                title = "Latina to Latina",
                subtitle = "Prodcast • Latina to Latina LLC"
            )

            // Fila de Artista: Imagine Dragons
            SongRow(
                imageRes = R.drawable.imaginedragons,
                title = "Imagine Dragons",
                subtitle = "Artista"
            )

            // Fila de Instrumentales
            SongRow(
                imageRes = R.drawable.intrumentals,
                title = "Golden Instrumentals",
                subtitle = "Playlist • Spotify"
            )

            // Fila de Playlist de los 60’s
            SongRow(
                imageRes = R.drawable.playlist2,
                title = "All out 60´s",
                subtitle = "Playlist 60´s"
            )
        }

        //Pie de Página
        FooterMenu()//Adicional
    }
}

    // Función Fila de Canción
    @Composable
    fun SongRow(imageRes: Int, title: String, subtitle: String) {
        Box(
            modifier = Modifier
                .fillMaxWidth() // ancho disponible
                .padding(8.dp) // alrededor de la fila
                .clickable { }//Accion-Adicional
                .background(Color.Black) //Fondo musica
                .shadow(8.dp, shape = RoundedCornerShape(30.dp)
                ) // Sombra con grosor y bordes redondeados
                .padding(14.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Imagen de la Canción/Episodio
                Image(
                    painter = painterResource(id = imageRes), // Recurso de imagen proporcionado
                    contentDescription = title, // Descripción para accesibilidad
                    modifier = Modifier.size(60.dp), // Tamaño de la imagen
                    contentScale = ContentScale.Crop // Escala la imagen para recortar si es necesario
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    // Título de la Canción/Episodio
                    Text(
                        text = title, // Título proporcionado
                        color = Color.White, // Color del texto blanco
                        fontSize = 22.sp, // Tamaño de fuente de 22 sp
                        fontWeight = FontWeight.Bold // Fuente en negrita
                    )
                    // Detalles del texto
                    Text(
                        text = subtitle,
                        color = Color.Gray,
                        fontSize = 19.sp
                    )
                }
            }
        }
    }

    // Función Composable para el Menú del Pie de Página
    @Composable
    fun FooterMenu() {
        Row(
            modifier = Modifier
                .fillMaxWidth() // Ocupa ancho
                .background(Color.Black) // Fondo
                .padding(12.dp), // apartado del pie de pagina
            horizontalArrangement = Arrangement.SpaceAround, // Espacia los elementos
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Inicio
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Inicio", // Descripción
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
                Text(text = "Inicio", color = Color.White, fontSize = 20.sp)
            }
            //Buscar
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Buscar",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
                Text(text = "Buscar", color = Color.White, fontSize = 20.sp)
            }
            //Biblioteca
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Tu biblioteca",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
                Text(
                    text = "Tu biblioteca",
                    color = Color.White,
                    fontSize = 20.sp
                )
            }
        }
    }