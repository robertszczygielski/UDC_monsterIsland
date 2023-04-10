package org.monster.monsterisland;

import org.monster.monsterisland.dto.Monster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

//@SpringBootApplication
public class MonsterislandApplication {

	public static void main(String[] args) {
		Monster monster = new Monster(UUID.randomUUID(), "BigAnt");

		System.out.println(monster);
	}

//	public static void main(String[] args) {
//		SpringApplication.run(MonsterislandApplication.class, args);
//	}

}
