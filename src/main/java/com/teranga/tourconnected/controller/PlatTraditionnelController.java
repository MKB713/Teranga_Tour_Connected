import com.teranga.tourconnected.model.PlatTraditionnel;
import com.teranga.tourconnected.service.PlatTraditionnelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour exposer les endpoints de gestion des plats traditionnels.
 * URL de base : /api/plats
 */
@RestController
@RequestMapping("/api/plats")
@RequiredArgsConstructor
public class PlatTraditionnelController {

    private final PlatTraditionnelService service;

    /**
     * Endpoint GET pour récupérer tous les plats.
     * @return Liste de PlatTraditionnel.
     */
    @GetMapping
    public List<PlatTraditionnel> getPlats() {
        return service.getAllPlats();
    }

    /**
     * Endpoint POST pour ajouter un nouveau plat.
     * @param plat Le PlatTraditionnel envoyé dans le corps de la requête.
     * @return Le PlatTraditionnel sauvegardé.
     */
    @PostMapping
    public PlatTraditionnel addPlat(@RequestBody PlatTraditionnel plat) {
        return service.addPlat(plat);
    }
}
