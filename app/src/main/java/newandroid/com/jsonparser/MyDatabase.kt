package newandroid.com.jsonparser

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by Alvaro on 4/26/18.
 */

@Database(entities = arrayOf(Pelicula::class, Clasificacion::class), version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun peliculaDao(): PeliculaDao
    abstract fun clasificacionDao(): ClasificacionDao

}