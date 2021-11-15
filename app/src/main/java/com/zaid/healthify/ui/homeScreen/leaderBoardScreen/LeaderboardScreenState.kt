package com.zaid.healthify.ui.homeScreen.leaderBoardScreen

import com.zaid.healthify.data.models.local.LeaderBoardItem

data class LeaderboardScreenState(
    val leaderboardItems: List<LeaderBoardItem> = emptyList()
)
