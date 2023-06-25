package org.example.player;

import lombok.Data;
import org.example.Nationality;

import java.time.LocalDate;

@Data
public class Player {
    private String name;
    private LocalDate birthDate;
    private double height;
    private double weight;
    private Nationality nationality;
    private PlayerStats playerStats;
    private GoalieStats goalieStats;
    private Position position;
    private int jerseyNumber;

    public Player(String name, LocalDate birthDate, double height, double weight, Nationality nationality,
                  PlayerStats playerStats, GoalieStats goalieStats, Position position, int jerseyNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.playerStats = playerStats;
        this.goalieStats = goalieStats;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

}
