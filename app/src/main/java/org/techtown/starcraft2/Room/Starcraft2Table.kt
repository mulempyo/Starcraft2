package org.techtown.starcraft2.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Starcraft2")
data class Starcraft2Table (
    @PrimaryKey(autoGenerate = true)
    val COLUMN_NAME_UNIT:String,
    val COLUMN_NAME_MINERAL:Int,
    val COLUMN_NAME_GAS:Int,
    val COLUMN_NAME_HP:Int,
    val COLUMN_NAME_ATTACK:Int,
    val COLUMN_NAME_DEFENSE:Int,
    val COLUMN_NAME_ARMOR :String,
    val COLUMN_NAME_MOVE :Int,
    val COLUMN_NAME_SPEED_ATTACK :Int,
    val COLUMN_NAME_TARGET:String,
    val COLUMN_NAME_DISTANCE:Int,
    val COLUMN_NAME_ABILITY :String,
    val COLUMN_NAME_PLUS_ATTACK :String
    )




