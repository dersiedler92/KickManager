package org.example;
import lombok.Data;

@Data
public class PlayerStats {

    private int tackle;
    private int speed;
    private int stamina;
    private int heading;
    private int shooting;
    private int blocking;
    private int technique;
    private int physique;
    private int anticipation;
    private int magic;
    private int coolness;
    private int ballHandling;
    private int passing;
    private int crossing;
    private int intelligence;
    private int aggressiveness;
    private int reaction;

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
}
