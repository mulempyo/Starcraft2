package org.techtown.starcraft2.Room


import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Starcraft2Dao {
    @Query("SELECT * FROM Starcraft2")
    fun readAll(): Flow<List<Starcraft2Table>>
}