package com.ita.proyectoprueba.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun MenuScreen(navController: NavController){
    Column{
        Text(text = "This is the Menu Screen")
        //Button(onClick = {navController.navigate("menu")})
        Button(onClick = {navController.navigate("home")})
        {
            
        }
    }
}