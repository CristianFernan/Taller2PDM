package com.pdmtaller2.CristianParada_00107223.ui.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.CristianParada_00107223.data.mockRestaurant
import com.pdmtaller2.CristianParada_00107223.ui.components.BottomBar
import com.pdmtaller2.CristianParada_00107223.ui.navigation.Screen

@Composable
fun MainScreen(navController: NavHostController = rememberNavController()) {
    val restaurants = mockRestaurant

    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController, restaurants = restaurants)
            }
            composable(Screen.Search.route) {
                Text("Search Screen", modifier = Modifier.fillMaxSize(), fontSize = 24.sp)
            }
            composable(Screen.Orders.route) {
                Text("My orders Screen", modifier = Modifier.fillMaxSize(), fontSize = 24.sp)
            }
            composable("menu/{restaurantId}"){ backStackEntry ->
                //extrae el id del restaurante en base al icono que se elije
                val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull()
                //encuentra el restuarante seleccionado
                val restaurant = restaurants.find { it.id == restaurantId }
                if (restaurant != null) {
                    MenuScreen(navController = navController, restaurant = restaurant)
                } else {
                    Text("Restaurant not found")
                }
            }
        }
    }
}
