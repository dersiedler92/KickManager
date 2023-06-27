package org.kickmanager.league;

import com.google.common.base.Stopwatch;
import org.kickmanager.player.Player;
import org.kickmanager.team.Team;

import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Match {

    public Match() {}

    public void playMatch(Team team1, Team team2) throws InterruptedException {
        Optional<Player> playerOpt1 = team1.getPlayers().stream().max(Comparator.comparing(p ->
                p.getPlayerStats() != null ? p.getPlayerStats().getAverageRating()
                        : p.getGoalieStats().getAverageRating()));
        Optional<Player> playerOpt2 = team2.getPlayers().stream().max(Comparator.comparing(p ->
                p.getPlayerStats() != null ? p.getPlayerStats().getAverageRating()
                        : p.getGoalieStats().getAverageRating()));
        if (playerOpt1.isEmpty() || playerOpt2.isEmpty()) {
            System.out.println("Match is aborted as either team 1 or team 2 have no valid players.");
            return;
        }
        System.out.println("Das Match zwischen " + team1.getName() + " und " + team2.getName() + " beginnt!");
        Thread.sleep(2000);
        System.out.println("Beide Teams sind gewillt, hier ein gutes Spiel abzuliefern!");
        Thread.sleep(2000);
        System.out.println("Möge das bessere Team gewinnen!");
        Thread.sleep(2000);
        System.out.println("Der Schiedsrichter entscheidet über den Anstoß. Eine Münze wird geworfen. Und den" +
                " Anstoß führt...");
        Thread.sleep(2000);
        Random random = new Random();
        boolean team1HasKickOff = random.nextBoolean();
        Team ballPossessingTeam;
        if (team1HasKickOff) {
            ballPossessingTeam = team1;
            System.out.println("...Team 1 aus!");
        }
        else {
            ballPossessingTeam = team2;
            System.out.println("...tatsächlich Team 2 aus!");
        }
        Thread.sleep(2000);
        System.out.println("In Kürze ertönt der Anstoss-Pfiff...");
        Thread.sleep(2000);
        System.out.println("...Anstoss!");
        Stopwatch stopwatch = Stopwatch.createStarted();
        Thread.sleep(2000);
        System.out.println("Team " + ballPossessingTeam.getName() + " versucht den ersten Angriff auszuführen...");
        Thread.sleep(2000);
        System.out.println("UND TOOOOOOOOR!!!!");
        stopwatch.stop();
        long millis = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("The match took: " + stopwatch);
    }

    public void midFieldScenario() {

    }

    public void attackingScenario() {

    }

    public void teamDuel() {

    }

    public void playerDuel(Player player1, Player player2) {

    }
}
