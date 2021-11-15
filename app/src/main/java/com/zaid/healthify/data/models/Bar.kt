package com.zaid.healthify.data.models

data class Bar(
    val barId: Int = 0,
    val day: String = "",
    val dayFull: String = "",
    val value: Int = 0,
    val timeStamp: Long = 0,
    var isPressed: Boolean = false
)
