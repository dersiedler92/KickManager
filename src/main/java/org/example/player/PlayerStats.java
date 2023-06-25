package org.example.player;
import lombok.Data;

import java.util.Random;

@Data
public class PlayerStats {

    private int tackle; // DEF
    private int speed; // MID, OFF
    private int stamina; // MID
    private int heading; // DEF, OFF
    private int shooting; // MID, OFF
    private int blocking; // GK, DEF
    private int technique; // MID, OFF
    private int physique; // DEF, OFF
    private int anticipation; // GK, DEF, OFF
    private int magic; // MID, OFF
    private int coolness; // ALL
    private int ballHandling; // MID, OFF
    private int passing; // MID
    private int crossing; // MID
    private int intelligence; // MID
    private int aggressiveness; // DEF
    private int reaction; // GK, OFF

    public PlayerStats(int tackle, int speed, int stamina, int heading, int shooting, int blocking, int technique,
                       int physique, int anticipation, int magic, int coolness, int ballHandling, int passing,
                       int crossing, int intelligence, int aggressiveness, int reaction) {
        this.tackle = tackle;
        this.speed = speed;
        this.stamina = stamina;
        this.heading = heading;
        this.shooting = shooting;
        this.blocking = blocking;
        this.technique = technique;
        this.physique = physique;
        this.anticipation = anticipation;
        this.magic = magic;
        this.coolness = coolness;
        this.ballHandling = ballHandling;
        this.passing = passing;
        this.crossing = crossing;
        this.intelligence = intelligence;
        this.aggressiveness = aggressiveness;
        this.reaction = reaction;
    }

    public PlayerStats() {

    }

    public void statGeneration(Position position) {
        Random random = new Random();
        switch (position.getArea()) {
            case DEFENSE -> {
                this.tackle = random.nextInt(8, 15);
                this.speed = random.nextInt(3, 13);
                this.stamina = random.nextInt(3, 12);
                this.heading = random.nextInt(8, 13);
                this.shooting = random.nextInt(1, 8);
                this.blocking = random.nextInt(8, 15);
                this.technique = random.nextInt(1, 5);
                this.physique = random.nextInt(8, 15);
                this.anticipation = random.nextInt(5, 12);
                this.magic = random.nextInt(1, 5);
                this.coolness = random.nextInt(1, 15);
                this.ballHandling = random.nextInt(1, 8);
                this.passing = random.nextInt(1, 10);
                this.crossing = random.nextInt(1, 5);
                this.intelligence = random.nextInt(1, 15);
                this.aggressiveness = random.nextInt(5, 15);
                this.reaction = random.nextInt(1, 10);
            }
            case MIDFIELD -> {
                this.tackle = random.nextInt(3, 10);
                this.speed = random.nextInt(5, 15);
                this.stamina = random.nextInt(5, 15);
                this.heading = random.nextInt(1, 8);
                this.shooting = random.nextInt(5, 15);
                this.blocking = random.nextInt(1, 8);
                this.technique = random.nextInt(3, 15);
                this.physique = random.nextInt(3, 12);
                this.anticipation = random.nextInt(3, 8);
                this.magic = random.nextInt(1, 15);
                this.coolness = random.nextInt(1, 15);
                this.ballHandling = random.nextInt(5, 15);
                this.passing = random.nextInt(5, 15);
                this.crossing = random.nextInt(5, 15);
                this.intelligence = random.nextInt(1, 15);
                this.aggressiveness = random.nextInt(1, 10);
                this.reaction = random.nextInt(1, 10);
            }
            case OFFENSE -> {
                this.tackle = random.nextInt(1, 8);
                this.speed = random.nextInt(5, 15);
                this.stamina = random.nextInt(3, 12);
                this.heading = random.nextInt(5, 15);
                this.shooting = random.nextInt(5, 15);
                this.blocking = random.nextInt(1, 8);
                this.technique = random.nextInt(1, 15);
                this.physique = random.nextInt(3, 15);
                this.anticipation = random.nextInt(3, 15);
                this.magic = random.nextInt(1, 15);
                this.coolness = random.nextInt(1, 15);
                this.ballHandling = random.nextInt(5, 15);
                this.passing = random.nextInt(1, 10);
                this.crossing = random.nextInt(1, 8);
                this.intelligence = random.nextInt(1, 15);
                this.aggressiveness = random.nextInt(3, 12);
                this.reaction = random.nextInt(3, 15);
            }
        }
    }
}
