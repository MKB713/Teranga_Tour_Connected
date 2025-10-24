import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour l'entité SiteTouristique.
 * Hérite de JpaRepository pour les opérations CRUD.
 */
@Repository
public interface SiteTouristiqueRepository extends JpaRepository<SiteTouristique, Long> {
    // Spring Data JPA gère tout automatiquement
}
