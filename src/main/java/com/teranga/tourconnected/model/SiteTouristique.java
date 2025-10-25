package com.teranga.tourconnected.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * Représente un site touristique dans la base de données.
 * Utilise Lombok pour les getters, setters, constructeurs par défaut et toString.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SiteTouristique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private String localisation;
    private String imageUrl;
    private double latitude;
    private double longitude;
}
