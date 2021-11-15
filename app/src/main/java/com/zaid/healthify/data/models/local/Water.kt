package com.zaid.healthify.data.models.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.zaid.healthify.util.WATER

@Entity(tableName = "water_table")
data class Water(
    val quantity: WATER,
    val timeStamp: Long,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
)
