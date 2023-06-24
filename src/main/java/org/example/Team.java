package org.example;

import java.util.List;

public class Team {
    private String name;
    private String location;
    private List<Player> players;
    private TeamStats stats;

    public Team(String name, String location, List<Player> players, TeamStats stats) {
        this.name = name;
        this.location = location;
        this.players = players;
        this.stats = stats;
    }
}
