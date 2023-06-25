package org.kickmanager.player;

import lombok.Data;

@Data
public class Name {
    private int amount;
    private String name;
    private String gender;

    public Name(int amount, String name, String gender) {
        this.amount = amount;
        this.name = name;
        this.gender = gender;
    }
}
