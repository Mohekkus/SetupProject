package com.example.setupproject.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo("year") val year: Int
)