package org.example.league;

import org.example.Nationality;
import org.example.team.Team;

import java.util.List;

public class League {
    public int getTier() {
        return tier;
    }

    public Nationality getNation() {
        return nation;
    }

    public List<Team> getTeams() {
        return teams;
    }

    private final int tier;
    private final Nationality nation;
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
