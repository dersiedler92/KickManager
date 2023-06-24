package org.example;

import java.util.List;

public class League {
    private int tier;
    private Nationality nation;
    private List<Team> teams;

    public League(int tier, Nationality nation, List<Team> teams) {
        this.tier = tier;
        this.nation = nation;
        this.teams = teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
