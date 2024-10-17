package com.example.setupproject.database.dao

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.Query
import com.example.setupproject.database.entity.DataEntity

@Dao
interface DataDAO {

    @Insert
    suspend fun insertData(data: DataEntity)

    @Query("SELECT * FROM DataEntity")
    suspend fun getData(): DataEntity

    @Query("SELECT * FROM DataEntity WHERE year = :year")
    suspend fun getYear(year: Int) : Database?
}