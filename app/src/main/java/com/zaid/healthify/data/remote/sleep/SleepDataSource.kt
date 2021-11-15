package com.zaid.healthify.data.remote.sleep

import com.zaid.healthify.data.models.remote.SleepDTO
import com.zaid.healthify.util.Resource

interface SleepDataSource {

    suspend fun getAllSleepLogs(email: String): Resource<List<SleepDTO>>

    suspend fun addSleep(email: String, sleepDTO: SleepDTO): Resource<SleepDTO>
}
