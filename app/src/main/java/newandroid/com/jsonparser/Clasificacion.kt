package newandroid.com.jsonparser

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by Alvaro on 3/7/18.
 */

@Entity(tableName = "Clasificacion")
data class Clasificacion(@PrimaryKey(autoGenerate = true) val id: Int, @ColumnInfo(name = "nombre")val nombre: String)