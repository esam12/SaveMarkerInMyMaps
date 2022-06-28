package com.isam.kotlinmaps.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.isam.kotlinmaps.model.Place
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface PlaceDao {
    @Query("SELECT * FROM Place")
    fun getAll() : Flowable<List<Place>>

    @Insert
    fun insert(place : Place) : Completable
    @Delete
    fun delete(place: Place) : Completable


}