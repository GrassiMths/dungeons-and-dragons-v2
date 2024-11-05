import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface PersonagemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(personagem: Personagem)

    @Update
    suspend fun update(personagem: Personagem)

    @Query("SELECT * FROM Personagem")
    suspend fun findAll(): List<Personagem>

    @Query("SELECT * FROM Personagem WHERE id = :id")
    suspend fun getById(id: Int): Personagem?

    @Query("DELETE FROM Personagem WHERE id = :id")
    suspend fun deleteById(id: Int)

}