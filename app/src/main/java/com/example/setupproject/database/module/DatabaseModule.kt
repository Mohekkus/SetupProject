package com.example.setupproject.database.module

import android.content.Context
import androidx.room.Room
import com.example.setupproject.database.ApplicationDatabase
import com.example.setupproject.database.dao.DataDAO
import com.example.setupproject.database.etc.DatabaseReference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): ApplicationDatabase {
        return Room.databaseBuilder(
            context,
            ApplicationDatabase::class.java,
            DatabaseReference.REFERENCE.value() // Ensure this returns a valid string
        ).build() // Don't forget to call build()
    }

    @Provides
    @Singleton
    fun provideDao(db: ApplicationDatabase): DataDAO {
        return db.dataDao()
    }
}