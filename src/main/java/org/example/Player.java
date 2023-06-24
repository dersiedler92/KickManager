package org.example;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Player {
    private String name;
    private LocalDate birthDate;
    private double height;
    private double weight;
    private Nationality nationality;
    private PlayerStats stats;

    public Player(String name, LocalDate birthDate, double height, double weight, Nationality nationality, PlayerStats stats) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.stats = stats;
    }

}
