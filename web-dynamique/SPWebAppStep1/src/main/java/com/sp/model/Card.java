package com.sp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Card {
    private String name = "null";
    private String description = "null";
    private String family = "null";
    private String affinity = "null";
    private String imgUrl = "null";
    private String smallImgUrl = "null";
    private int id = 0;
    private int energy = 0;
    private int hp = 0;
    private int defense = 0;
    private int attack = 0;
    private int price = 0;
    private int usedId = 0;
}
