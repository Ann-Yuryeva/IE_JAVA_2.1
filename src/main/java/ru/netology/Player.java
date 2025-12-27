package ru.netology;

import lombok.Data;

@Data
public class Player {
private int id;
private String name;
private int strength;

public Player (int id, String name, int strength){
    this.id = id;
    this.name=name;
    this.strength=strength;
    }
}
