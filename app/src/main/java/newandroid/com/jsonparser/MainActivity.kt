package newandroid.com.jsonparser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.jetbrains.anko.doAsync
import java.io.FileReader
import android.content.res.AssetFileDescriptor
import java.net.URL


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doAsync {
            val json: String = URL("http://10.0.3.2:3000/peliculas").readText()
            val gson = Gson()
            //val json = """{"id": "1", "nombre": "El sexto sentido", "director" : "El sexto sentido", "clasificacion" : "drama"}"""
            //val descriptor = assets.openFd("peliculas.json")
            //var pelicula: ApiPelicula = gson.fromJson(FileReader(descriptor.fileDescriptor),ApiPelicula::class.java)
            var apiPeliculaList: List<Pelicula> = gson.fromJson(json, object : TypeToken<List<Pelicula>>() {}.type)
            println(apiPeliculaList)
            MyApp.database?.peliculaDao()?.insertMovies(apiPeliculaList)
            val clasificacion = Clasificacion(0,"Terror")
            MyApp.database?.clasificacionDao()?.insertClas(clasificacion)
        }

    }
}
