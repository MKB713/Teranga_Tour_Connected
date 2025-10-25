package com.teranga.tourconnected.service;

import com.teranga.tourconnected.model.SiteTouristique;
import com.teranga.tourconnected.repository.SiteTouristiqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service pour gérer la logique métier des sites touristiques.
 */
@Service
@RequiredArgsConstructor // Injecte automatiquement les dépendances finales (Repository)

public class SiteTouristiqueService {

    private final SiteTouristiqueRepository repository;

    /**
     * Récupère la liste de tous les sites touristiques.
     * @return Une liste de SiteTouristique.
     */
    public List<SiteTouristique> getAllSites() {
        return repository.findAll();
    }

    /**
     * Ajoute un nouveau site touristique ou met à jour un site existant.
     * @param site Le SiteTouristique à sauvegarder.
     * @return Le SiteTouristique sauvegardé.
     */
    public SiteTouristique addSite(SiteTouristique site) {
        return repository.save(site);
    }
}
