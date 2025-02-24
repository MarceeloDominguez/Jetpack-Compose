package com.example.appui.house_booking.data

import androidx.annotation.DrawableRes
import com.example.appui.R

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