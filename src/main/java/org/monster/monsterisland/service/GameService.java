package org.monster.monsterisland.service;

import org.monster.monsterisland.dto.Monster;

public class GameService {

    private MonsterService monsterService = new MonsterService();
    private MenuService menuService = new MenuService();

    private Monster playerMonster;
    private Monster enemyMonster;

    public boolean play() {
        this.playerMonster = monsterService.pickupMonster();
        this.enemyMonster = monsterService.pickupMonster(this.playerMonster);

        System.out.println("Your choose: " + this.playerMonster);
        System.out.println();
        System.out.println("Enemy choose: " + this.enemyMonster);

        String playerChoice = menuService.showMenu();
        if (playerChoice.equals("X")) return false;

        return true;
    }

}
