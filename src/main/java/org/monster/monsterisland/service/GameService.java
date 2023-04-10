package org.monster.monsterisland.service;

import org.monster.monsterisland.configuration.MonsterConfiguration;
import org.monster.monsterisland.dto.Monster;

import java.util.List;

public class GameService {

    public boolean play() {
        MonsterConfiguration monsterConfiguration = new MonsterConfiguration();
        MenuService menuService = new MenuService();
        List<Monster> monsterList = monsterConfiguration.getAllMonster();

        monsterList.forEach(monster -> System.out.println(monster));

        String playerChoice = menuService.showMenu();

        if (playerChoice.equals("X")) return false;

        return true;
    }

}
