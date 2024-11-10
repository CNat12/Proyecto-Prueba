package com.ita.proyectoprueba

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.project1.ui.screens.ComponentsScreen
import com.ita.proyectoprueba.ui.screens.*
import com.ita.proyectoprueba.ui.theme.ProyectoPruebaTheme
import java.util.concurrent.TimeUnit

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Verifica y solicita permiso para notificaciones en Android 13 o superior
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(arrayOf(Manifest.permission.POST_NOTIFICATIONS), 1)
            }
        }


        enableEdgeToEdge()
        setContent {
            ProyectoPruebaTheme {
                ComposeMultiScreenApp()
            }
        }
    }

    /*Box {
    Text(text = "Label 1")
    Text(text = "Label 2")
}
Greeting(name = "World")
}*/

    /*Column(
    modifier = Modifier
        .fillMaxSize()
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),

    verticalArrangement = Arrangement.Center,
    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally

) {
    CustomText()
    Picture()
    Content1()
    Content2()
}
}
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


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
Text(
text = "Hello $name!",
modifier = modifier
)
}

/*@Preview(showBackground = true)
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
.border(width = 2.dp, color = Color.Red)
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

}*/
//@Preview(showBackground = true)
@Composable
fun CustomText() {
Column {
Text(
stringResource(R.string.hello_world_text),
color = colorResource(R.color.purple_200),
fontSize = 20.sp,
fontStyle = FontStyle.Italic,
fontWeight = FontWeight.ExtraBold,

)
val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Red)
Text(
stringResource(R.string.hello_world_text),
style = TextStyle(brush = Brush.linearGradient(colors = gradientColors))
)

}
}
//09/09/24

//@Preview(showBackground = true)
@Composable
fun Picture() {
Column(
modifier = Modifier
    .fillMaxSize()
    .background(Color.Black)

) {
Image(
    modifier = Modifier
        .fillMaxWidth(),
    painter = painterResource(R.drawable.android),
    contentDescription = "Logo Android",
    contentScale = ContentScale.Crop
)


}
}

//@Preview(showBackground = true)
@Composable
fun Content1() {
Card(
    modifier = Modifier
        .background(Color.LightGray)
        .fillMaxWidth()
        .padding(5.dp)
) {
    Text(
        text = "This is a Title",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(10.dp)
    )
    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painterResource(id = R.drawable.android),
        contentDescription = "Android Logo",
        contentScale = ContentScale.Crop
    )
    Text(
        stringResource(R.string.text_card),
        textAlign = TextAlign.Justify,
        lineHeight = 18.sp,
        modifier = Modifier
            .padding(10.dp)
    )
}
}

//@Preview(showBackground = true)
@Composable
fun Content2(){
Card(
    modifier = Modifier
        .background(Color.LightGray)
        .fillMaxWidth()
        .padding(5.dp)
){
Row {
Image(
    modifier = Modifier
        .width(150.dp)
        .height(150.dp),
    //.fillMaxWidth()
    painter = painterResource(id = R.drawable.android),
    contentDescription = "Android Logo",
    contentScale = ContentScale.Crop
)
Column {
    Text (text = "This is a Title",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(10.dp)
    )
    Text(
        stringResource(R.string.text_card),
        textAlign = TextAlign.Justify,
        lineHeight = 18.sp,
        maxLines = 5,
        modifier = Modifier
            .padding(10.dp)
    )
}


}

}
}

//10/09/24
@Preview(showBackground = true)
@Composable
fun BoxExample(){
Box(
modifier = Modifier
.background(Color.DarkGray)
.fillMaxWidth()
.padding(5.dp)
){
    Image(
        painterResource(R.drawable.android),
        contentDescription = "Android Logo",
        contentScale = ContentScale.FillWidth

    )
Row(
    modifier = Modifier
        .background(Color.Red)
        .fillMaxWidth()
        .padding(0.dp),
    horizontalArrangement =Arrangement.Center
){

    Icon(
        Icons.Filled.AccountBox,
        contentDescription = "Icon Account"
    )
    //va llenar el 100% de la imagen*/
    // Text(text = "Text")
    /*textAlign = TextAlign.Center,
    modifier = Modifier
        .fillMaxWidth()
        .padding(0.dp, 150.dp))*/

    // Método para programar una alarma en segundo plano usando WorkManager
    fun scheduleAlarm(delayInMillis: Long) {
        val workRequest = OneTimeWorkRequestBuilder<AlarmWorker>()
            .setInitialDelay(delayInMillis, TimeUnit.MILLISECONDS)
            .build()

        WorkManager.getInstance(this).enqueue(workRequest)
        Toast.makeText(this, "Alarma programada", Toast.LENGTH_SHORT).show()
    }
}


/*@Preview(showBackground = true)
@Composable
fun BoxExample2() {
    Box(
        modifier = Modifier
            .background(Color.Magenta)
            .padding(3.dp)
            .size(250.dp)
    ) {/Acomodo de texto/
        Text(text = "TopStart", Modifier.align(Alignment.TopStart))
        Text(text = "TopEnd", Modifier.align(Alignment.TopEnd))
        Text(text = "CenterStart", Modifier.align(Alignment.CenterStart))
        Text(text = "Center", Modifier.align(Alignment.Center))
        Text(text = "CenterEnd", Modifier.align(Alignment.CenterEnd))
        Text(text = "BottomStart", Modifier.align(Alignment.BottomStart))
        Text(text = "BottomEnd", Modifier.align(Alignment.BottomEnd))

    }
}


fun clickAction() {
    println("Column Clicked")
}*/

@Composable
fun ComposeMultiScreenApp() {
    val navController = rememberNavController()
    Surface(color = Color.White) {
        SetupNavGraph(navController = navController)
    }
}

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "menu") {
        composable("menu") { MenuScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("prueba") { PruebaInter(navController) }
        composable("components") { ComponentsScreen(navController) }
        composable("login") { LoginScreen(navController) }

        composable("alarm") {
            AlarmScreen { delay ->
                (navController.context as? MainActivity)?.scheduleAlarm(delay)
            }
        }
        composable("agenda") { AgendaScreen(navController) }
        composable("Location") { LocationScreen(navController) }
        composable("wifiDatos") {
            val context = LocalContext.current as? ComponentActivity
            if (context != null) {
                val wifiManager = context.getSystemService(Context.WIFI_SERVICE) as? WifiManager
                val connectivityManager =
                    context.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager

                if (wifiManager != null && connectivityManager != null) {
                    WifiDatosScreen(
                        wifiManager = wifiManager,
                        connectivityManager = connectivityManager,
                        context = context,

                        )
                }

            }
        }
    }
}

