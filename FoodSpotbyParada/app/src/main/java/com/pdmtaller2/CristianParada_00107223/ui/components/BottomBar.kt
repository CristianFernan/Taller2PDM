package com.pdmtaller2.CristianParada_00107223.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pdmtaller2.CristianParada_00107223.ui.navigation.Screen

@Composable
fun BottomBar(navController:NavController) {
    val items = listOf(
        Screen.Home,
        Screen.Search,
        Screen.Orders
    )

    NavigationBar {
        val currentRoute = navController
            .currentBackStackEntryAsState().value?.destination

        items.forEach { screen -> NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home Screen") },
            label = { Text(screen.title) },
            selected = currentRoute?.route?.startsWith(screen.route.substringBefore("/")) == true,
            onClick = {
                navController.navigate(screen.route) {
                    popUpTo(Screen.Home.route) { inclusive = false }
                    launchSingleTop = true
                }
            }
        ) }
    }
}