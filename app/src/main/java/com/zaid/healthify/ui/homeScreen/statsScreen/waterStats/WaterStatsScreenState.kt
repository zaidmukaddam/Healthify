package com.zaid.healthify.ui.homeScreen.statsScreen.waterStats

data class WaterStatsScreenState(
    val weeklyPercentage: Float = 0F,
    val expGained: Long = 0L,
    val weekDate: String = "",
    val barChartData: List<Pair<String, Float>> = mutableListOf(),
    val lineChartData: List<Pair<String, Float>> = mutableListOf()
)
