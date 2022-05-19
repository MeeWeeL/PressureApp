package com.meeweel.pressureapp.domain

data class Item(
    val id: Int,
    val data: String,
    val time: String,
    val firstPressure: Int,
    val secondPressure: Int,
    val pulse: Int
)