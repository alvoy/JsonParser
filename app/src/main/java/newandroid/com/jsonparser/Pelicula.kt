package newandroid.com.jsonparser

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by Alvaro on 3/7/18.
 */

@Entity(tableName = "Pelicula")
data class Pelicula(@PrimaryKey (autoGenerate = true) val id: Int, @ColumnInfo(name = "nombre")val nombre: String,@ColumnInfo(name = "director") val director: String, @ColumnInfo(name = "clasificacion")val clasificacion: String)