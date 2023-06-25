package org.kickmanager;

import org.kickmanager.league.League;
import org.kickmanager.player.PlayerGeneration;
import org.kickmanager.team.Team;
import org.kickmanager.team.TeamGeneration;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    private static final PlayerGeneration playerGeneration = new PlayerGeneration();
    private static final TeamGeneration teamGeneration = new TeamGeneration();

    private JPanel mainPanel;
    private JPanel parentPanel;
    private JPanel buttonPanel;
    private JButton button1;
    private JButton button2;
    private JPanel card1;
    private JPanel card2;
    private JLabel label1;
    private JLabel label2;

    public Main() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(card1);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(card2);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
    }

    public static void main(String[] args) {
        init();
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new Main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void init() {
        League germanSuperLeague = new League(1, Nationality.GERMAN, List.of());
        List<Team> superLeagueTeams = teamGeneration.generateTeams();
        playerGeneration.generateRandomPlayers(superLeagueTeams);
        germanSuperLeague.setTeams(superLeagueTeams);
    }

    private void createUIComponents() throws IOException {
        BufferedImage image1 = ImageIO.read(new File("src/main/resources/images/auroras.png"));
        BufferedImage image2 = ImageIO.read(new File("src/main/resources/images/bears.png"));
        label1 = new JLabel(new ImageIcon(image1));
        label2 = new JLabel(new ImageIcon(image2));
    }
}
