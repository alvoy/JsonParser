package newandroid.com.jsonparser

import android.app.Application
import android.arch.persistence.room.Room

/**
 * Created by Alvaro on 4/26/18.
 */

class MyApp : Application() {

    companion object {
        var database: MyDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        MyApp.database =  Room.databaseBuilder(this, MyDatabase::class.java, "db").build()
    }
}