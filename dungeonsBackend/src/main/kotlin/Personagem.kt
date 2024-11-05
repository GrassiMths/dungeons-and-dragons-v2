
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import racas.Raca
import java.io.Serializable

@Entity
data class Personagem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var nome: String? = null,
    @Embedded var atributos: Atributos = Atributos(),
    var raca: Raca? = null
) : Serializable

    {
    fun aplicarBonusRaca(){
        raca?.bonusRaca(this)
    }
}
