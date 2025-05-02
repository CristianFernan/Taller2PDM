package com.pdmtaller2.CristianParada_00107223.ui.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import androidx.navigation.NavController
import com.pdmtaller2.CristianParada_00107223.model.Restaurant

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, restaurants: List<Restaurant>) {

    // Agrupacion por categoria
    val categoryMap: Map<String, List<Restaurant>> = restaurants
        .flatMap { restaurant -> restaurant.categories.map { it to restaurant } }
        .groupBy({ it.first },{ it.second })

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("FoodStop") },
            )
        }
    ) {
        paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues).fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState())
        ){
            Text(
                text = "Restaurantes disponibles",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            // Espacio
            Spacer(modifier = Modifier.height(16.dp))

            // Categorias
            categoryMap.forEach { (category, restaurantCategory) ->
                Text(
                    text = category,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(vertical = 10.dp)
                )

                LazyRow {
                    items(restaurantCategory.distinctBy { it.id }) { restaurant ->
                        Column(
                            modifier = Modifier
                                .padding(end = 12.dp)
                                .clickable {
                                    navController.navigate("menu/${restaurant.id}")
                                }
                        ) {
                            AsyncImage(
                                model = restaurant.imageUrl,
                                contentDescription = restaurant.name,
                                modifier = Modifier
                                    .size(120.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop,
                                onError = { println("Error loading image for ${restaurant.name}") }
                            )
                            Text(
                                text = restaurant.name,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(top = 4.dp)
                            )

                        }
                    }
                }
            }
        }
    }
}
