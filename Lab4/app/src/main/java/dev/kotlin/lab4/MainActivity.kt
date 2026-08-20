package dev.kotlin.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.kotlin.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab4Theme {
                Portada()

            }
        }
    }
}

@Composable
fun Portada() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .border(
                width = 4.dp,
                color = Color(0xFF146B2E)
            )
            .padding(20.dp)
    ) {

        // LOGO DE FONDO
        Image(
            painter = painterResource(id = R.drawable.uvg_logo),
            contentDescription = null,
            modifier = Modifier
                .size(220.dp)
                .align(Alignment.Center),
            alpha = 0.12f,
            contentScale = ContentScale.Fit
        )

        // CONTENIDO
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Universidad del Valle\nde Guatemala",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Programación de plataformas\nmóviles, Sección 30",
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(35.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "INTEGRANTES",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Sergio López\nCristian Orellana\nRicardo Escobar",
                    fontSize = 12.sp,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(25.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "CATEDRÁTICO",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Juan Carlos Durini",
                    fontSize = 12.sp,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(25.dp))

            Text(
                text = "Sergio López\n25848",
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PortadaPreview(){
    Lab4Theme() {
        Portada()
    }
}



