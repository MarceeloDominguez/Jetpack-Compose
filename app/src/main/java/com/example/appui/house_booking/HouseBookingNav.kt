package com.example.appui.house_booking

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HouseBookingNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "house_booking_main") {
        composable("house_booking_main") { MainScreenHouseBooking(navController) }
        composable("house_booking_home") { HomeScreen() }
    }
}