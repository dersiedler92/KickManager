package org.example;

import java.util.Date;

public class Player {
    private String name;
    private Date age;
    private double height;
    private double weight;
    private Nationality nationality;
    private PlayerStats stats;

    public Player(String name, Date age, double height, double weight, Nationality nationality, PlayerStats stats) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.stats = stats;
    }

}
