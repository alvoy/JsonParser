package newandroid.com.jsonparser

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created by Alvaro on 3/7/18.
 */

@Entity(tableName = "Pelicula")
data class Pelicula(@PrimaryKey (autoGenerate = true)  @SerializedName("id") val id: Int, @SerializedName("nombre") @ColumnInfo(name = "nombre")  val nombre: String, @SerializedName("director") @ColumnInfo(name = "director") val director: String, @SerializedName("clasificacion") @ColumnInfo(name = "clasificacion")  val clasificacion: String)