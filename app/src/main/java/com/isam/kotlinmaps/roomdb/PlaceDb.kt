package com.isam.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.isam.kotlinmaps.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDb : RoomDatabase() {
    abstract fun placeDao() : PlaceDao

}