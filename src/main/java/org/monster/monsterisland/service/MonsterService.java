package org.monster.monsterisland.service;

import org.monster.monsterisland.configuration.MonsterConfiguration;
import org.monster.monsterisland.dto.Monster;

import java.util.List;
import java.util.Scanner;

public class MonsterService {

    private MonsterConfiguration monsterConfiguration = new MonsterConfiguration();

    public Monster pickupMonster() {
        List<Monster> monsters = monsterConfiguration.getAllMonster();

        for(int i = 0; i < monsters.size(); i++) {
            System.out.println(i +") ");
            System.out.println(monsters.get(i));
        }

        Scanner keyboard = new Scanner(System.in);

        System.out.println();
        System.out.println("Pickup your Monster: ");
        int playerChoice = keyboard.nextInt();

        return monsters.get(playerChoice);
    }

}
