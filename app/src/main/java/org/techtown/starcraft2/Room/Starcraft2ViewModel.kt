package org.techtown.starcraft2.Room

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.techtown.starcraft2.Room.Starcraft2Repository
import javax.inject.Inject

@HiltViewModel
class Starcraft2ViewModel @Inject constructor(
    starcraft2Repository: Starcraft2Repository
) :ViewModel(){
    val readAll = starcraft2Repository.readAll
}