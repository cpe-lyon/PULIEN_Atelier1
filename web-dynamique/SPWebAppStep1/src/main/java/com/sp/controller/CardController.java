package com.sp.controller;

import com.sp.entities.CardEntity;
import com.sp.model.Card;
import com.sp.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("card")
public class CardController {
    @Autowired
    CardRepository cardRepository;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<CardEntity>> getAll(){
        return ResponseEntity.ok(cardRepository.findAll());
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<CardEntity> insertCard(@RequestBody CardEntity card) {
        return ResponseEntity.ok(cardRepository.save(card));
    }
    @PostMapping(value = "/insertMany")
    public ResponseEntity<List<CardEntity>> insertManyCard(@RequestBody List<CardEntity> cards) {
        return ResponseEntity.ok(cardRepository.saveAll(cards));
    }
}
