import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour l'entité Histoire.
 * Hérite de JpaRepository pour les opérations CRUD.
 */
@Repository
public interface HistoireRepository extends JpaRepository<Histoire, Long> {
    // Spring Data JPA gère tout automatiquement
}
