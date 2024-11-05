package up.ddm.data

import Personagem
import PersonagemDao
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Personagem::class], version = 2, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {


    abstract fun personagemDAO(): PersonagemDao
    companion object{

        @Volatile
        private var INSTANCIA: AppDatabase? =null

        fun getDatabase(context: Context): AppDatabase{
            return INSTANCIA ?: synchronized(this){
                val instancia = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "database"
                ).fallbackToDestructiveMigration().build()
                INSTANCIA = instancia
                return instancia
            }
        }
    }
}