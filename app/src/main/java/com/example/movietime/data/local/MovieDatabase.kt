package com.example.movietime.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movietime.data.local.dao.MovieDao
import com.example.movietime.domain.model.Movie

@Database(
    entities = [Movie::class],
    version = 1
)
abstract class MovieDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao

}