package org.example.player;

import java.util.List;

public enum Position {
    GOALKEEPER("GK", Area.GOAL),
    CENTER_BACK("CB", Area.DEFENSE),
    LEFT_BACK("LB", Area.DEFENSE),
    RIGHT_BACK("RB", Area.DEFENSE),
    DEFENSIVE_MIDFIELDER("DM", Area.DEFENSE),
    CENTRAL_MIDFIELDER("CM", Area.MIDFIELD),
    RIGHT_WING("RW", Area.MIDFIELD),
    LEFT_WING("LW", Area.MIDFIELD),
    OFFENSIVE_MIDFIELDER("OM", Area.OFFENSE),
    STRIKER("ST", Area.OFFENSE),
    OFFENSIVE_ALLROUNDER("OA", Area.OFFENSE),
    DEFENSIVE_ALLROUNDER("DA", Area.DEFENSE);

    public enum Area {
        GOAL, DEFENSE, MIDFIELD, OFFENSE
    }
    private final String abbreviation;
    private final Area area;

    Position(String abbreviation, Area area) {
        this.abbreviation = abbreviation;
        this.area = area;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public Area getArea() {
        return this.area;
    }

}
