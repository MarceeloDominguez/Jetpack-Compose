package com.example.appui.house_booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appui.R
import androidx.compose.material3.Icon

@Composable
fun MainScreenHouseBooking() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF196d7e))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.intro_pic),
            contentDescription = "House Description",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "Explore Houses That\nFit Your lifestyle",
            style = MaterialTheme.typography.titleMedium.copy(
                fontSize = 28.sp,
                lineHeight = 33.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Finding your Dream home, one key at a\ntime. Your trusted partner in every move",
            fontSize = 14.sp,
            lineHeight = 19.sp,
            textAlign = TextAlign.Center,
            color = Color.LightGray,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(50.dp)
                    //.background(Color.White, CircleShape)
                    .border(2.dp, Color.White, CircleShape)
            ) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = null,
                    tint = Color.White
                )
            }

            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(50.dp)
                    //.background(Color.White, CircleShape)
                    .border(2.dp, Color.White, CircleShape)
            ) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = null,
                    tint = Color.White
                )
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEDF1F1),
                    contentColor = Color(0xFF196d7e)
                )
            ) {
                Text(
                    text = "Get Started",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Already have a account? Sign In",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp
        )

        Spacer(modifier = Modifier.height(40.dp))
    }
}

@Preview
@Composable
fun MainScreenHouseBookingPrev() {
    MainScreenHouseBooking()
}