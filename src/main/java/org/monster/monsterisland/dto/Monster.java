package org.monster.monsterisland.dto;

import java.util.UUID;

public class Monster {

    private UUID id;
    private String name;
    private Integer healthPoints;
    private Integer victoryPoints;
    private Integer energy;

    public Monster(UUID id,
                   String name) {
        this.id = id;
        this.name = name;
        this.healthPoints = 10;
        this.victoryPoints = 0;
        this.energy = 0;
    }
}
