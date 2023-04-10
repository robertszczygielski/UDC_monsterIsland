package org.monster.monsterisland.service;

import org.monster.monsterisland.configuration.MonsterConfiguration;
import org.monster.monsterisland.dto.Monster;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MonsterService {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    private MonsterConfiguration monsterConfiguration = new MonsterConfiguration();

    public Monster pickupMonster(Monster playerMonster) {
        List<Monster> monsters = monsterConfiguration.getAllMonster();
        Random random = new Random();

        return monsters.stream()
                .filter(monster -> !monster.equals(playerMonster))
                .toList().get(random.nextInt(monsters.size() - 1));
    }

    public Monster pickupMonster() {
        List<Monster> monsters = monsterConfiguration.getAllMonster();

        for(int i = 0; i < monsters.size(); i++) {
            System.out.print(ANSI_RED + i +") " + ANSI_RESET);
            System.out.println(monsters.get(i));
        }

        Scanner keyboard = new Scanner(System.in);

        System.out.println();
        System.out.println("Pickup your Monster: ");
        int playerChoice = keyboard.nextInt();

        return monsters.get(playerChoice);
    }
}
