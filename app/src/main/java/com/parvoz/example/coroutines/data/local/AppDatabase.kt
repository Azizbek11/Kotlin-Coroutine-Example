package com.parvoz.example.coroutines.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.parvoz.example.coroutines.data.local.dao.UserDao
import com.parvoz.example.coroutines.data.local.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}