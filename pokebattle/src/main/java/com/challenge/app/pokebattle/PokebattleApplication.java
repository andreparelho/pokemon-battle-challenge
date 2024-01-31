package com.challenge.app.pokebattle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokebattleApplication {
    private static final Logger logger = LoggerFactory.getLogger(PokebattleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PokebattleApplication.class, args);
        logger.info("spring application initialized with success");
    }
}
