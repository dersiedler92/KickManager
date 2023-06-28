package org.kickmanager.league;

import lombok.Data;
import org.kickmanager.player.Player;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tile {
    private int side;
    private int zone;
    private List<Player> homePlayers;
    private List<Player> awayPlayers;
    private List<Neighbor> neighbors;

    public Tile(int side, int zone) {
        this.side = side;
        this.zone = zone;
        this.neighbors = getNeighbors(this);
    }

    public Tile(int side, int zone, List<Player> playersOnTile) {
        this.side = side;
        this.zone = zone;
        this.homePlayers = playersOnTile;
        this.neighbors = getNeighbors(this);
    }

    public List<Neighbor> getNeighbors(Tile tile) {
        List<Neighbor> neighbors = new ArrayList<>();
        int tileSide = tile.getSide();
        int tileZone = tile.getZone();

        switch (tileSide) {
            case 1 -> neighbors.add(new Neighbor(Neighbor.Direction.RIGHT, tileSide + 1, tileZone));
            case 2 -> {
                neighbors.add(new Neighbor(Neighbor.Direction.LEFT, tileSide - 1, tileZone));
                neighbors.add(new Neighbor(Neighbor.Direction.RIGHT, tileSide + 1, tileZone));
            }
            case 3 -> neighbors.add(new Neighbor(Neighbor.Direction.LEFT, tileSide - 1, tileZone));
        }

        switch (tileZone) {
            case 1 -> neighbors.add(new Neighbor(Neighbor.Direction.FRONT, tileSide, tileZone + 1));
            case 2, 3, 4 -> {
                neighbors.add(new Neighbor(Neighbor.Direction.FRONT, tileSide, tileZone + 1));
                neighbors.add(new Neighbor(Neighbor.Direction.BACK, tileSide, tileZone - 1));
            }
            case 5 -> neighbors.add(new Neighbor(Neighbor.Direction.BACK, tileSide, tileZone - 1));
        }

        return neighbors;
    }
}
