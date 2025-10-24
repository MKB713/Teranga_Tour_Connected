import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour l'entité PlatTraditionnel.
 * Hérite de JpaRepository pour les opérations CRUD.
 */
@Repository
public interface PlatTraditionnelRepository extends JpaRepository<PlatTraditionnel, Long> {
    // Spring Data JPA gère tout automatiquement
}
