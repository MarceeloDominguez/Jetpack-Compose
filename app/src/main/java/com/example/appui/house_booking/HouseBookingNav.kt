package com.example.appui.house_booking

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appui.house_booking.components.House

class SharedViewModel : ViewModel() {
    var selectedHouse: House? by mutableStateOf(null)
}

@Composable
fun HouseBookingNav() {
    val navController = rememberNavController()
    val sharedViewModel: SharedViewModel = viewModel()

    NavHost(navController = navController, startDestination = "house_booking_main") {
        composable("house_booking_main") { MainScreenHouseBooking(navController) }
        composable("house_booking_home") { HomeScreen(navController, sharedViewModel) }
        composable("house_booking_details") {
            val house = sharedViewModel.selectedHouse ?: return@composable
            HouseDetailsScreen(house)
        }
    }
}