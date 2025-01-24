package com.example.appui

sealed class NavigationRoute(val route: String) {
    object Home : NavigationRoute("home")
    object HouseBooking : NavigationRoute("house_booking")
}