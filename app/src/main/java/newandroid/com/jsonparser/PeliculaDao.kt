package newandroid.com.jsonparser

import android.arch.persistence.room.*
import io.reactivex.Flowable

/**
 * Created by Alvaro on 4/26/18.
 */

@Dao
interface PeliculaDao {
    @Query("SELECT * FROM Pelicula")
    fun getAllMovies() : Flowable<List<Pelicula>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(pelicula: Pelicula)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(peliculas: Array<Pelicula>)

    @Update
    fun updateMovie(peliculas: Array<Pelicula>)

    @Delete
    fun deleteMovie(peliculas: Array<Pelicula>)

}