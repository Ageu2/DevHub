package com.example.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp

import coil.compose.rememberAsyncImagePainter
import com.example.devhub.ui.theme.DevHubTheme
//package br.com.alura.devhub

// imports

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    Layoutcolor() //order positio for see
                    ProfileScreen()
                    //ImageFromUrl(imageUrl = "https://avatars.githubusercontent.com/u/149025766?v=4")

                }
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column (
        modifier=Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        //insert image with archive
        /*Image(
            painter = painterResource(id = R.drawable.i149025766),
            contentDescription = "My Image",
            modifier = Modifier
                .size(150.dp)
                .padding(10.dp)
                .clip(CircleShape)//format image in circle

        )*/
        //  inser image view with url
        val painter = rememberAsyncImagePainter(
            model = "https://avatars.githubusercontent.com/u/149025766?v=4",
            placeholder = painterResource(id = R.drawable.ic_launcher_foreground),
            error = painterResource(id = R.drawable.ic_launcher_foreground)
        )
        Image(
            painter = painter,
            contentDescription = "Image from URL",
            modifier = Modifier
                .size(150.dp)
                .padding(10.dp)
                .clip(CircleShape)//format image in circle
        )
        //with color in text
        Text(text = "Ageu", color = Color.Blue)
        Text(text = "Ageu2", color = Color.Blue)
        Text(text = "DeveloperStudent", color = Color.Blue)
    }
}
@Composable
fun Layoutcolor () {
    Column (modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxSize()
                .background(Color.DarkGray, shape = RoundedCornerShape(5.dp))


        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color.LightGray, shape = RoundedCornerShape(5.dp))


        )

    }
}