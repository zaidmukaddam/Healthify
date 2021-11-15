package com.zaid.healthify.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zaid.healthify.data.models.local.LeaderBoardItem
import com.zaid.healthify.data.models.local.Sleep
import com.zaid.healthify.data.models.local.Water

@Database(
    entities = [Water::class, Sleep::class, LeaderBoardItem::class],
    version = 5,
    exportSchema = false
)
abstract class HealthifyDB : RoomDatabase() {

    abstract fun getWaterDao(): WaterDao

    abstract fun getSleepDao(): SleepDao

    abstract fun getLeaderBoardDao(): LeaderBoardDao
}
