package org.kickmanager.league;

import org.kickmanager.Nationality;
import org.kickmanager.team.Team;

import java.util.List;

public class League {

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

    public int getTier() {
        return tier;
    }

    public Nationality getNation() {
        return nation;
    }

    public List<Team> getTeams() {
        return teams;
    }

}
