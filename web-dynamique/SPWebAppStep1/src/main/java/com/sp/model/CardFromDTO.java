package com.sp.model;

public class CardFromDTO {
    private String name;
    private String description;
    private String family;
    private String affinity;
    private String imgUrl;
    private String smallImgUrl;
    private int id;
    private int energy;
    private int hp;
    private int defense;
    private int attack;
    private int price;
    private int usedId;

    public CardFromDTO(String name, String description, String family, String affinity, String imgUrl, String smallImgUrl, int id, int energy, int hp, int defense, int attack, int price, int usedId) {
        this.name = name;
        this.description = description;
        this.family = family;
        this.affinity = affinity;
        this.imgUrl = imgUrl;
        this.smallImgUrl = smallImgUrl;
        this.id = id;
        this.energy = energy;
        this.hp = hp;
        this.defense = defense;
        this.attack = attack;
        this.price = price;
        this.usedId = usedId;
    }
}
