package org.kickmanager.player;

import org.kickmanager.Nationality;
import org.kickmanager.team.Team;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class PlayerGeneration {
    private final NameGenerator nameGenerator = new NameGenerator();

    public void generateRandomPlayers(List<Team> superLeagueTeams) {
        String namesPath = "src/main/resources/names.csv";
        String surnamesPath = "src/main/resources/surnames.txt";
        Random random = new Random();
        for (Team team : superLeagueTeams) {
            List<Player> randomPlayers = new ArrayList<>();
            for (int i = 0; i < 18; i++) {
                String randomName = nameGenerator.generateRandomName(namesPath, surnamesPath);
                double randomHeight = Math.round(random.nextGaussian(1.80, 0.06)*100)/100.0;
                double randomWeight = Math.round(random.nextGaussian(75, 3)*10)/10.0;
                int randomBirthYear = random.nextInt(1988, 2005);
                int randomBirthMonth = random.nextInt(1, 12);
                int randomBirthDay;
                if (randomBirthMonth % 2 == 1) {
                    randomBirthDay = random.nextInt(1, 31);
                } else if (randomBirthMonth == 2 && randomBirthYear % 4 == 0) {
                    randomBirthDay = random.nextInt(1, 29);
                } else if (randomBirthMonth == 2) {
                    randomBirthDay = random.nextInt(1, 28);
                } else {
                    randomBirthDay = random.nextInt(1, 30);
                }
                LocalDate randomBirthDate = LocalDate.of(randomBirthYear, randomBirthMonth, randomBirthDay);

                randomPlayers.add(new Player(
                        randomName, randomBirthDate, randomHeight, randomWeight, Nationality.GERMAN, null,
                        null, null, 0, team.getName()
                ));
            }
            randomPlayers.sort(Comparator.comparing(Player::getHeight).reversed());
            List<Position> positions = generateTeamPositions();
            for (int i = 0; i < 18; i++) {
                randomPlayers.get(i).setPosition(positions.get(i));
                Position position = randomPlayers.get(i).getPosition();
                if (position.equals(Position.GOALKEEPER)) {
                    randomPlayers.get(i).setGoalieStats(new GoalieStats());
                    randomPlayers.get(i).getGoalieStats().statGeneration();
                }
                else {
                    randomPlayers.get(i).setPlayerStats(new PlayerStats());
                    randomPlayers.get(i).getPlayerStats().statGeneration(position);
                }
                randomPlayers.get(i).setJerseyNumber(i+1);
            }
            for (Player player : randomPlayers) {
                System.out.println("Jersey number: " + player.getJerseyNumber());
                System.out.println("Name: " + player.getName());
                System.out.println("Geburtsdatum: " + player.getBirthDate().toString());
                System.out.println("Größe: " + player.getHeight() + " m");
                System.out.println("Gewicht: " + player.getWeight() + " kg");
                System.out.println("Position: " + player.getPosition().getAbbreviation());
                if (player.getPlayerStats() != null) {
                    System.out.println("Stats: " + player.getPlayerStats());
                    System.out.println("Durchschnittswertung: " + player.getPlayerStats().getAverageRating() + "\n");
                }
                else {
                    System.out.println("Stats: " + player.getGoalieStats());
                    System.out.println("Durchschnittswertung: " + player.getGoalieStats().getAverageRating() + "\n");
                }
            }
            team.setPlayers(randomPlayers);
        }
    }

    public static List<Position> generateTeamPositions() {
        return List.of(
                Position.GOALKEEPER,
                Position.GOALKEEPER,
                Position.CENTER_BACK,
                Position.CENTER_BACK,
                Position.CENTER_BACK,
                Position.DEFENSIVE_MIDFIELDER,
                Position.STRIKER,
                Position.DEFENSIVE_ALLROUNDER,
                Position.STRIKER,
                Position.CENTRAL_MIDFIELDER,
                Position.DEFENSIVE_MIDFIELDER,
                Position.CENTRAL_MIDFIELDER,
                Position.OFFENSIVE_MIDFIELDER,
                Position.RIGHT_WING,
                Position.LEFT_WING,
                Position.LEFT_BACK,
                Position.RIGHT_BACK,
                Position.OFFENSIVE_ALLROUNDER
        );
    }
}
