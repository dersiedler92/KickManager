package org.kickmanager.league;

import java.util.List;

public abstract class Duel {

    public abstract void startDuel(Tile tile) throws InterruptedException;

    public abstract boolean simulate(List<Integer> relevantHomeStats, List<Integer> relevantAwayStats)
            throws InterruptedException;

}
