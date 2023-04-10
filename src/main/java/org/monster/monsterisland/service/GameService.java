package org.monster.monsterisland.service;

import org.monster.monsterisland.dto.Monster;

public class GameService {

    private MonsterService monsterService = new MonsterService();
    private MenuService menuService = new MenuService();

    private Monster playerMonster;

    public boolean play() {
        this.playerMonster = monsterService.pickupMonster();
        String playerChoice = menuService.showMenu();

        System.out.println("Your choose: " + this.playerMonster);

        if (playerChoice.equals("X")) return false;

        return true;
    }

}
