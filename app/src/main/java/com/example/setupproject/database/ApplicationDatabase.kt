package com.example.setupproject.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.setupproject.database.dao.DataDAO
import com.example.setupproject.database.entity.DataEntity

@Database(
    version = 1,
    entities = [
        DataEntity::class
               ],
)
abstract class ApplicationDatabase: RoomDatabase() {
    abstract fun dataDao(): DataDAO
}