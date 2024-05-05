package com.sp.services;

import com.sp.entities.CardEntity;
import com.sp.model.Card;
import com.sp.repositories.CardCollection;
import com.sp.repositories.CardRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
public class CardService {
    @Autowired
    CardRepository cardRepository;

    public Card getCardById(int id) {
        Optional<CardEntity> cardEntity = cardRepository.findById(id);

        if (cardEntity.isEmpty()) {
            CardCollection cardCollection = new CardCollection();
            CardEntity response = cardCollection.getCards().get(id);
            if (response != null) {
                return response.toDto();
            }

            return null;
        }
        CardEntity cardEntity1 = cardEntity.get();
        return cardEntity1.toDto();
    }

    public CardEntity insert(Card card) {
        CardEntity cardEntity = new CardEntity(card.getId(), card.getName(), card.getDescription(), card.getFamily(), card.getAffinity(), card.getImgUrl(), card.getSmallImgUrl(), card.getEnergy(), card.getHp(), card.getDefense(), card.getAttack(), card.getPrice(), card.getPrice());
        return this.cardRepository.save(cardEntity);
    }

    public List<CardEntity> getAll() {
        return this.cardRepository.findAll();
    }
}
