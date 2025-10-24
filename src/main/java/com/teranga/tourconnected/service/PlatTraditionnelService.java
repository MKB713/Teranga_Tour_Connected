import com.teranga.tourconnected.model.PlatTraditionnel;
import com.teranga.tourconnected.repository.PlatTraditionnelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service pour gérer la logique métier des plats traditionnels.
 */
@Service
@RequiredArgsConstructor // Injecte automatiquement PlatTraditionnelRepository
public class PlatTraditionnelService {

    private final PlatTraditionnelRepository repository;

    /**
     * Récupère la liste de tous les plats traditionnels.
     * @return Une liste de PlatTraditionnel.
     */
    public List<PlatTraditionnel> getAllPlats() {
        return repository.findAll();
    }

    /**
     * Ajoute un nouveau plat traditionnel ou met à jour un plat existant.
     * @param plat Le PlatTraditionnel à sauvegarder.
     * @return Le PlatTraditionnel sauvegardé.
     */
    public PlatTraditionnel addPlat(PlatTraditionnel plat) {
        return repository.save(plat);
    }
}
