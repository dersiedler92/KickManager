package org.example;
import lombok.Data;

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

    public TeamStats(int harmony, int mentality, int tacticalUnderstanding, int fanSupport, int pressing, int selfConfidence, int offensiveness, int defensiveness, int form, int atmosphere) {
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

}
