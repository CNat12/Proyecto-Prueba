package com.ita.proyectoprueba.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Menu Screen",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        // Botón PruebaInterfaz
        Button(
            onClick = { navController.navigate("prueba") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "PruebaInterfaz",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
        // Botón Home
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Home",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
        // Botón ComponentsScreen
        Button(
            onClick = { navController.navigate("components") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Components",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
        // Botón Log in
        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Log in",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
        // Botón Programación de tareas en 2do plano
        Button(
            onClick = { navController.navigate("alarm") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Tareas en 2do plano",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
    }
        // Botón Servicios de rastreo y geolocalización
        Button(
            onClick = { navController.navigate("Location") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Rastreo y geolocalización",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )

        }
        // Botón Acceso a contactos y calendario
        Button(
            onClick = { navController.navigate("agenda") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Contactos y calendario ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
        // Botón Acceso a sensores biométricos
        Button(
            onClick = { navController.navigate("biometrics") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Acceso a sensores biométricos",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )}
        // Botón Acceso a cámara y manejo de archivos del dispositivo
        Button(
            onClick = { navController.navigate("Camera") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Cámara y manejo de archivos",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )}

        // Botón Conectividad Wifi y datos celulares
        Button(
            onClick = { navController.navigate("wifiDatos") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Conectividad Wifi y datos celulares ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )}

    }
}
