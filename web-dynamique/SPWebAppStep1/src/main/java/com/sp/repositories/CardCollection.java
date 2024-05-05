package com.sp.repositories;

import com.sp.entities.CardEntity;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

// Class made for mocking data when no post has been made into h2 db
@Getter
@ToString
public class CardCollection {
    private final List<CardEntity> cards;

    public CardCollection() {
        this.cards = Arrays.asList(
                new CardEntity(1, "Dragon Rouge", "Un puissant dragon rouge", "Dragon", "Feu",
                        "http://example.com/dragon.jpg", "http://example.com/dragon_small.jpg",
                        7, 150, 50, 80, 200, 12345),
                new CardEntity(2, "Sorcier Noir", "Un sorcier aux pouvoirs obscurs", "Sorcier", "Ombre",
                        "http://example.com/sorcier.jpg", "http://example.com/sorcier_small.jpg",
                        5, 120, 40, 70, 150, 12346),
                new CardEntity(3, "Guerrier de Lumière", "Un guerrier équipé d'armes de lumière", "Guerrier", "Lumière",
                        "http://example.com/guerrier.jpg", "http://example.com/guerrier_small.jpg",
                        6, 130, 45, 75, 180, 12347),
                new CardEntity(4, "Elfe Archer", "Un elfe avec des compétences d'archerie exceptionnelles", "Elfe", "Nature",
                        "http://example.com/elfe.jpg", "http://example.com/elfe_small.jpg",
                        4, 110, 35, 65, 140, 12348)
        );
    }
}
