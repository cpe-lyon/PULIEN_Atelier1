package com.sp.entities;

import com.sp.model.Card;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Card")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String family;
    private String affinity;
    private String imgUrl;
    private String smallImgUrl;
    private int energy;
    private int hp;
    private int defense;
    private int attack;
    private int price;
    private int usedId;

    public Card toDto() {
        return new Card(
                this.name,
                this.description,
                this.family,
                this.affinity,
                this.imgUrl,
                this.smallImgUrl,
                this.id,
                this.energy,
                this.hp,
                this.defense,
                this.attack,
                this.price,
                this.usedId
        );

    }

}
