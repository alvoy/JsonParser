package newandroid.com.jsonparser

import android.arch.persistence.room.*
import io.reactivex.Flowable

/**
 * Created by Alvaro on 4/26/18.
 */

@Dao
interface ClasificacionDao {
    @Query("SELECT * FROM Clasificacion")
    fun getAllClas() : Flowable<List<Clasificacion>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertClas(clasificacion: Clasificacion)

    @Update
    fun updateClas(clasificaciones:Array<Clasificacion>)

    @Delete
    fun deleteClas(clasificaciones:Array<Clasificacion>)

}