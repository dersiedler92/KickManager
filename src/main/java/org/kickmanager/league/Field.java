package org.kickmanager.league;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<Tile> tiles;

    public Field() {
        for (int ver = 0; ver < 5; ver++) {
            for (int hor = 0; hor < 3; hor++) {
                tiles = new ArrayList<>();
                tiles.add(new Tile(hor+1, ver+1));
            }
        }
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(List<Tile> tiles) {
        this.tiles = tiles;
    }

}
