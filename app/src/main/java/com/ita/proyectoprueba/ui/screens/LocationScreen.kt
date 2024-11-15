package com.ita.proyectoprueba.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ita.proyectoprueba.navigation.NavManager

@Composable
fun LocationScreen(navController: NavController) {
    NavManager(viewModel())
}