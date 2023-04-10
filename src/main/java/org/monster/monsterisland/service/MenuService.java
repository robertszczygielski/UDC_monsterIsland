package org.monster.monsterisland.service;

import java.util.Scanner;

public class MenuService {

    public String showMenu() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose 'x' to exit: ");

        return keyboard.nextLine().toUpperCase();
    }

}
