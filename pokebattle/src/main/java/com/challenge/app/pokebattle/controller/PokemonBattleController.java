package com.challenge.app.pokebattle.controller;

import com.challenge.app.pokebattle.entity.BattleEntity;
import com.challenge.app.pokebattle.service.BattleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("pokemon")
public class PokemonBattleController {
    private final BattleService battleService;
    private static final Logger logger = LoggerFactory.getLogger(PokemonBattleController.class);

    @Autowired
    public PokemonBattleController(BattleService battleService) {
        this.battleService = battleService;
    }

    @GetMapping("/create")
    public ResponseEntity<Map<String, String>> createBattle() throws Exception {
        logger.info("endpoint /created call");

        Map<String, String> battle = this.battleService.create();
        if (!battle.isEmpty()){
            return ResponseEntity.ok(battle);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/find-all-battles")
    public ResponseEntity<List<BattleEntity>> findAllBattles() throws Exception {
        logger.info("endpoint /find-all-battles call");

        List<BattleEntity> getAllBattles = this.battleService.findAllBattles();
        if (!getAllBattles.isEmpty()){
            return ResponseEntity.ok(getAllBattles);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/find-by-id")
    public ResponseEntity<Optional<BattleEntity>> findById(@RequestParam("id") Long id) throws Exception {
        logger.info("endpoint /find-by-id call");

        Optional<BattleEntity> getPokemon = this.battleService.findById(id);
        if (getPokemon.isPresent()) {
            return ResponseEntity.ok(getPokemon);
        }
        return ResponseEntity.notFound().build();
    }

}
