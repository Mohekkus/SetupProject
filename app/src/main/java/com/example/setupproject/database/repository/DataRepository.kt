package com.example.setupproject.database.repository

import com.example.setupproject.database.dao.DataDAO
import com.example.setupproject.database.entity.DataEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataRepository @Inject constructor(
    private val dao: DataDAO
) {

    suspend fun insertData(entity: DataEntity) = dao.insertData(entity)
    suspend fun getAllData() = dao.getData()
}