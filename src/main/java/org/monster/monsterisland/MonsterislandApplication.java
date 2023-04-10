package org.monster.monsterisland;

import org.monster.monsterisland.configuration.MonsterConfiguration;
import org.monster.monsterisland.dto.Monster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.UUID;

//@SpringBootApplication
public class MonsterislandApplication {

	public static void main(String[] args) {
		MonsterConfiguration monsterConfiguration = new MonsterConfiguration();
		List<Monster> monsterList = monsterConfiguration.getAllMonster();

		for(Monster monster: monsterList) {
			System.out.println(monster);
		}
	}

//	public static void main(String[] args) {
//		SpringApplication.run(MonsterislandApplication.class, args);
//	}

}
