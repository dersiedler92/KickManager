package org.kickmanager.league;

import lombok.Data;

@Data
public class Neighbor {
    public enum Direction {
        FRONT, BACK, LEFT, RIGHT
    }
    private final Neighbor.Direction direction;
    private int neighborSide;
    private int neighborZone;

    public Neighbor(Direction direction, int neighborSide, int neighborZone) {
        this.direction = direction;
        this.neighborSide = neighborSide;
        this.neighborZone = neighborZone;
    }
}
