package com.zaid.healthify.data.remote.auth

import com.zaid.healthify.data.models.remote.UserDTO
import com.zaid.healthify.util.Resource

interface AuthDataSource {

    suspend fun getUserData(email: String): Resource<UserDTO>

    suspend fun saveUserData(user: UserDTO): Resource<UserDTO>

    suspend fun saveUserName(username: String, email: String): Resource<Unit>

    suspend fun saveUserAgeAndSleepLimit(age: Int, limit: Int, email: String): Resource<Unit>

    suspend fun saveUserWeightAndWaterQuantity(
        weight: Int,
        quantity: Int,
        email: String
    ): Resource<Unit>

    suspend fun increaseUserExp(inc: Int, email: String): Resource<Unit>

    suspend fun fetchAllUsers(): Resource<List<UserDTO>>

    suspend fun updateUserSleepLimit(limit: Int, email: String): Resource<Unit>

    suspend fun updateUserWaterLimit(limit: Int, email: String): Resource<Unit>
}
