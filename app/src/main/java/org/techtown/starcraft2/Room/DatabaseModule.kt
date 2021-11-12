package org.techtown.starcraft2.Room

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(context, Starcraft2DB::class.java,
        "starcraft2_database").createFromAsset("databases/Starcraft2_Terran2.db").build()
    @Singleton
    @Provides
    fun provideDao(database: Starcraft2DB)=database.starcraft2Dao()
}