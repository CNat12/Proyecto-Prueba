package com.ita.proyectoprueba.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.navigation.NavHostController

@Composable
fun MenuScreen(navController: NavController) {
    /*Column {
        Text("This is the Menu Screen")
        //Button(onClick = {navController.navigate("menu")})
        //Button(onClick = { navController.navigate("home") })
        Button(onClick = {navController.navigate("ComponentsScreen")})

        {

        }
    }
}*/
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

        // Botón de Navegación: Prueba
        Button(
            onClick = { navController.navigate("Prueba") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
        ) {
            Text(
                text = "PruebaInterfaz",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botón de Navegación: Home
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White
            )
        )
        {
            Text(
                text = "Home",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
    Button(
        onClick = { navController.navigate("ComponentsScreen") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White
        )
    )
    {
        Text(
            text = "Components",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
    }
    Button(
        onClick = { navController.navigate("Alarm") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White
        )
    )
    {
        Text(
            text = "AlarmaScreen",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
    }
}
}


