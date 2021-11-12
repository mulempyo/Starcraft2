package org.techtown.starcraft2.Room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Starcraft2Table::class],version = 1,exportSchema = true)
abstract class Starcraft2DB: RoomDatabase() {
    abstract fun starcraft2Dao(): Starcraft2Dao
}