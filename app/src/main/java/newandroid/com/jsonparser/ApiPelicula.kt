package newandroid.com.jsonparser

import com.google.gson.annotations.SerializedName


/**
 * Created by Alvaro on 3/7/18.
 */


data class ApiPelicula(@SerializedName("id") val id: Int, @SerializedName("nombre") val nombre: String, @SerializedName("director") val director: String, @SerializedName("clasificacion") val clasificacion: String)