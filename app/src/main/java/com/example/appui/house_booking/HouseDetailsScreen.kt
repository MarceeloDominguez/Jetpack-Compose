package com.example.appui.house_booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.appui.house_booking.data.House

@Composable
fun HouseDetailsScreen(house: House) {
    Column {
        Text(text = house.name)
        Text(text = "Price: $${house.price}")
        Image(
            painter = painterResource(id = house.imageRes), contentDescription = house.name,
            modifier = Modifier.fillMaxWidth()
        )
    }
}
