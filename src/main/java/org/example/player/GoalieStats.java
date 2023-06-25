package org.example.player;
import lombok.Data;

import java.util.Random;

@Data
public class GoalieStats {

    private int speed;
    private int blocking;
    private int anticipation;
    private int coolness;
    private int intelligence;
    private int reaction;
    private int catching;
    private int throwing;

    public GoalieStats() {
    }

    public GoalieStats(int speed, int blocking, int anticipation, int coolness, int intelligence, int reaction, int catching, int throwing) {
        this.speed = speed;
        this.blocking = blocking;
        this.anticipation = anticipation;
        this.coolness = coolness;
        this.intelligence = intelligence;
        this.reaction = reaction;
        this.catching = catching;
        this.throwing = throwing;
    }

    public void statGeneration() {
        Random random = new Random();
        this.speed = random.nextInt(3, 12);
        this.blocking = random.nextInt(5, 15);
        this.anticipation = random.nextInt(3, 13);
        this.coolness = random.nextInt(1, 15);
        this.intelligence = random.nextInt(1, 15);
        this.reaction = random.nextInt(5, 15);
        this.catching = random.nextInt(3, 15);
        this.throwing = random.nextInt(5, 15);
    }
}
