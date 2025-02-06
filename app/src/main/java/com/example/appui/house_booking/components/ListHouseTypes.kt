package com.example.appui.house_booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appui.R

data class Housing(
    val name: String,
    val imageRes: Int
)

fun getHousing(): List<Housing> {
    return listOf(
        Housing("Home", R.drawable.profile_picture),
        Housing("Apartment", R.drawable.profile_picture),
        Housing("Office", R.drawable.profile_picture),
        Housing("Empty land", R.drawable.profile_picture),
        Housing("Villa", R.drawable.profile_picture),
        Housing("Tents", R.drawable.profile_picture)
    )
}

@Composable
fun ListHouseTypes() {
    val housing = getHousing()

    LazyVerticalGrid(
        //columns = GridCells.Adaptive(minSize = 100.dp),
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .height(120.dp)
    ) {
        items(housing) { housing ->
            HousingItem(housing = housing)
        }
    }
}

@Composable
fun HousingItem(housing: Housing) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(color = Color(0xFFecf2f3))
            .padding(horizontal = 8.dp, vertical = 12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = housing.name,
                modifier = Modifier
                    .size(15.dp),
                tint = Color(0xFF196d7e)

            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = housing.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f),
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}