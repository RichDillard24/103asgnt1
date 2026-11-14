package com.example.a103asgnt1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a103asgnt1.ui.theme._103asgnt1Theme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.shape.RoundedCornerShape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _103asgnt1Theme {
                BakeryRevenueScreen()

            }
        }
    }
}
// Challenge 3-1
@Composable
fun BakeryRevenueScreen(){
        val currencySymbol = "$"
        var cookiesSold by remember { mutableStateOf("") }
        var cookiePrice by remember { mutableStateOf("") }
    // Challenge 6-1
        var muffinsSold by remember { mutableStateOf("")}
        var muffinPrice by remember { mutableStateOf("")}
        var cakesSold by remember { mutableStateOf("")}
        var cakePrice by remember { mutableStateOf("")}
    //Data structure
        val bakeryItems = remember { mutableStateListOf<BakeryItem>() }
        var totalRevenue by remember { mutableDoubleStateOf(0.0) }
        var bestSellingItem by remember { mutableStateOf("") }
        var errorMessage by remember {mutableStateOf("")}

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            Text(
                text = "\uD83E\uDDC1 Bakery Sales",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF30243F),
                //style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp)

            )

            Text(
                text = "Enter the sales information for each product.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            // challenge 7-1

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAF7D8)
                ),
                elevation = CardDefaults.cardElevation(2.dp)
            ){
                Column(
                    modifier = Modifier.padding(16.dp)
                ){
                    Text(
                        text = "\uD83E\uDF6A Cookies",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF30243F),
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // cookies
                    OutlinedTextField(
                        value = cookiesSold,
                        onValueChange = { cookiesSold = it },
                        label = { Text("Cookies Sold") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = cookiePrice,
                        onValueChange = { cookiePrice = it },
                        label = { Text("Price per Cookie") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }



            Spacer(modifier = Modifier.height(12.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAF7D8)
                ),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "\uD83E\uDF6A Muffins",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF30243F),
                    )

                    Spacer(modifier = Modifier.height(12.dp))
//muffin challenge
                    OutlinedTextField(
                        value = muffinsSold,
                        onValueChange = { muffinsSold = it },
                        label = { Text("Muffins  Sold") },
                        modifier = Modifier.fillMaxWidth()
                    )



                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = muffinPrice,
                        onValueChange = { muffinPrice = it },
                        label = { Text("Price per Muffin") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAF7D8)
                ),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "\uD83E\uDF6A Cakes",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF30243F),
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = cakesSold,
                        onValueChange = { cakesSold = it },
                        label = { Text("Cakes Sold") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = cakePrice,
                        onValueChange = { cakePrice = it },
                        label = { Text("Price per cake") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            // cake challenge

            Spacer(modifier = Modifier.height(8.dp))


        }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _103asgnt1Theme {
        BakeryRevenueScreen()
    }
}