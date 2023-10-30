package com.challenge.app.pokebattle.controller;

import com.challenge.app.pokebattle.entity.BattleEntity;
import com.challenge.app.pokebattle.service.BattleService;
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
    @Autowired
    public PokemonBattleController(BattleService battleService) {
        this.battleService = battleService;
    }

    @GetMapping("/create")
    public ResponseEntity<Map<String, String>> createBattle() throws Exception {
        Map<String, String> battle = this.battleService.create();
        if (!battle.isEmpty()){
            return ResponseEntity.ok(battle);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/find-all-battles")
    public ResponseEntity<List<BattleEntity>> findAllBattles() throws Exception {
        List<BattleEntity> getAllBattles = this.battleService.findAllBattles();
        if (!getAllBattles.isEmpty()){
            return ResponseEntity.ok(getAllBattles);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/find-by-id")
    public ResponseEntity<Optional<BattleEntity>> findById(@RequestParam("id") Long id) throws Exception {
        Optional<BattleEntity> getPokemon = this.battleService.findById(id);
        if (getPokemon.isPresent()) {
            return ResponseEntity.ok(getPokemon);
        }
        return ResponseEntity.notFound().build();
    }

}
