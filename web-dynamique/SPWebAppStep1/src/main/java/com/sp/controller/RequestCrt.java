package com.sp.controller;

import com.sp.entities.CardEntity;
import com.sp.model.Card;
import com.sp.services.CardService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RequestCrt {
    @Autowired
    CardService cardService;

    @GetMapping(value = {"/{id}"})
    public String view(Model model, @PathVariable int id) {
        Card card = cardService.getCardById(id);
        model.addAttribute("card", card);
        return "displayCard";
    }

    @GetMapping(value = {"/list"})
    public String viewAll(Model model) {
        List<Card> cardList = cardService.getAll().stream().map(CardEntity::toDto).toList();
        model.addAttribute("cardList", cardList);
        return "displayAllCards";
    }

    @GetMapping(value = {"/card/insertNew"})
    public String form(Model model) {
        model.addAttribute("cardForm", new Card());
        return "cardForm";
    }

    @PostMapping(value = {"/card/insertFromForm"})
    public String insertCard(@ModelAttribute Card cardForm, Model model) {
        CardEntity card = cardService.insert(cardForm);
        // TODO gestion d'erreur lorsque card est null ?
        return "displayCard";
    }
}
