package newandroid.com.jsonparser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doAsync {
            val pelicula = Pelicula(1,"Jaws","Steven Spielberg","Terror")
            MyApp.database?.peliculaDao()?.insertMovie(pelicula)
            val clasificacion = Clasificacion(0,"Terror")
            MyApp.database?.clasificacionDao()?.insertClas(clasificacion)
        }

    }
}
