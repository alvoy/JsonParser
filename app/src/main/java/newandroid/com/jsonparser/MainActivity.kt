package newandroid.com.jsonparser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.jetbrains.anko.doAsync
import java.io.FileReader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doAsync {
            val gson = Gson()
            var peliculaList: Array<Pelicula> = gson.fromJson(FileReader("file:///assets/peliculas.json"),object : TypeToken<Array<Pelicula>>() {}.type)

            Log.i("peliculas",peliculaList.toString())
            MyApp.database?.peliculaDao()?.insertMovies(peliculaList)
            val clasificacion = Clasificacion(0,"Terror")
            MyApp.database?.clasificacionDao()?.insertClas(clasificacion)
        }

    }
}
