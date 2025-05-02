package com.pdmtaller2.CristianParada_00107223.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.CristianParada_00107223.data.mockRestaurant
import com.pdmtaller2.CristianParada_00107223.ui.main.HomeScreen
import com.pdmtaller2.CristianParada_00107223.ui.main.MainScreen
import com.pdmtaller2.CristianParada_00107223.ui.main.MenuScreen
import com.pdmtaller2.CristianParada_00107223.ui.theme.FoodSpotByParadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByParadaTheme {
                val navController = rememberNavController()
                MainScreen(navController)
            }
        }
    }
}