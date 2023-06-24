package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private static final NameGenerator nameGenerator = new NameGenerator();

    public static void main(String[] args) {
        System.out.println("Welcome to the Kick Manager 2023!");
        System.out.println("This game attempts to expand the football managing games market.");
        System.out.println("Have fun!");
        init();
    }

    public static void init() {
        League deutscheSuperliga = new League(1, Nationality.GERMAN, List.of());
        Team teamBerlin = new Team("Bären Berlin", "Berlin", List.of(), null);
        Team teamHamburg = new Team("Hamburger Albatrosse", "Hamburg", List.of(), null);
        Team teamMuenchen = new Team("Münchner Alpenkicker", "München", List.of(), null);
        Team teamKoeln = new Team("Karneval Köln", "Köln", List.of(), null);
        Team teamFrankfurt = new Team("FFM Eurobankers", "Frankfurt am Main", List.of(), null);
        Team teamStuttgart = new Team("Schwabenpower Stuttgart", "Stuttgart", List.of(), null);
        Team teamDuesseldorf = new Team("Rheinlandball Düsseldorf", "Düsseldorf", List.of(), null);
        Team teamLeipzig = new Team("Ostblock Leipzig", "Leipzig", List.of(), null);
        Team teamDortmund = new Team("Dortmunder Malocher", "Dortmund", List.of(), null);
        Team teamEssen = new Team("Siegeshunger Essen", "Essen", List.of(), null);
        Team teamBremen = new Team("Bremer Mattrosen", "Bremen", List.of(), null);
        Team teamDresden = new Team("Karl Marx Dresden", "Dresden", List.of(), null);
        Team teamHannover = new Team("Nordlichter Hannover", "Hannover", List.of(), null);
        Team teamNuernberg = new Team("Franconia Nürnberg", "Nürnberg", List.of(), null);
        Team teamDuisburg = new Team("Duisburg Migrantenkinder", "Duisburg", List.of(), null);
        List<Team> superligaTeams = List.of(teamBerlin, teamHamburg, teamMuenchen, teamKoeln, teamFrankfurt,
                teamStuttgart, teamDuesseldorf, teamLeipzig, teamDortmund, teamEssen, teamBremen, teamDresden,
                teamHannover, teamNuernberg, teamDuisburg);

        String namesPath = "src/main/resources/names.csv";
        String surnamesPath = "src/main/resources/surnames.txt";
        Random random = new Random();

        for (Team team : superligaTeams) {
            List<Player> randomPlayers = new ArrayList<>();
            for (int i = 0; i < 11; i++) {
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
                        randomName, randomBirthDate, randomHeight, randomWeight, Nationality.GERMAN, null
                ));
            }
            for (Player player : randomPlayers) {
                System.out.println("Name: " + player.getName());
                System.out.println("Geburtsdatum: " + player.getBirthDate().toString());
                System.out.println("Größe: " + player.getHeight() + " m");
                System.out.println("Gewicht: " + player.getWeight() + " kg\n");
            }
            team.setPlayers(randomPlayers);
        }
        deutscheSuperliga.setTeams(superligaTeams);
    }

}
