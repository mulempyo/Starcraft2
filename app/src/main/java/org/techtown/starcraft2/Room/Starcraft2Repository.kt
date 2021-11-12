package org.techtown.starcraft2.Room

import org.techtown.starcraft2.Room.Starcraft2Dao
import javax.inject.Inject

class Starcraft2Repository @Inject constructor(private var starcraft2Dao: Starcraft2Dao) {
    val readAll=starcraft2Dao.readAll()
}