import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kickmanager.league.TacklingDuel;

import java.util.List;

public class TacklingDuelTest {
    private final TacklingDuel tacklingDuel = new TacklingDuel();

    @Test
    public void testSimulate() throws InterruptedException {
        //arrange
        List<Integer> testHomeStats = List.of(8, 10, 12);
        List<Integer> testAwayStats = List.of(0, 0, 0);

        //act
        boolean actualHomeTeamWins = tacklingDuel.simulate(testHomeStats, testAwayStats);

        //assert
        Assertions.assertTrue(actualHomeTeamWins);
    }
}
