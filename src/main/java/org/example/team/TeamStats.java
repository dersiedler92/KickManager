package org.example.team;
import lombok.Data;

import java.util.Random;

@Data
public class TeamStats {
    private int harmony;
    private int mentality;
    private int tacticalUnderstanding;
    private int fanSupport;
    private int pressing;
    private int selfConfidence;
    private int offensiveness;
    private int defensiveness;
    private int form;
    private int atmosphere;

    public TeamStats(int harmony, int mentality, int tacticalUnderstanding, int fanSupport, int pressing,
                     int selfConfidence, int offensiveness, int defensiveness, int form, int atmosphere) {
        this.harmony = harmony;
        this.mentality = mentality;
        this.tacticalUnderstanding = tacticalUnderstanding;
        this.fanSupport = fanSupport;
        this.pressing = pressing;
        this.selfConfidence = selfConfidence;
        this.offensiveness = offensiveness;
        this.defensiveness = defensiveness;
        this.form = form;
        this.atmosphere = atmosphere;
    }

    public TeamStats() {

    }

    public void statGeneration() {
        // This method initiates the stats of a team. In contrast to player stats, teams stats only range from 1 to 10.
        Random random = new Random();
        this.harmony = random.nextInt(1, 10);
        this.mentality = random.nextInt(1, 10);
        this.tacticalUnderstanding = random.nextInt(1, 10);
        this.fanSupport = random.nextInt(1, 10);
        this.pressing = random.nextInt(1, 10);
        this.selfConfidence = random.nextInt(1, 10);
        this.offensiveness = random.nextInt(1, 10);
        this.defensiveness = random.nextInt(1, 10);
        this.form = random.nextInt(1, 10);
        this.atmosphere = random.nextInt(1, 10);
    }

}
