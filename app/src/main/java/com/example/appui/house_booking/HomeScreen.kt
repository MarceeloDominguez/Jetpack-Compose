package com.example.appui.house_booking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appui.house_booking.components.HomeHeader
import com.example.appui.house_booking.components.HomeInput
import com.example.appui.house_booking.components.ListHouseTypes

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFf8fafc))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            HomeHeader()
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Discover Your\nDream House Today",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontSize = 30.sp,
                    lineHeight = 32.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(15.dp))
            HomeInput()
            Spacer(modifier = Modifier.height(15.dp))
            ListHouseTypes()
        }
    }
}

@Preview
@Composable
fun HomeScreenPrev() {
    HomeScreen()
}