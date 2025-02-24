package com.example.appui.house_booking.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appui.R
import com.example.appui.house_booking.SharedViewModel

data class House(
    val name: String,
    val price: Int,
    @DrawableRes val imageRes: Int
)

fun getHouseList(): List<House> {
    return listOf(
        House("Cozy Family Home", 250000, R.drawable.item_1),
        House("Modern Apartment", 180000, R.drawable.item_2),
        House("Luxury Villa", 1200000, R.drawable.item_3)
    )
}

@Composable
fun HouseList(navController: NavController, sharedViewModel: SharedViewModel) {
    val houses = remember {
        getHouseList()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        houses.forEach { house ->
            HouseCard(house, navController, sharedViewModel)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun HouseCard(house: House, navController: NavController, sharedViewModel: SharedViewModel) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .clip(RoundedCornerShape(14.dp))
            .clickable {
                sharedViewModel.selectedHouse =
                    house // Save before navigate to house_booking_details
                navController.navigate("house_booking_details")
            }
    ) {
        Image(
            painter = painterResource(id = house.imageRes),
            contentDescription = house.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .align(Alignment.BottomStart)
                .clip(RoundedCornerShape(10.dp)),
        ) {
            Row(
                modifier = Modifier
                    .background(
                        Color.Black.copy(alpha = 0.5f)
                    )
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .background(color = Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp)
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = house.name,
                        modifier = Modifier.padding(bottom = 6.dp),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "$${house.price}",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Row {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = Color.LightGray
                        )
                        Text(
                            text = "3",
                            fontSize = 18.sp,
                            color = Color.LightGray,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 3.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = Color.LightGray
                        )
                        Text(
                            text = "1",
                            fontSize = 18.sp,
                            color = Color.LightGray,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 3.dp)
                        )
                    }
                }
            }
        }
    }
}

