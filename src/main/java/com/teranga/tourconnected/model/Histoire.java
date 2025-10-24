import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * Représente une histoire ou un récit dans la base de données.
 * Utilise Lombok pour les getters, setters, constructeurs par défaut et toString.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Histoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String contenu;
}
