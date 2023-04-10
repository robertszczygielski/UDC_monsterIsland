package org.monster.monsterisland.configuration;

import org.monster.monsterisland.dto.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MonsterConfiguration {

    private List<Monster> allMonster = new ArrayList<Monster>();

    public MonsterConfiguration() {
        this.allMonster.add(new Monster(UUID.randomUUID(), "Bit Ant"));
        this.allMonster.add(new Monster(UUID.randomUUID(), "Small Ant"));
        this.allMonster.add(new Monster(UUID.fromString("947b196e-065e-4ab2-b49a-3da2a85e7db3"), "Small Gorilla"));
    }

    public List<Monster> getAllMonster() {
        return allMonster;
    }
}

