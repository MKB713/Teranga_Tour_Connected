package com.teranga.tourconnected.controller;

import com.teranga.tourconnected.model.SiteTouristique;
import com.teranga.tourconnected.service.SiteTouristiqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Contrôleur REST pour l'entité SiteTouristique.
 * Expose les endpoints pour récupérer et ajouter des sites.
 */
@RestController
@RequestMapping("/api/sites")
@RequiredArgsConstructor // Injecte automatiquement le SiteTouristiqueService
public class SiteTouristiqueController {

    private final SiteTouristiqueService service;

    /**
     * Endpoint GET pour récupérer tous les sites touristiques.
     * URL: /api/sites
     * @return La liste de tous les sites.
     */
    @GetMapping
    public List<SiteTouristique> getSites() {
        return service.getAllSites();
    }

    /**
     * Endpoint POST pour ajouter un nouveau site touristique.
     * URL: /api/sites
     * @param site Le site à ajouter (envoyé dans le corps de la requête).
     * @return Le site sauvegardé.
     */
    @PostMapping
    public SiteTouristique addSite(@RequestBody SiteTouristique site) {
        return service.addSite(site);
    }
}
