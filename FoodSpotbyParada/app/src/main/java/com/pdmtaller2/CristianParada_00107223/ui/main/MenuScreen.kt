package com.pdmtaller2.CristianParada_00107223.ui.main

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.pdmtaller2.CristianParada_00107223.model.Restaurant


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController, restaurant: Restaurant){
    // Definimos la variable que guardara el keyword de busqueda
    var searchQuery by remember { mutableStateOf("") }

    val filteredMenu = restaurant.menu.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(restaurant.name) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Go back")
                    }
                }
            )
        }
    )
    {
        padding ->
        Column (
            modifier = Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = restaurant.description, fontSize = 16.sp)

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                label = { Text("Search dish") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            filteredMenu.forEach { dish ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                )
                {
                    Column(modifier = Modifier.padding(16.dp))
                    {
                        Text(text = dish.name, fontWeight = FontWeight.Bold, fontSize = 10.sp)
                        Text(text = dish.description, fontSize = 14.sp)

                        Spacer(modifier = Modifier.height(8.dp))

                        AsyncImage(
                            model = dish.imageUrl,
                            contentDescription = dish.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .clip(RoundedCornerShape(8.dp)),
                            contentScale = ContentScale.Crop,
                            onError = { println("Error loading image for ${restaurant.name}") }
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // Sacar el context de Android actual
                        val context =  LocalContext.current

                        Button(onClick = {
                            Toast.makeText(
                            context,
                            "${dish.name} was added to cart",
                            Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Text("Add to cart!")
                        }
                    }
                }
            }

        }
    }
}