package org.monster.monsterisland;

import org.monster.monsterisland.service.GameService;

//@SpringBootApplication
public class MonsterislandApplication {

    public static void main(String[] args) {
        GameService gameService = new GameService();

        for (; ; ) {
            boolean playing = gameService.play();
            if (!playing) break;
        }
    }

//	public static void main(String[] args) {
//		SpringApplication.run(MonsterislandApplication.class, args);
//	}

}
