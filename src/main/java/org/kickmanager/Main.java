package org.kickmanager;

import org.kickmanager.league.League;
import org.kickmanager.player.PlayerGeneration;
import org.kickmanager.team.Team;
import org.kickmanager.team.TeamGeneration;

import java.util.List;

public class Main {

    private static final PlayerGeneration playerGeneration = new PlayerGeneration();
    private static final TeamGeneration teamGeneration = new TeamGeneration();

    public static void main(String[] args) {
        System.out.println("Welcome to the Kick Manager 2023!");
        System.out.println("This game attempts to expand the football managing games market.");
        System.out.println("Have fun!");
        init();
    }

    public static void init() {
        League germanSuperLeague = new League(1, Nationality.GERMAN, List.of());
        List<Team> superLeagueTeams = teamGeneration.generateTeams();
        playerGeneration.generateRandomPlayers(superLeagueTeams);
        germanSuperLeague.setTeams(superLeagueTeams);
    }

}
