import com.teranga.tourconnected.model.Histoire;
import com.teranga.tourconnected.repository.HistoireRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service pour gérer la logique métier des histoires et anecdotes.
 */
@Service
@RequiredArgsConstructor // Injecte automatiquement HistoireRepository
public class HistoireService {

    private final HistoireRepository repository;

    /**
     * Récupère la liste de toutes les histoires.
     * @return Une liste d'Histoire.
     */
    public List<Histoire> getAllHistoires() {
        return repository.findAll();
    }

    /**
     * Ajoute une nouvelle histoire ou met à jour une histoire existante.
     * @param histoire L'Histoire à sauvegarder.
     * @return L'Histoire sauvegardée.
     */
    public Histoire addHistoire(Histoire histoire) {
        return repository.save(histoire);
    }
}
