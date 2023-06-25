package org.kickmanager.team;

import java.util.List;

public class TeamGeneration {
    public List<Team> generateTeams() {
        Team teamBerlin = new Team("Berlin Bears", "Berlin", List.of(), new TeamStats());
        Team teamHamburg = new Team("Hamburger Albatrosse", "Hamburg", List.of(), new TeamStats());
        Team teamMuenchen = new Team("Münchner Alpenkicker", "München", List.of(), new TeamStats());
        Team teamKoeln = new Team("Karneval Köln", "Köln", List.of(), new TeamStats());
        Team teamFrankfurt = new Team("Euroballers FFM", "Frankfurt am Main", List.of(), new TeamStats());
        Team teamStuttgart = new Team("Schwabenpower Stuttgart", "Stuttgart", List.of(), new TeamStats());
        Team teamDuesseldorf = new Team("Rheinball Düsseldorf", "Düsseldorf", List.of(), new TeamStats());
        Team teamLeipzig = new Team("Ostblock Leipzig", "Leipzig", List.of(), new TeamStats());
        Team teamDortmund = new Team("Dortmunder Malocher", "Dortmund", List.of(), new TeamStats());
        Team teamEssen = new Team("Siegeshunger Essen", "Essen", List.of(), new TeamStats());
        Team teamBremen = new Team("Bremer Mattrosen", "Bremen", List.of(), new TeamStats());
        Team teamDresden = new Team("Karl-Marx Dresden", "Dresden", List.of(), new TeamStats());
        Team teamHannover = new Team("Nordlichter Hannover", "Hannover", List.of(), new TeamStats());
        Team teamNuernberg = new Team("Franconia Nürnberg", "Nürnberg", List.of(), new TeamStats());
        Team teamDuisburg = new Team("Duisburg Migrantenkinder", "Duisburg", List.of(), new TeamStats());
        List<Team> superLeagueTeams = List.of(teamBerlin, teamHamburg, teamMuenchen, teamKoeln, teamFrankfurt,
                teamStuttgart, teamDuesseldorf, teamLeipzig, teamDortmund, teamEssen, teamBremen, teamDresden,
                teamHannover, teamNuernberg, teamDuisburg);
        for (Team team : superLeagueTeams) {
            team.getStats().statGeneration();
        }
        return superLeagueTeams;
    }
}
