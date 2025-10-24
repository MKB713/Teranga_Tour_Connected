import com.teranga.tourconnected.model.Histoire;
import com.teranga.tourconnected.service.HistoireService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour exposer les endpoints de gestion des histoires.
 * URL de base : /api/histoires
 */
@RestController
@RequestMapping("/api/histoires")
@RequiredArgsConstructor
public class HistoireController {

    private final HistoireService service;

    /**
     * Endpoint GET pour récupérer toutes les histoires.
     * @return Liste d'Histoire.
     */
    @GetMapping
    public List<Histoire> getHistoires() {
        return service.getAllHistoires();
    }

    /**
     * Endpoint POST pour ajouter une nouvelle histoire.
     * @param histoire L'Histoire envoyée dans le corps de la requête.
     * @return L'Histoire sauvegardée.
     */
    @PostMapping
    public Histoire addHistoire(@RequestBody Histoire histoire) {
        return service.addHistoire(histoire);
    }
}
