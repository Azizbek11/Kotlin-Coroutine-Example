package com.parvoz.coroutines.data.local

import com.parvoz.coroutines.data.local.entity.User

interface DatabaseHelper {

    suspend fun getUsers(): List<User>

    suspend fun insertAll(users: List<User>)

}