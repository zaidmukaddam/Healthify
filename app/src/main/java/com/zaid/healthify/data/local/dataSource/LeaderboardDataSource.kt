package com.zaid.healthify.data.local.dataSource

import com.zaid.healthify.data.local.room.LeaderBoardDao
import com.zaid.healthify.data.models.local.LeaderBoardItem
import javax.inject.Inject

class LeaderboardDataSource @Inject constructor(private val leaderBoardDao: LeaderBoardDao) {

    suspend fun getUserRank(email: String) = leaderBoardDao.getUserRank(email)

    fun getLeaderBoard() = leaderBoardDao.getLeaderBoard()

    suspend fun deleteAll() = leaderBoardDao.deleteAll()

    suspend fun insertAll(items: List<LeaderBoardItem>) = leaderBoardDao.insertAllItems(items)
}
