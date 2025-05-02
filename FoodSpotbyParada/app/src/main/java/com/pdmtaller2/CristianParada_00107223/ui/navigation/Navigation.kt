package com.pdmtaller2.CristianParada_00107223.ui.navigation

sealed class Screen(val route: String, val title: String) {
    object Home : Screen("home", "Restaurants")
    object Search : Screen("search", "Search")
    object Orders : Screen("orders", "My Orders")
    object Menu : Screen("menu/{restaurantId}", "Menu")
}