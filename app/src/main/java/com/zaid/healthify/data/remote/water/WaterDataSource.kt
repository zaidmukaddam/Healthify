package com.zaid.healthify.data.remote.water

import com.zaid.healthify.data.models.remote.WaterDTO
import com.zaid.healthify.util.Resource

interface WaterDataSource {

    suspend fun getAllWaterLogs(email: String): Resource<List<WaterDTO>>

    suspend fun addWater(email: String, waterDTO: WaterDTO): Resource<WaterDTO>
}
