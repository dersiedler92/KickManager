package org.kickmanager.league;

import org.kickmanager.player.Player;
import org.kickmanager.player.PlayerStats;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TacklingDuel extends Duel {

    @Override
    public void startDuel(Tile tile) throws InterruptedException {
        List<Player> homePlayers = tile.getHomePlayers();
        List<Player> awayPlayers = tile.getAwayPlayers();
        List<PlayerStats> homeStats = homePlayers.stream().map(Player::getPlayerStats).toList();
        List<PlayerStats> awayStats = awayPlayers.stream().map(Player::getPlayerStats).toList();
        List<Integer> relevantHomeStats = new ArrayList<>();
        List<Integer> relevantAwayStats = new ArrayList<>();
        relevantHomeStats.add(homeStats.stream().map(PlayerStats::getTackle).mapToInt(Integer::intValue).sum());
        relevantHomeStats.add(homeStats.stream().map(PlayerStats::getPhysique).mapToInt(Integer::intValue).sum());
        relevantHomeStats.add(homeStats.stream().map(PlayerStats::getAggressiveness).mapToInt(Integer::intValue).sum());
        relevantAwayStats.add(awayStats.stream().map(PlayerStats::getTackle).mapToInt(Integer::intValue).sum());
        relevantAwayStats.add(awayStats.stream().map(PlayerStats::getPhysique).mapToInt(Integer::intValue).sum());
        relevantAwayStats.add(awayStats.stream().map(PlayerStats::getAggressiveness).mapToInt(Integer::intValue).sum());

        String homeTeam = homePlayers.get(0).getTeamBelonging();
        String awayTeam = awayPlayers.get(0).getTeamBelonging();

        System.out.printf("A tackling duel between %s players of %s and %s players of %s" +
                        "is starting!%n", homePlayers.size(), homeTeam, awayPlayers.size(), awayTeam);
        Thread.sleep(3000);
        System.out.printf("The total tackling of %s amounts to %s, while %s provides a total value of %s.%n",
                homeTeam, relevantHomeStats.get(0), awayTeam, relevantHomeStats.get(0));
        Thread.sleep(3000);
        System.out.printf("The physique adds up to %s and %s!%n", relevantHomeStats.get(1), relevantAwayStats.get(1));
        Thread.sleep(3000);
        System.out.printf("Finally, the aggressiveness is %s and %s.%n", relevantHomeStats.get(2),
                relevantAwayStats.get(2));
        System.out.println("Let's see how the duel plays out!");
        Thread.sleep(3000);
        boolean homeTeamWins = simulate(relevantHomeStats, relevantAwayStats);
        if (homeTeamWins) {
            //TODO continue from here
        }
    }

    @Override
    public boolean simulate(List<Integer> relevantHomeStats, List<Integer> relevantAwayStats) throws InterruptedException {
        /*
          The tackling duel is separated into three sub-duels. The collective values of the home and away teams
          influence the probability of losing or winning. The team winning two out of three duels wins the tackling
          duel.
         */
        Random random = new Random();
        int homeTackling = relevantHomeStats.get(0);
        int homePhysique = relevantHomeStats.get(1);
        int homeAggressiveness = relevantHomeStats.get(2);
        int awayTackling = relevantAwayStats.get(0);
        int awayPhysique = relevantAwayStats.get(1);
        int awayAggressiveness = relevantAwayStats.get(2);
        int homeScore = 0;
        int awayScore = 0;

        double homeTacklingRatio = (float) homeTackling / (homeTackling + awayTackling);
        double homePhysiqueRatio = (float) homePhysique / (homePhysique + awayPhysique);
        double homeAggressivenessRatio = (float) homeAggressiveness / (homeAggressiveness + awayAggressiveness);

        System.out.println("The tackling duel starts! And the winner is...");
        Thread.sleep(3000);
        double randomTacklingResult = random.nextDouble();
        if (randomTacklingResult < homeTacklingRatio) {
            homeScore++;
            System.out.printf("The home tackling ratio is %s while the result is %s.%n",
                    homeTacklingRatio, randomTacklingResult);
            System.out.printf("The home team wins!! The new score is %s - %s!%n", homeScore, awayScore);
        }
        else {
            awayScore++;
            System.out.printf("The home tackling ratio is %s while the result is %s.%n",
                    homeTacklingRatio, randomTacklingResult);
            System.out.printf("The away team wins!! The new score is %s - %s!%n", homeScore, awayScore);
        }
        Thread.sleep(3000);
        System.out.println("Let's see, how the physique duel plays out...");
        Thread.sleep(3000);
        double randomPhysiqueResult = random.nextDouble();
        if (randomPhysiqueResult < homePhysiqueRatio) {
            homeScore++;
            System.out.printf("The home physique ratio is %s while the result is %s.%n",
                    homePhysiqueRatio, randomPhysiqueResult);
            System.out.printf("The home team wins!! The new score is %s - %s!%n", homeScore, awayScore);
        }
        else {
            awayScore++;
            System.out.printf("The home physique ratio is %s while the result is %s.%n",
                    homePhysiqueRatio, randomPhysiqueResult);
            System.out.printf("The away team wins!! The new score is %s - %s!%n", homeScore, awayScore);
        }
        Thread.sleep(3000);
        System.out.println("And finally, the aggressiveness duel...");
        Thread.sleep(3000);
        double randomAggressivenessResult = random.nextDouble();
        if (randomAggressivenessResult < homeAggressivenessRatio) {
            homeScore++;
            System.out.printf("The home aggressiveness ratio is %s while the result is %s.%n",
                    homeAggressivenessRatio, randomAggressivenessResult);
            System.out.printf("So the home team wins!! The new score is %s - %s!%n", homeScore, awayScore);
        }
        else {
            awayScore++;
            System.out.printf("The home aggressiveness ratio is %s while the result is %s.%n",
                    homeAggressivenessRatio, randomAggressivenessResult);
            System.out.printf("The away team wins!! The new score is %s - %s!%n", homeScore, awayScore);
        }
        Thread.sleep(3000);
        if (homeScore > awayScore) {
            System.out.printf("The overall score is %s - %s means that the home team wins!%n", homeScore, awayScore);
            return true;
        }
        else {
            System.out.printf("The overall score is %s - %s means that the away team wins!%n", homeScore, awayScore);
            return false;
        }
    }

}
