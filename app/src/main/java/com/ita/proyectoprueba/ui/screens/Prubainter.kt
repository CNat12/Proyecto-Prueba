package com.ita.proyectoprueba.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

        // Header Row: Profile, Library, Search,Add Icons

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {

                // Icono del perfil
                Image(
                    painter = painterResource(id = R.drawable.perfil),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(48.dp)
                        .background(Color.Gray, shape = CircleShape)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "My Library",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(19.dp))

        // Category Buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
                listOf("Playlists", "Artists", "Albums", "Podcasts").forEach { category ->
                    // Por cada categoría en la lista, se ejecuta este bloque de código
                    // Aquí, category representa una categoría de la lista
                    Box(
                    modifier = Modifier
                        .padding(5.dp) //espacio entre los botones
                        .background(
                            Color.DarkGray,
                            shape = RoundedCornerShape(30.dp)
                        ) // Borde redondeado
                        .padding(vertical = 10.dp, horizontal = 8.dp),
                    contentAlignment = Alignment.Center
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

        // Recently Played Section
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Recently played", color = Color.White, fontSize = 25.sp)
            Row {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "FLista",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)

                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))//espacio entre song

        // Songs/Episodes List
        Column(
            modifier = Modifier.weight(1f) // footer hacia abajo
        ) {
            // Liked Songs
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(

                        painter = painterResource(id = R.drawable.liked),
                        contentDescription = "Liked Songs",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop,

                        )
                    Spacer(modifier = Modifier.width(8.dp)) //letra songs
                    Column {
                        Text(
                            text = "Liked Songs",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Playlist • 185 songs", color = Color.Gray,fontSize = 18.sp)
                    }
                }
            }

            // Your Episodes
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.episodes),
                        contentDescription = "Your Episodes",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Your Episodes",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Playlist • 3 episodes", color = Color.Gray,fontSize = 18.sp)
                    }
                }
            }
            //Artista 1
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.tylorswift),
                        contentDescription = "Song",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Tylor Swift",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Artista", color = Color.Gray,fontSize = 18.sp)

                    }
                }
            }
            //My playlist Nat
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.playlist),
                        contentDescription = "Playlist",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "My playlist #Nat",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Lista • Nat", color = Color.Gray,fontSize = 18.sp)
                    }
                }
            }
            //Podcast Nat
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.prodcast),
                        contentDescription = "Playlist",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Latina to Latina",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Prodcast • Latina to Latina LLC", color = Color.Gray, fontSize = 18.sp)
                    }
                }
            }
            //Artista 2 Imagine Dragons
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.imaginedragons),
                        contentDescription = "Playlist",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Imagine Dragons",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Artita", color = Color.Gray, fontSize = 18.sp)
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.intrumentals),
                        contentDescription = "Playlist",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Golden Instrumentals",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Praylist • Spotify", color = Color.Gray, fontSize = 18.sp)
                    }
                }
            }
            //Playlist 2 60´s
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.playlist2),
                        contentDescription = "Playlist 60´s",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "All out 60´s",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Playlist 60´s", color = Color.Gray, fontSize = 18.sp)
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.intrumentals),
                        contentDescription = "Playlist",
                        modifier = Modifier.size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Golden Instrumentals",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Praylist • Spotify", color = Color.Gray)
                    }
                }
            }
        }


        // Pie de página
        FooterMenu()
    }
}

@Composable
fun FooterMenu() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(3.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically //cuadro pie de pagina
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Inicio",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
            Text(text = "Inicio", color = Color.White, fontSize = 20.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Buscar",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
            Text(text = "Buscar", color = Color.White, fontSize = 20.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = Icons.Default.List,
                contentDescription = "Tu biblioteca",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
            Text(text = "Tu biblioteca", color = Color.White, fontSize = 20.sp)
        }
    }
}

