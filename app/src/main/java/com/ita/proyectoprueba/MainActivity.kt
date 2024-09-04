package com.ita.proyectoprueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ita.proyectoprueba.ui.theme.ProyectoPruebaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //cuando entra por primera vez y aqui se pone el contenido
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally

            ){
                Text(text = "Simple Text")
                ModifierExample()
                ModifierExample2()
            }
        }
            //Layouts
            /*Column {
                Text(text = "First Row")
                Text(text = "Second Row")
                Text(text = "Third Row")

                Row {
                    Text(text = "TEXT 1")
                    Text(text = "TEXT 2")
                    Text(text = "TEXT 3")
                    Text(text = "TEXT 4")
                }
                Box{
                    Text(text = "Label 1")
                    Text(text = "Label 2")

                }
                Greeting(name = "Hello World ")

            }

                /*Column {
                    Row{
                        Text(text = "TEXT 2")
                    }
                }


            } */
        }
            /*ProyectoPruebaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                }
            }
        }*/
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoPruebaTheme {
        Greeting("Nat")
    }
}
@Preview(showBackground = true)
@Composable
fun ModifierExample(){
    Column (
        modifier = Modifier
            .padding(24.dp)
        ){
        Text(text="Hello World")
    }
}

@Preview(showBackground = true)
@Composable
fun ModifierExample2(){
    Column (
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
            .clickable(onClick = { clickAction() })
    ){
        Text(text="Hello World")
    }
}

fun clickAction(){
    println("Column Clicked")

}

@Preview(showBackground = true)
@Composable
fun ModifierExample3(){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(Color.Cyan)
        .border(width = 2.dp,color = Color.Red)
        .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Text(text = "Team 1")
        Text(text = "Team 2")
        Text(text = "Team 3")
        Text(text = "Team 4")
        Text(text = "Team 5")
    }

}