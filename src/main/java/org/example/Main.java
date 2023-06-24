package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Kick Manager 2023!");
        System.out.println("This game attempts to expand the football managing games market.");
        System.out.println("Have fun!");


        Thread.sleep(1000);
        System.out.println("Please choose a team: (a) FC");
    }

    public void init() {
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
    }

}
