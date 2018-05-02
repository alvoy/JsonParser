package newandroid.com.jsonparser

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created by Alvaro on 3/7/18.
 */

@Entity(tableName = "Pelicula")
data class Pelicula(@PrimaryKey (autoGenerate = true) @SerializedName("id") val id: Int, @ColumnInfo(name = "nombre") @SerializedName("nombre") val nombre: String, @ColumnInfo(name = "director") @SerializedName("director") val director: String, @ColumnInfo(name = "clasificacion") @SerializedName("clasificacion") val clasificacion: String)