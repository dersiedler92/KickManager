package org.kickmanager;

import org.kickmanager.league.League;
import org.kickmanager.league.Match;
import org.kickmanager.player.PlayerGeneration;
import org.kickmanager.team.Team;
import org.kickmanager.team.TeamGeneration;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main {
    private static final PlayerGeneration playerGeneration = new PlayerGeneration();
    private static final TeamGeneration teamGeneration = new TeamGeneration();

    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        init();
//        JFrame frame = new JFrame("Test");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
//        mainPanel.add(buttonPanel);
//        JButton button1 = new JButton("Hello");
//        buttonPanel.add(button1);
//        JButton button2 = new JButton("Sup");
//        buttonPanel.add(button2);
//
//        JPanel cardPanel1 = new JPanel(new CardLayout());
//        cardPanel1.setSize(500, 500);
//        ImageIcon icon = new ImageIcon("src/main/resources/images/auroras.png");
//        JLabel label1 = new JLabel(icon);
//        cardPanel1.add(label1);
//        mainPanel.add(cardPanel1);
//
//        frame.setContentPane(mainPanel);
//        frame.pack();
//        frame.setVisible(true);
    }

    public static void init() throws InterruptedException {
        League germanSuperLeague = new League(1, Nationality.GERMAN, List.of());
        List<Team> superLeagueTeams = teamGeneration.generateTeams();
        playerGeneration.generateRandomPlayers(superLeagueTeams);
        germanSuperLeague.setTeams(superLeagueTeams);
        Match match = new Match();
        match.playMatch(germanSuperLeague.getTeams().get(0), germanSuperLeague.getTeams().get(1));
    }

}
